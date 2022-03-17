package com.hungnt2004110032.tuan4.buoi7;

import java.util.Scanner;

public class ChuyenXe {

    private int maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private float doanhThu;
    
    Scanner sc = new Scanner(System.in);

    
    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public int getMaSoChuyen() {
        return maSoChuyen;
    }
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    protected void nhap(){

        System.out.print("Nhap ma chuyen xe: ");
        setMaSoChuyen(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten tai xe: ");
        setHoTenTaiXe(sc.nextLine());
        System.out.print("Nhap so xe: ");
        setSoXe(sc.nextLine());
        System.out.print("Nhap doanh thu: ");
        setDoanhThu(sc.nextFloat());
        
    }

    protected void inThongTin(){
        System.out.println("Ma chuyen xe: " + getMaSoChuyen() );
        System.out.println("Ho ten tai xe: " + getHoTenTaiXe() );
        System.out.println("So xe: " + getSoXe() );
        System.out.println("Doanh thu: " + getDoanhThu() + " vnd" );
    
    }


}
