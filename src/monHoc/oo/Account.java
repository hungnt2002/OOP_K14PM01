package monHoc.oo;
import java.util.Scanner;

public class Account {

    int account_number = 12345;
    int account_banlance = 0;
    Scanner input = new Scanner(System.in);

    Account(int number, int balance){
        account_number = number;
        account_banlance = balance;
    }

    void show(){

        System.out.println("------------------------------");
        System.out.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_banlance);
        System.out.println("------------------------------");
    }

    void desposit(){

        System.out.print("Nhap vao so tien gui: ");
        int despositAmount = 0;
        despositAmount = input.nextInt();
        account_banlance += despositAmount;
        System.out.println("So tien da gui la: " + account_banlance);
    }

    void withdraw(){
        System.out.print("Nhap vao so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_banlance -= withdrawAmount;
        System.out.println("So tien rut duoc la: " + withdrawAmount);
    }
}
