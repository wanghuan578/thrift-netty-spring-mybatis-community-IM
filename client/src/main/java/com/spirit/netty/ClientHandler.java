package com.spirit.netty;


import com.alibaba.fastjson.JSON;
import com.spirit.thrift.socketserver.rpc.thrift.*;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


@Sharable
public class ClientHandler extends SimpleChannelInboundHandler{
    

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
		super.channelActive(ctx);
//        System.out.println("client connect");
//		//HelloNotify notify = (HelloNotify) msg;
//		//System.out.println(JSON.toJSONString(notify, true));
//		ClientPasswordLoginReq req = new ClientPasswordLoginReq();
//		req.setCheck_sum("112211221121122122trfgft4rfrtfghtrgy");
//		req.setClient_mac("112233445566");
//		req.setClient_version("1.0.0.0");
//		ctx.write(req);
//		ctx.flush();
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client disconnect");
    }
    
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
    	
    	
    	if (msg instanceof HelloNotify) {

    		HelloNotify notify = (HelloNotify) msg;
    		System.out.println(JSON.toJSONString(notify, true));



    		ClientPasswordLoginReq req = new ClientPasswordLoginReq();
    		req.setCheck_sum("112211221121122122trfgft4rfrtfghtrgy");
    		req.setClient_mac("112233445566");
    		req.setClient_version("1.0.0.0");
    		ctx.write(req);
    		ctx.flush();
    	}
    	else if (msg instanceof ClientLoginRes) {
    		ClientLoginRes loginResp = (ClientLoginRes) msg;
    		System.out.println("ClientLoginRes: " + JSON.toJSONString(loginResp, true));


			ServiceRegisterReq req = new ServiceRegisterReq();
			ServiceAddr addr =  new ServiceAddr();
			addr.ip = "localhost";
			addr.port = 8080;
			ServiceInfo info = new ServiceInfo();
			info.service_name = "translate";
			info.service_weight = 99;
			info.service_addr = addr;
			req.service_info = info;

			ctx.write(req);
			ctx.flush();
    	}
		else if (msg instanceof ServiceRegisterRes) {
			ServiceRegisterRes res = (ServiceRegisterRes) msg;
			System.out.println("ServiceRegisterRes: " + JSON.toJSONString(res, true));

			ServiceListReq req = new ServiceListReq();
			req.service_name = "translate";
			ctx.write(req);
			ctx.flush();
		}else if (msg instanceof ServiceListChangeNotify) {
			ServiceListChangeNotify notify = (ServiceListChangeNotify) msg;
			System.out.println("ServiceListChangeNotify: " + JSON.toJSONString(notify, true));

			ServiceListChangeRes req = new ServiceListChangeRes();
			ctx.write(req);
			ctx.flush();
		}



    }

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		// TODO Auto-generated method stub

	}


}
