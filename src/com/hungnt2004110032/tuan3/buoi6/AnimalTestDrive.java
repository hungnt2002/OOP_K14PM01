package com.hungnt2004110032.tuan3.buoi6;

public class AnimalTestDrive {
    public static void main(String[] args) {
        // Hà mã
        Hippo hippo = new Hippo();
        hippo.makeNoise();
        hippo.eat();
        // Họ mèo
        Feline feline = new Feline();
        feline.roam();
        // Sư tử
        Lion lion = new Lion();
        lion.makeNoise();
        lion.eat();
        // Cọp
        Tiger tiger = new Tiger();
        tiger.makeNoise();
        tiger.eat();
        // Mèo
        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        // Họ răng nanh
        Canine canine = new Canine();
        canine.roam();
        //  Sói
        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();
        // Chó
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();

    }
}
