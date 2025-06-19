package com.nttdata.banking.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Class MsConfigServerApplication Main.
 * ConfigServer microservice class MsConfigServerApplication.
 */
@SpringBootApplication
@EnableConfigServer
public class MsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigServerApplication.class, args);
    }

}
