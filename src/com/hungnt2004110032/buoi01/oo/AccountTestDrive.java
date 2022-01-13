package com.hungnt2004110032.buoi01.oo;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account(2121, 0);
        account.show();
        account.desposit();;
        account.withdraw();
        account.show();

    }
}
