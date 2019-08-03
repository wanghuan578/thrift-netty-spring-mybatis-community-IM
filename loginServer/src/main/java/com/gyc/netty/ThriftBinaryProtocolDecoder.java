package com.gyc.netty;

import java.util.List;

import com.gyc.thrift.socketserver.rpc.minicore.*;


import com.gyc.thrift.socketserver.rpc.thrift.ClientPasswordLoginReq;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

public class ThriftBinaryProtocolDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        // TODO Auto-generated method stub
        while (in.readableBytes() > 4) {
            
            int msg_len = in.readInt();
            SL_RPC_ByteBuffer event = new SL_RPC_ByteBuffer(msg_len);
            event.WriteI32(msg_len);
            
            ByteBuf buf = in.readBytes(msg_len - 4);
            //event.WriteBinary(buf.array(), msg_len - 4);
            for (int i = 0; i < msg_len - 4; i++) {
                event.WriteByte(buf.getByte(i));
            }

            SL_RPC_MainStageHandler mainStage = new SL_RPC_MainStageHandler(event);
            mainStage.Analysis();
            SL_RPC_CommHead header = mainStage.GetEventHead();

            switch (header.GetType()) {

                case SL_RPC_Seda_EventType.MT_RPC_SEDA_EVENT_LOGIN_REQ:
                    TProtocol protocol = new SL_RPC_Thrift_BinaryProtocol(event, SL_RPC_CommHead.Size(), (event.Length() - SL_RPC_CommHead.Size()));

                    ClientPasswordLoginReq passwdLogin = new ClientPasswordLoginReq();

                    try
                    {
                        passwdLogin.read(protocol);
                    }
                    catch (TException e)
                    {
                        e.printStackTrace();
                    }
                    out.add(passwdLogin);
                    break;

            }



//            SL_RPC_MainStageHandler main_stage = new SL_RPC_MainStageHandler(receive_buffer);
//            main_stage.Initialize();
//            main_stage.handle_message();
        }

        
    }

}
