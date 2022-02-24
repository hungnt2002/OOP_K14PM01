package com.hungnt2004110032.tuan3.buoi5;

public class IntSquare {
    
    private double squareValue; //implementation


    //Interface
    public double getSquare(int value){
        calculateSquare(value);
        return this.squareValue;
    }

    //implementation
    private void calculateSquare(int value){
        this.squareValue = Math.pow(value, 2);
    }
}
