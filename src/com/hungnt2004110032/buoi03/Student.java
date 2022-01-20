package com.hungnt2004110032.buoi03;

public class Student {
    String name;
    float tuoi;
    String gioiTinh;
    String khoa;
    Double diemTB;

    Student(String name, float tuoi, double diemTB){
        this.name = name;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    Student(String name, float tuoi, String gioiTinh, String khoa, Double diemTB){
        this(name, tuoi, diemTB);
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    void hoc(){
        System.out.println("Hoc ...");
    }

    void thi(){
        System.out.println("Thi ...");    
    }

    void dangKyMonHoc(){
        System.out.println("Dang ky mon hoc ...");
    }
    void show(){
        System.out.println("");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi Tinh: " + gioiTinh);
        System.out.println("Khoa: " + khoa);
        System.out.println("Diem Trung Binh " + diemTB);
    }
}
