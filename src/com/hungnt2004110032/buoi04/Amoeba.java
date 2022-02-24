package com.hungnt2004110032.buoi04;

public class Amoeba {
    // attribute
    private String soundFile;
    // tọa độ điểm
    private double xPoint;
    private double yPoint;

    // method
    public Amoeba(String soundFile){
        this.soundFile = soundFile;
    }

    public Amoeba(String soundFile, double xPoint, double yPoint){
        this(soundFile);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    void rotate(){

        System.out.println("Xoay hinh amoeba 360 đo tai diem x: " + this.xPoint + " y: " + this.yPoint);
        this.playSound();
    }

    void playSound(){
        System.out.println("Play file " + soundFile + " music");
    }
}
