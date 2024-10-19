package com.invntree.configserver;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
//@EnableConfigServer
public class InvntreeConfigServerApplication implements CommandLineRunner {

    private final VaultConfig vaultConfig;

    public InvntreeConfigServerApplication(VaultConfig vaultConfig) {
        this.vaultConfig = vaultConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(InvntreeConfigServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Logger logger = LoggerFactory.getLogger(InvntreeConfigServerApplication.class);
        logger.info(" Configuration of ivnntree properties");
        logger.info(" userName is {}", vaultConfig.getUserName());
        logger.info(" password is {}", vaultConfig.getPassword());
    }
}
