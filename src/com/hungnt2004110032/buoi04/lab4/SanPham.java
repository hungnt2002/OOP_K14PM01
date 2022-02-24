package com.hungnt2004110032.buoi04.lab4;
import java.util.Scanner;
public class SanPham {

    //attribute
    String tenSp;
    double donGia;
    double giamGia;

    //method
    public double getThueNhapKhau(){
        return donGia*0.1;
    }

    public void xuat(){

        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia + " vnd");
        System.out.println("Giam gia: " + giamGia + "%");
        System.out.println("Thue nhap khau: " + getThueNhapKhau() + " vnd");

    }

    public void nhap(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        sc.nextLine();
        giamGia = sc.nextDouble();

    }
}
