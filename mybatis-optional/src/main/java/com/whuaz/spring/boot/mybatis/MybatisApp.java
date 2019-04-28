package com.whuaz.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author grez
 * @since 19-4-28
 **/
@SpringBootApplication
@MapperScan("com.whuaz.spring.boot.mybatis.mapper")
public class MybatisApp {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApp.class, args);
    }
}
