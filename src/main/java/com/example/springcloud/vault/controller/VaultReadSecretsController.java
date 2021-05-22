package com.example.springcloud.vault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultReadSecretsController {

    // secret1 is stored in vault
    @Value("${secret1}")
    private String secret1;

    // secret1 is stored in vault
    @Value("${secret2}")
    private String secret2;

    @GetMapping("/getSecretsFromVault")
    public String getSecretsFromVault() {
        return "Secrets from vault. Secret1: " + secret1 + " Secret2: " + secret2;
    }
}
