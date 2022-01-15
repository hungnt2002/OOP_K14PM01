package com.hungnt2004110032.buoi02;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape circleShape = new Shape("Hình tròn", "'âm thanh AIF của hình tròn'");
        circleShape.click();

        Shape squareShape = new Shape("Hình vuông", "'âm thanh AIF của hình vuông'");
        squareShape.click();

        Shape triangularShape = new Shape("Hình tam giác", "'âm thanh AIF của hình tam giác'");
        triangularShape.click();
    }
}
