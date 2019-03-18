package com.gyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gyc.thrift.socketserver.rpc.minicore.SL_RPC_ByteBuffer;

@SpringBootApplication
@MapperScan(basePackages = "com.gyc.mapper")
public class GycApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(GycApplication.class, args);
    }
}
