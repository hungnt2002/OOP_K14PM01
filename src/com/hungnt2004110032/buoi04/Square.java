package com.hungnt2004110032.buoi04;

public class Square {
    private String soundFile;

    Square(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Xoay hinh vuong 360 đo");
    }

    void playSound(){
        System.out.println("Phat tap tin nhac " + soundFile );
    }
}
