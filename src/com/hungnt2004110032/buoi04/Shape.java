package com.hungnt2004110032.buoi04;

public class Shape {
    
    private String soundFile;

    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public Shape(){}

    public Shape(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Xoay hinh 360 đo");
    }

    void playSound(){
        System.out.println("Play file .aif " + this.soundFile + " music" );
    }
}
