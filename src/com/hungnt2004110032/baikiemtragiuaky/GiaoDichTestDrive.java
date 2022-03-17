package com.hungnt2004110032.baikiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichTestDrive {
    
    public static void main(String[] args) throws ParseException {

        GiaoDich giaoDichDat = new GiaoDichDat();
        GiaoDich giaoDichNha = new GiaoDichNha();

        try (Scanner sc = new Scanner(System.in)) {
            int luaChon;
            
            do {
                    System.out.println("==============MENU==============");
                    System.out.println(">>1. Nhap thong tin giao dich Dat.");
                    System.out.println(">>2. Xuat thong tin giao dich Dat.");
                    System.out.println(">>3. Nhap thong tin giao dich Nha.");
                    System.out.println(">>4. Xuat thong tin giao dich Nha.");
                    System.out.println(">>5. Tinh tong so luong giao dich Dat.");
                    System.out.println(">>6. Tinh tong so luong giao dich Nha.");
                    System.out.println(">>0. Thoat!");
                    System.out.print("Lua chon cua ban: ");
                    luaChon = sc.nextInt();
                    System.out.println("--------------------------------");
                    switch (luaChon) {
                        case 1: giaoDichDat.nhapDanhSach();
                        break;
                        case 2: giaoDichDat.inThongTin();
                        break;
                        case 3: giaoDichNha.nhapDanhSach();
                        break;
                        case 4: giaoDichNha.inThongTin();
                        break;
                        case 5: giaoDichDat.tinhTongSoLuong();
                        break;
                        case 6: giaoDichNha.tinhTongSoLuong();
                        break;
                        default: System.out.println("Thoat chuong trinh thanh cong !");
                                 System.exit(0);

                    }

                    System.out.print("- Quay lai MENU(1:yes/0:no): ");
                    luaChon = sc.nextInt();
                    
                }while(luaChon == 1);
        }
        
    }
}
