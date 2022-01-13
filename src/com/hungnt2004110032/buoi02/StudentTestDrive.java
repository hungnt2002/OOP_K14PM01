package com.hungnt2004110032.buoi02;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student student;
        student = new Student("Nguyen Minh Tuan", 18, "Nam", "CNTT", 1.5);
        student.hoc();
        student.thi();
        student.dangKyMonHoc();
        student = new Student("Le Viet Duc", 18, "Nam", "CNTT", 2.0);
        student.hoc();
        student.thi();
        student.dangKyMonHoc();
        student = new Student("Nguyen Truong Hung", 18, "Nam", "CNTT", 2.5);
        student.hoc();
        student.thi();
        student.dangKyMonHoc();
    }
}
