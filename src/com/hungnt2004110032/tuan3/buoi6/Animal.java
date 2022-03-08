package com.hungnt2004110032.tuan3.buoi6;

public class Animal {
    
    // attribute - thuộc tính - state
    private String picture;
    private String food;
    private int hunger;

    // method - behavior
    Animal(){}

    public Animal(String picture, String food, int hunger) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
    }

    protected void makeNoise(){
        System.out.println("Making Noise ...");
    }

    protected void sleep(){
        System.out.println("Sleeping ...");
    }

    protected void eat(){
        System.out.println("Eating ...");
    }
    
    protected void roam(){
        System.out.println("Roam ...");
    }
    
}
