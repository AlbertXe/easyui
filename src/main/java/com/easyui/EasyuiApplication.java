package com.easyui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.easyui.dao")
public class EasyuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyuiApplication.class, args);
    }

}
