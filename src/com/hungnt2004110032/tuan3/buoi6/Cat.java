package com.hungnt2004110032.tuan3.buoi6;

public class Cat extends Feline {
    // state


    // method
    @Override
    protected void makeNoise() {
        System.out.println("Making Cat noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Cat eating meat ...");
    }
}
