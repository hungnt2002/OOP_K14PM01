package com.hungnt2004110032.tuan3.buoi6;

public class Vehicle {
    // atrribute
    private double gia; // giá xe
    private int dungTich; // dung tích xylanh
    private double thue; // thuế phải đóng trước bạ khi mua xe

    // constructor
    public Vehicle(double gia, int dungTich, double thue) {
        this.gia = gia;
        this.dungTich = dungTich;
        this.thue = thue;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getDungTich() {
        return dungTich;
    }
    
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

}
