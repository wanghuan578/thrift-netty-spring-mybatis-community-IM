package com.gyc.netty;


import com.alibaba.fastjson.JSON;
import com.gyc.entity.UserInfoDmo;
import com.gyc.service.UserService;
import com.gyc.thrift.idl.CommonNull;
import com.gyc.thrift.idl.HelloNotify;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_ByteBuffer;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_CommHead;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_ProtocolFactory;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_Seda_EventType;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_Thrift_BinaryProtocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
@Sharable
public class ServerHandler extends ChannelInboundHandlerAdapter {
    
    @Resource
    private UserService userService;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
  
        HelloNotify notify = new HelloNotify();
        
        notify.setServer_random(1000000);
        notify.setService_id(888888);
        notify.setError_code((short)0);
        notify.setError_text("OK");
  
        SL_RPC_ProtocolFactory<HelloNotify> factory = new SL_RPC_ProtocolFactory<HelloNotify>(notify, 1024, SL_RPC_CommHead.Size());

        factory.GetBuilder().GetHead().SetType(SL_RPC_Seda_EventType.MT_RPC_SEDA_EVENT_HELLO_NOTIFY);
        factory.GetBuilder().GetHead().SetSource(123);
        factory.GetBuilder().GetHead().SetAttach1(123);

        factory.GetBody().write(factory.GetProtocol());
        factory.GetHead().Serialize();

        
        SL_RPC_ByteBuffer event = factory.GetBuilder().GetBuffer();
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
        
//        HelloNotify notify = new HelloNotify();
//        notify.setServer_random(1000000);
//        notify.setService_id(888888);
//        notify.setError_code((short)0);
//        notify.setError_text("OK");
//  
//        SL_RPC_ProtocolFactory<HelloNotify> factory = new SL_RPC_ProtocolFactory<HelloNotify>(notify, 1024, SL_RPC_CommHead.Size());
//
//        factory.GetBuilder().GetHead().SetType(SL_RPC_Seda_EventType.MT_RPC_SEDA_EVENT_HELLO_NOTIFY);
//        factory.GetBuilder().GetHead().SetSource(123);
//        factory.GetBuilder().GetHead().SetAttach1(123);
//        
//        factory.GetBuilder().GetBody().write(factory.GetBuilder().GetTProtocol());
//        
//        factory.GetBuilder().Serialize();
//
//        
//        SL_RPC_ByteBuffer event = factory.GetBuilder().GetBuffer();
//        TProtocol protocol = new SL_RPC_Thrift_BinaryProtocol(event, SL_RPC_CommHead.Size(), (event.Length() - SL_RPC_CommHead.Size()));
//        HelloNotify hello_notify = new HelloNotify();
//        
//        try
//        {
//            hello_notify.read(protocol);
//        } 
//        catch (TException e) 
//        {
//            e.printStackTrace();
//        }
        
//        ctx.write(out);
//        ctx.flush();
        
        System.out.println("client connect");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client disconnect");
    }
    
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        ByteBuf byteBuf= (ByteBuf) msg;
//        int len = byteBuf.readInt();
//        ByteBuf content = byteBuf.readBytes(len);
//
//        byte[] buff = byteBuf.array();
//        SL_RPC_ByteBuffer event = new SL_RPC_ByteBuffer(buff, buff.length);

        //System.out.println(readMessage.toString(CharsetUtil.UTF_8));
//        UserInfoDmo users = userService.selectByPrimaryKey(1L);
//        if (users != null) {
//            System.out.println(JSON.toJSONString(users, true));
//        }
        
        ctx.write(msg);
        ctx.flush();
        

    }


}
