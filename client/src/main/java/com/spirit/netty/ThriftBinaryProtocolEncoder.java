package com.spirit.netty;


import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_CommHead;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_ProtocolFactory;
import com.spirit.thrift.socketserver.rpc.minicore.SL_RPC_Seda_EventType;
import com.spirit.thrift.socketserver.rpc.thrift.*;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.StringUtil;




public class ThriftBinaryProtocolEncoder extends MessageToByteEncoder<Object> {

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
		// TODO Auto-generated method stub
		
		//SL_RPC_ProtocolFactory<HelloNotify> factory = null;
		//out.writeBytes("9988776655443332222".getBytes());

		if (msg instanceof ClientPasswordLoginReq) {
			
			SL_RPC_ProtocolFactory<ClientPasswordLoginReq> factory = new SL_RPC_ProtocolFactory<ClientPasswordLoginReq>((ClientPasswordLoginReq) msg, 1024, SL_RPC_CommHead.Size());

			factory.GetBuilder().GetHead().SetType(SL_RPC_Seda_EventType.MT_CLIENT_PASSWORD_LOGIN_REQ);
			factory.GetBuilder().GetHead().SetSource(123);
			factory.GetBuilder().GetHead().SetAttach1(123);
			
			factory.GetBody().write(factory.GetProtocol());
			//factory.GetBuilder().Serialize();
			//out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes(), 0, factory.GetBuilder().Serialize());
			int len = factory.GetBuilder().Serialize();
			SL_RPC_CommHead head = factory.GetBuilder().GetHead();
			System.out.println("msg len: " + len);
			out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes(), 0, len);
		}
		else if (msg instanceof ServiceRegisterReq) {

			SL_RPC_ProtocolFactory<ServiceRegisterReq> factory = new SL_RPC_ProtocolFactory<ServiceRegisterReq>((ServiceRegisterReq) msg, 1024, SL_RPC_CommHead.Size());

			factory.GetBuilder().GetHead().SetType(RpcEventType.MT_SERVICE_REGISTER_REQ);

			factory.GetBody().write(factory.GetProtocol());
			int len = factory.GetBuilder().Serialize();
			SL_RPC_CommHead head = factory.GetBuilder().GetHead();
			System.out.println("msg len: " + len);
			out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes(), 0, len);

		}
		else if (msg instanceof ServiceListReq) {
			SL_RPC_ProtocolFactory<ServiceListReq> factory = new SL_RPC_ProtocolFactory<ServiceListReq>((ServiceListReq) msg, 1024, SL_RPC_CommHead.Size());

			factory.GetBuilder().GetHead().SetType(RpcEventType.MT_SERVICE_LIST_REQ);

			factory.GetBody().write(factory.GetProtocol());
			int len = factory.GetBuilder().Serialize();
			SL_RPC_CommHead head = factory.GetBuilder().GetHead();
			System.out.println("msg len: " + len);
			out.writeBytes(factory.GetBuilder().GetBuffer().GetBytes(), 0, len);
		}
		

		
		
		return;
	}

}
