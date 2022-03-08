package com.hungnt2004110032.tuan3.buoi6;

import java.util.Scanner;

public class VehicleTestDrive {
    public static void main(String[] args) {
        int luaChon;
        Scanner bienNhap = new Scanner(System.in);

        do{

            System.out.println("================MENU=============");
            System.out.println("1> Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2> Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3> Thoát.");
            System.out.println("---------------------------------");

            System.out.print("Chọn chức năng: ");
            luaChon = bienNhap.nextInt();

            switch(luaChon){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Thoát chương trình thành công !");
                    System.exit(0);
                    break;
                default:
                     System.out.println("nhập không đúng !");
            }
            System.out.print("quay về menu (1:yes, 0:no): ");
            bienNhap.nextLine();
        }while(bienNhap.nextInt() == 1);
    }

    public void inThongTin(){
        Vehicle vehicle = new Vehicle(20000, 100, 5);
    }
}
