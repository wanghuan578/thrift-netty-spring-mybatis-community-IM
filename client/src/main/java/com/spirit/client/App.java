package com.spirit.client;

import com.spirit.netty.NettyClient;

import io.netty.channel.Channel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        NettyClient client = new NettyClient("127.0.0.1", 8080);
        //启动client服务
        try {
			client.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        Channel channel = client.getChannel();
        //消息体
//        RpcRequest request = new RpcRequest();
//        request.setId(UUID.randomUUID().toString());
//        request.setData("client.message");
//        //channel对象可保存在map中，供其它地方发送消息
//        channel.writeAndFlush(request);

    }
}
