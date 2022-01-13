package com.hungnt2004110032.buoi02;

public class StudentTestDrive {
    public static void main(String[] args) {

        Student tuanStudent = new Student("Nguyen Minh Tuan", 18, "Nam", "CNTT", 1.5);
        tuanStudent.hoc();
        tuanStudent.thi();
        tuanStudent.dangKyMonHoc();

        System.out.println("------------------------------");
        Student ducStudent = new Student("Le Viet Duc", 19, "Nam", "CNTT", 2.0);
        ducStudent.hoc();
        ducStudent.thi();
        ducStudent.dangKyMonHoc();

        System.out.println("------------------------------");
        Student hungStudent = new Student("Nguyen Truong Hung", 20, "Nam", "CNTT", 2.5);
        hungStudent.hoc();
        hungStudent.thi();
        hungStudent.dangKyMonHoc();
    }
}
