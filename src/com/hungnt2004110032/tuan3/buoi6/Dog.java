package com.hungnt2004110032.tuan3.buoi6;

public class Dog extends Canine {
    // state

    // method
    @Override
    protected void makeNoise() {
        System.out.println("Making Dog noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Dog eating bone");
    }
}
