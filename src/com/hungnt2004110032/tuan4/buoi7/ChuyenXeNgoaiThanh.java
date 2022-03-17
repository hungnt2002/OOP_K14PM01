package com.hungnt2004110032.tuan4.buoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    
    private int soTuyen;
    private float soKm;
    

    Scanner sc = new Scanner(System.in);

    // method
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoKm(float soKm) {
        this.soKm = soKm;
    }

    public float getSoKm() {
        return soKm;
    }

    @Override
    protected void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.println("Nhap so tuyen: ");
        setSoTuyen(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap so km: ");
        setSoKm(sc.nextFloat());
    }

    @Override
    protected void inThongTin() {
        // TODO Auto-generated method stub
        super.inThongTin();
        System.out.println("Số tuyến: " + getSoTuyen());
        System.out.println("Số km đi được: " + getSoKm());
    }
}
