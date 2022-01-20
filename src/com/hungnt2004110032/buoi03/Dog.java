package com.hungnt2004110032.buoi03;

public class Dog {
    int size;
    String breed;
    String name;

    Dog(int size, String breed, String name){
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    void bark(){
        if(size > 14){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }

    void setBigger(){
        size+=5;
    }

    void run(){
        System.out.println("Running ...");
        this.bark();
    }
}
