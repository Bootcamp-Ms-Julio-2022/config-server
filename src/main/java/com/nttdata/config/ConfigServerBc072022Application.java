package com.nttdata.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerBc072022Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBc072022Application.class, args);
    }

}
