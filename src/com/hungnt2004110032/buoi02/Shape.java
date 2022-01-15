package com.hungnt2004110032.buoi02;

public class Shape {
    String shapeString;
    String musicAIF;

    Shape(String s, String ms){
        shapeString = s;
        musicAIF = ms;
    }

    void click(){
        System.out.println( shapeString + " xoay 360 độ theo chiều kim đồng hồ và chơi một đoạn âm thanh " + musicAIF);
    }
}
