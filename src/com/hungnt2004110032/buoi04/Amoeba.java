package com.hungnt2004110032.buoi04;

public class Amoeba extends Shape {
    // attribute

    // tọa độ điểm
    private double xPoint;
    private double yPoint;

    // method
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    void rotate(){

        System.out.println("Xoay hinh amoeba 360 đo tai diem x: " + this.xPoint + " y: " + this.yPoint);
        this.playSound();
    }

    
}
