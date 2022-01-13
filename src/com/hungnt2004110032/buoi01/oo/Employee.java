package com.hungnt2004110032.buoi01.oo;

import java.util.Scanner;

public class Employee {

    Scanner input = new Scanner(System.in);
    String emName;

    Employee(String name){
        emName = name;
    }

    void show(){
        System.out.println("-------Thong tin nhan vien-------");
        System.out.println("Ten nhan vien: " + emName);
    }
}
