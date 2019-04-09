package com.spirit.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;


import com.spirit.netty.ThriftBinaryProtocolDecoder;
import com.spirit.netty.ThriftBinaryProtocolEncoder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


public class NettyClient  {
//    @Resource
//    private ClientHandler clientHandler;

    private String host = "127.0.0.1";
    private int port = 8080;
    private Channel channel;
 
    //连接服务端的端口号地址和端口号
    public NettyClient(String host, int port) {
        this.host = host;
        this.port = port;
    }
 
    @PostConstruct
    public void start() throws Exception {
        final EventLoopGroup group = new NioEventLoopGroup();
 
        Bootstrap b = new Bootstrap();
        b.group(group).channel(NioSocketChannel.class)  // 使用NioSocketChannel来作为连接用的channel类
            .handler(new ChannelInitializer<SocketChannel>() { // 绑定连接初始化器
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    System.out.println("正在连接中...");
                    ChannelPipeline pipeline = ch.pipeline();
                    pipeline.addLast("decode", new ThriftBinaryProtocolDecoder());
                    pipeline.addLast("encode", new ThriftBinaryProtocolEncoder());
                    pipeline.addLast(new ClientHandler());
                }
            });
        //发起异步连接请求，绑定连接端口和host信息
        final ChannelFuture future = b.connect(host, port).sync();
 
        future.addListener(new ChannelFutureListener() {
 
            public void operationComplete(ChannelFuture arg0) throws Exception {
                if (future.isSuccess()) {
                    System.out.println("连接服务器成功");
 
                } else {
                    System.out.println("连接服务器失败");
                    future.cause().printStackTrace();
                    group.shutdownGracefully(); //关闭线程组
                }
            }
        });
 
        this.channel = future.channel();
    }
 
    public Channel getChannel() {
        return channel;
    }


}
