package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {

    @Test
    public void initialAccountBalance() {
        Account account = new Account();
        assertThat(account.balance(), is(0));
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance(), is(100));
    }

    @Test
    public void depositMultipleAmountsToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(50);
        assertThat(account.balance(), is(150));
    }

    @Test
    public void withdrawAnAmountToDescreaseTheBalance() {
        Account account = new Account();
        account.deposit(200);
        account.withdraw(100);
        assertThat(account.balance(), is(100));
    }

    @Test
    public void withdrawMultipleAmountsToDescreaseTheBalance() {
        Account account = new Account();
        account.deposit(200);
        account.withdraw(100);
        account.withdraw(50);
        assertThat(account.balance(), is(50));
    }
}
