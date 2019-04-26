package com.whuaz.spring.boot.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author grez
 * @since 19-4-26
 **/

@SpringBootApplication
@EnableAdminServer
public class ServerApp {

    public static void main(String[] args) {

        SpringApplication.run(ServerApp.class, args);
    }
}
