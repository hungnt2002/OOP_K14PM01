package com.hungnt2004110032.tuan3.buoi6;

public class SinhVien {
    // attribute
    private int mssv;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    // constructor
    SinhVien(){}

    SinhVien(int mssv, String hoTen, double diemLT, double diemTH){
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // method
    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }
    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public double tinhDiemTrungBinh(){
        return (this.diemLT + this.diemTH)/2;
    }

    public void xuatThongTin(){
        System.out.printf("MSSV: %d, ho ten: %s, diem LT: %.2f, diemTH: %.2f, diem TB: %.2f\n", mssv, hoTen, diemLT, diemTH, tinhDiemTrungBinh());
    }

}
