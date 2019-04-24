package com.xrdocker.whitemouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {
//        DataSourceAutoConfiguration.class,
//        DataSourceTransactionManagerAutoConfiguration.class,
//        TransactionAutoConfiguration.class
//})
@SpringBootApplication
@MapperScan("com.xrdocker.whitemouse.persistent")
public class WhiteMouseApplication {


    public static void main(String[] args) {
        String[] devArgs = new String[1];
        devArgs[0] = "--spring.profiles.active=dev";
        if(0==args.length) {
            SpringApplication.run(WhiteMouseApplication.class, devArgs);
        }else {
            SpringApplication.run(WhiteMouseApplication.class, args);
        }
    }

}
