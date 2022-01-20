package com.hungnt2004110032.buoi03;

public class StudentTestDrive {
    public static void main(String[] args) {

        Student tuanStudent = new Student("Nguyen Minh Tuan", 18, "Nam", "CNTT", 6.5);
        tuanStudent.show();

        Student ducStudent = new Student("Le Viet Duc", 19, "Nam", "CNTT", 5.0);
        ducStudent.show();

        Student hungStudent = new Student("Nguyen Truong Hung", 20, "Nam", "CNTT", 5.5);
        hungStudent.show();
    }
}
