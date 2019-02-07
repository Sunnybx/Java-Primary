package com.bx;

public class Account {
    String Holdname;
    float account;

    public Account(String holdname, float amt) {
        this.Holdname = holdname;
        this.account = amt;
    }

    public synchronized void deposit(float amt) {
        account -= amt;
    }

    public synchronized void withdraw(float amt) {
        account += amt;
    }

    public float checkBalance() {
        return account;
    }
}
