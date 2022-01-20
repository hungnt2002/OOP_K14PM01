package com.hungnt2004110032.buoi04;

public class Triangle {
    String soundFile;

    Triangle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Xoay hinh 360 đo");
    }

    void playSound(){
        System.out.println("Phat tap tin nhac " + soundFile );
    }
}
