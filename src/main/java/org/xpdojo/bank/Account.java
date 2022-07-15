package org.xpdojo.bank;

public class Account {
    public int balance = 0;

    public void initialize() {
        balance = 0;
    }

    public int balance() {
        return balance;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public void transfer(Account recipient, int amount) {
        balance -= amount;
        recipient.deposit(amount);
    }
}
