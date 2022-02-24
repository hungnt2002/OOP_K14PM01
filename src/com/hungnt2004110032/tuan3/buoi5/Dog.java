package com.hungnt2004110032.tuan3.buoi5;

public class Dog {
    
    // attribute
    private int size; // implementation
    /* default */ String name;
    /* default */ String breed;

    // method
    public void setSize(int size){
        // code ràng buộc cho size không âm
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("Size unvalid (Không hợp lệ !)");
        }
        
    }

    public int getSize(){
        return this.size;
    }
}
