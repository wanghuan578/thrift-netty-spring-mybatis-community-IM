package com.spirit.client;

import com.spirit.netty.NettyClient;

import com.spirit.thrift.socketserver.rpc.thrift.ClientPasswordLoginReq;
import io.netty.channel.Channel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NettyClient client = new NettyClient("192.168.219.133", 9000);
        //NettyClient client = new NettyClient("localhost", 9000);
        //启动client服务
        try {
			client.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        Channel channel = client.getChannel();
//        //消息体
//        ClientPasswordLoginReq request = new ClientPasswordLoginReq();
//
//        request.setCheck_sum("1122112211221122112211221122");
//        request.setUser_id(100110011);
//        channel.writeAndFlush(request);

    }
}
