package com.hungnt2004110032.buoi01.non_structured;

import java.util.Scanner;

public class Bank_NonStructured {
    public static void main(String[] args) {
        
        int account_number = 12345;
        int account_banlance = 0;


        // hanh dong thao tac len data 
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Nhap vao so tien gui");
        int despositAmount = 0;
        despositAmount = input.nextInt();
        account_banlance += despositAmount;

        // in thong tin tai khoan
        System.out.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);

        // rut tien
        System.out.println("Nhap vao so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;
        System.out.println("So tien rut duoc la: " + withdrawAmount);


        System.out.println("Nhap vao so tien gui");
        despositAmount = input.nextInt();
        account_banlance += despositAmount;

        // in thong tin tai khoan
        System.out.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);

        // rut tien
        System.out.println("Nhap vao so tien can rut: ");
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;
        System.out.println("So tien rut duoc la: " + withdrawAmount);
    }
}
