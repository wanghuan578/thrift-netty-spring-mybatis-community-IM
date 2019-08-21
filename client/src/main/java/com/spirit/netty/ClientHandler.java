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
			AddressInfo addr =  new AddressInfo();
			addr.ip = "127.0.0.1";
			addr.port = 8080;
			ServiceRouteInfo info = new ServiceRouteInfo();
			info.name = "translate";
			info.weight = 99;
			info.addr = addr;
			req.route = info;

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
		}else if (msg instanceof ServiceListSyncNotify) {
			ServiceListSyncNotify notify = (ServiceListSyncNotify) msg;
			System.out.println("ServiceListChangeNotify: " + JSON.toJSONString(notify, true));

			ServiceListSyncRes req = new ServiceListSyncRes();
			ctx.write(req);
			ctx.flush();
		}



    }

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		// TODO Auto-generated method stub

	}


}
