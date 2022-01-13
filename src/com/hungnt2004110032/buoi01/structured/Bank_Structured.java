package com.hungnt2004110032.buoi01.structured;
import java.util.Scanner;

public class Bank_Structured {
    // bien toan cuc
    static int account_number = 12345;
    static int account_banlance = 0;
    static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        show();
        desposit();
        withdraw();
        
    }
    
    // in thong tin tai khoan
    static void show(){

        System.out.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);
    }

    static void desposit(){

        System.out.print("Nhap vao so tien gui: ");
        int despositAmount = 0;
        despositAmount = input.nextInt();
        account_banlance += despositAmount;
        System.out.println("So tien da gui la: " + account_banlance);
    }

    // rut tien
    static void withdraw(){
        System.out.print("Nhap vao so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;
        System.out.println("So tien rut duoc la: " + withdrawAmount);
    }
    

}
