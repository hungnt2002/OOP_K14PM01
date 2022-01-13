package com.hungnt2004110032.buoi01.oo;

public class BankTestDrive {
    public static void main(String[] args) {
        Account account = new Account(125478, 0);
        account.show();
        account.desposit();
        account.withdraw();
        account.show();

        Employee employee = new Employee("Nguyen van A");
        employee = new Employee("Nguyen van B");
        employee.show();

        Customer customer = new Customer("Nguyen Van C");
        customer = new Customer("Nguyen Van D");
        customer.show();
    }
}
