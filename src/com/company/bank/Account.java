package com.company.bank;

public class Account {
    int balance = 100;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int amount) {
        balance = balance - amount;
    }

    public synchronized void deposit(int amount){
        balance = balance + amount;
    }
}
