package com.hungnt2004110032.buoi02;

public class Student {
    String name;
    float tuoi;
    String gioiTinh;
    String khoa;
    Double diemTB;

    Student(String n, float t, String gt, String k, Double d){
        name = n;
        tuoi = t;
        gioiTinh = gt;
        khoa = k;
        diemTB = d;
    }

    void hoc(){
        if(tuoi == 18){
            System.out.println("Hoc lop: K15");
        }else if(tuoi == 19){
            System.out.println("Hoc lop: K14");
        }else if(tuoi == 20){
            System.out.println("Hoc lop: K13");
        }else{
            System.out.println("Da tot nghiep");
        }
    }

    void thi(){
        if (diemTB > 3.5){ 
            System.out.println("Xep loai xuat xac");
        }      
        else if (diemTB > 2.4) {
            System.out.println("Xep loai Gioi");
        } 
        else if (diemTB > 1) {
            System.out.println("Xep loai trung binh");
        }
        else {
            System.out.println("Xep loai yeu");
        }               
    }

    void dangKyMonHoc(){
        System.out.println("Dang ky mon hoc ...");
    }
}
