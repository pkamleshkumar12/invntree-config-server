package com.invntree.configserver;

import com.invntree.configserver.config.VaultConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigServer
@EnableConfigurationProperties(VaultConfig.class)
public class InvntreeConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvntreeConfigServerApplication.class, args);
    }
}
