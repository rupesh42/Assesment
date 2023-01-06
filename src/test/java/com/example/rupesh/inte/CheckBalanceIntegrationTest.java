package com.example.rupesh.inte;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.rupesh.controllers.AccountRestController;
import com.example.rupesh.models.Account;
import com.example.rupesh.utils.AccountInput;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(value = "local")
class CheckBalanceIntegrationTest {

    @Autowired
    private AccountRestController accountRestController;

    //TODO: Incorrect Unit, need to fix it
    @Test
    @Ignore
    void givenAccountDetails_whenCheckingBalance_thenVerifyAccountCorrect() {
        var input = new AccountInput();
        input.setSortCode("53-68-92");
        input.setAccountNumber("73084635");

        var body = accountRestController.checkAccountBalance(input).getBody();

        var account = (Account) body;
        assertThat(account).isNotNull();
        assertThat(account.getOwnerName()).isEqualTo("Paul Dragoslav");
        assertThat(account.getSortCode()).isEqualTo("53-68-92");
        assertThat(account.getAccountNumber()).isEqualTo("73084635");
    }
}
