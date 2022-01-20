package com.hungnt2004110032.buoi04;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("hinhtron.AIF");
        circle.rotate();
        circle.playSound();

        Square square = new Square("hinhvuong.AIF");
        square.rotate();
        square.playSound();

        Triangle triangle = new Triangle("hinhtamgiac.AIF");
        triangle.rotate();
        triangle.playSound();
    }
}
