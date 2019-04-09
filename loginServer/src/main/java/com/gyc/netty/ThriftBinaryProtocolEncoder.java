package com.gyc.netty;

import com.alibaba.druid.util.StringUtils;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_CommHead;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_ProtocolFactory;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_Seda_EventType;
import com.gyc.thrift.socketserver.rpc.thrift.ClientLoginRes;
import com.gyc.thrift.socketserver.rpc.thrift.CommonRes;
import com.gyc.thrift.socketserver.rpc.thrift.HelloNotify;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.StringUtil;

public class ThriftBinaryProtocolEncoder extends MessageToByteEncoder<Object> {

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
		// TODO Auto-generated method stub
		
		//SL_RPC_ProtocolFactory<HelloNotify> factory = null;
		
		if (msg instanceof HelloNotify) {
			
			SL_RPC_ProtocolFactory<HelloNotify> factory = new SL_RPC_ProtocolFactory<HelloNotify>((HelloNotify) msg, 1024, SL_RPC_CommHead.Size());

			factory.GetBuilder().GetHead().SetType(SL_RPC_Seda_EventType.MT_RPC_SEDA_EVENT_HELLO_NOTIFY);
			factory.GetBuilder().GetHead().SetSource(123);
			factory.GetBuilder().GetHead().SetAttach1(123);
			
			factory.GetBody().write(factory.GetProtocol());
//			factory.GetBuilder().Serialize();
//			out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes());
			out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes(), 0, factory.GetBuilder().Serialize());
		}
		else if (msg instanceof ClientLoginRes) {
			
			SL_RPC_ProtocolFactory<ClientLoginRes> factory = new SL_RPC_ProtocolFactory<ClientLoginRes>((ClientLoginRes) msg, 1024, SL_RPC_CommHead.Size());

			factory.GetBuilder().GetHead().SetType(SL_RPC_Seda_EventType.MT_RPC_SEDA_EVENT_LOGIN_RESP);
			factory.GetBuilder().GetHead().SetSource(123);
			factory.GetBuilder().GetHead().SetAttach1(123);
			
			factory.GetBody().write(factory.GetProtocol());
			//factory.GetBuilder().Serialize();
			//byte[] buf = factory.GetBuilder().GetBuffer().GetBytes();
			//out.writeBytes(buf);
			out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes(), 0, factory.GetBuilder().Serialize());
			
		}
		

		
		
		return;
	}

}
