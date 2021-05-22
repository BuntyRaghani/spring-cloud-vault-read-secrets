package com.example.springcloud.vault;

import com.example.springcloud.vault.controller.VaultReadSecretsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class VaultReadSecretsApplicationTest {

    @Autowired
    private VaultReadSecretsController vaultReadSecretsController;

    @Test
    void contextLoads() {
        // to ensure that controller is getting created inside the application context
        assertNotNull(vaultReadSecretsController);
    }

}
