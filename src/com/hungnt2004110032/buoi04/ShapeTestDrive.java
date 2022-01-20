package com.hungnt2004110032.buoi04;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle("hinhtron.aif");
        circle.rotate();
        circle.playSound();

        Square square = new Square("hinhvuong.aif");
        square.rotate();
        square.playSound();

        Triangle triangle = new Triangle("hinhtamgiac.aif");
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba("amoebaMusic.hif");
        amoeba.rotate();
    }
}
