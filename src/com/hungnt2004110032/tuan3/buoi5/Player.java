package com.hungnt2004110032.tuan3.buoi5;

public class Player {
    
    int number = 0;

    public void guess(){
        
        number = (int) (Math.random() * 10);
        System.out.println("Player guess " + number);

    }
}
