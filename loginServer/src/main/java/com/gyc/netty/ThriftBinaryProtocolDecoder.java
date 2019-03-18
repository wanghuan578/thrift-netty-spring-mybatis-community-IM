package com.gyc.netty;

import java.util.List;

import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_ByteBuffer;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_MainStageHandler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class ThriftBinaryProtocolDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        // TODO Auto-generated method stub
        while (in.readableBytes() > 4) {
            
            int msg_len = in.readInt();
            SL_RPC_ByteBuffer receive_buffer = new SL_RPC_ByteBuffer(msg_len);
            receive_buffer.WriteI32(msg_len);
            
            ByteBuf buf = in.readBytes(msg_len);
            receive_buffer.WriteBinary(buf.array(), buf.array().length);
        
            out.add(receive_buffer);
//            SL_RPC_MainStageHandler main_stage = new SL_RPC_MainStageHandler(receive_buffer);
//            main_stage.Initialize();
//            main_stage.handle_message();
        }

        
    }

}
