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
}
