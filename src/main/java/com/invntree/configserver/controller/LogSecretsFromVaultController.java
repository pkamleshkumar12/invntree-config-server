package com.invntree.configserver.controller;

import com.invntree.configserver.config.VaultConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogSecretsFromVaultController {

    private final VaultConfig vaultConfig;
    private final Logger logger = LoggerFactory.getLogger(LogSecretsFromVaultController.class);

    @Autowired
    public LogSecretsFromVaultController(VaultConfig vaultConfig) {
        this.vaultConfig = vaultConfig;
    }

    @GetMapping("/log-secrets")
    public String logSecrets() {
        logger.info("userName is {}", vaultConfig.getUserName());
        return "Secrets logged successfully";
    }
}
