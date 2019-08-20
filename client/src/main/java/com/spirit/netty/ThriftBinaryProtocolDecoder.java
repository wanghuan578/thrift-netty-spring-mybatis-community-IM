package com.spirit.netty;

import java.util.List;

import com.spirit.thrift.socketserver.rpc.thrift.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import com.alibaba.fastjson.JSON;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_ByteBuffer;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_CommHead;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_MainStageHandler;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_Seda_EventType;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_Thrift_BinaryProtocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class ThriftBinaryProtocolDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        // TODO Auto-generated method stub
    	//int index = in.readableBytes();
        while (in.readableBytes() > 4) {
            
        	in.markReaderIndex();
        	
            int msg_len = in.readInt();
            SL_RPC_ByteBuffer event = new SL_RPC_ByteBuffer(msg_len);
            event.WriteI32(msg_len);
            //index -= msg_len;
            //System.out.println("index len: " + index);
            ByteBuf buf = in.readBytes(msg_len - 4);

            for (int i = 0; i < msg_len - 4; i++) {
            	event.WriteByte(buf.getByte(i));
            }
            
            SL_RPC_MainStageHandler mainStage = new SL_RPC_MainStageHandler(event);
            mainStage.Analysis();
            SL_RPC_CommHead header = mainStage.GetEventHead();
            
            switch (header.GetType()) {
            

            case RpcEventType.MT_COMMON_HELLO_NOTIFY:
            {
            	TProtocol protocol = new SL_RPC_Thrift_BinaryProtocol(event, SL_RPC_CommHead.Size(), (event.Length() - SL_RPC_CommHead.Size()));
            	HelloNotify hello_notify = new HelloNotify();
                
                try
                {
                	hello_notify.read(protocol);
                } 
                catch (TException e) 
                {
                    e.printStackTrace();
                }
                
                //System.out.println(JSON.toJSONString(login));
                
                out.add(hello_notify);

            }
            	break;
            	
            case RpcEventType.MT_CLIENT_LOGIN_RES:
            {
            	TProtocol protocol = new SL_RPC_Thrift_BinaryProtocol(event, SL_RPC_CommHead.Size(), (event.Length() - SL_RPC_CommHead.Size()));
            	ClientLoginRes loginResp = new ClientLoginRes();
                
                try
                {
                	loginResp.read(protocol);
                } 
                catch (TException e) 
                {
                    e.printStackTrace();
                }
                
                System.out.println(JSON.toJSONString(loginResp));
                
                out.add(loginResp);

            }
            	break;

            case RpcEventType.MT_SERVICE_REGISTER_RES:
            {
                TProtocol protocol = new SL_RPC_Thrift_BinaryProtocol(event, SL_RPC_CommHead.Size(), (event.Length() - SL_RPC_CommHead.Size()));
                ServiceRegisterRes regist_res = new ServiceRegisterRes();

                try
                {
                    regist_res.read(protocol);
                }
                catch (TException e)
                {
                    e.printStackTrace();
                }

                System.out.println(JSON.toJSONString(regist_res));

                out.add(regist_res);

            }
            break;

            case RpcEventType.MT_SERVICE_LIST_RES:
                {
                    TProtocol protocol = new SL_RPC_Thrift_BinaryProtocol(event, SL_RPC_CommHead.Size(), (event.Length() - SL_RPC_CommHead.Size()));
                    ServiceListRes res = new ServiceListRes();

                    try
                    {
                        res.read(protocol);
                    }
                    catch (TException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println(JSON.toJSONString(res));

                    out.add(res);

                }
                break;

            default:
            	break;
            }

            //index = in.readableBytes();
            
//            byte b = buf.
//            //int len = b.length;
//            receive_buffer.WriteBinary(buf.array(), buf.array().length);
        
            //out.add(receive_buffer);
//            SL_RPC_MainStageHandler main_stage = new SL_RPC_MainStageHandler(receive_buffer);
//            main_stage.Initialize();
//            main_stage.handle_message();
        }
        
      

        
    }

}
