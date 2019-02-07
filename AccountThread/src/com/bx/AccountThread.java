package com.bx;

public class AccountThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        Account a = new Account("bx", 100);
        a.deposit(50);
        System.out.println(a.account);
        a.withdraw(50);
        System.out.println(a.account);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new AccountThread());
        t1.start();
    }
}
