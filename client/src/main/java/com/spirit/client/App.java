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
        NettyClient client = new NettyClient("127.0.0.1", 9999);
        //NettyClient client = new NettyClient("localhost", 9000);
        //启动client服务
        try {
			client.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 

        //Channel channel = client.getChannel();


    }
}
