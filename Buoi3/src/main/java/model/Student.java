package model;

import java.util.Scanner;

public class Student extends Person{
    private String masv;
    private double dtb;

    public Student(String id, String name, int age, String masv , double dtb) {
        super(id, name, age);
        this.masv = masv;
        this.dtb = dtb;
    }

    public Student() {
        super();
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập mã sinh viên : ");
        masv = sc.nextLine();
        System.out.print("Nhập điểm trung bình : ");
        dtb = sc.nextDouble();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.println(" - " + masv + " - " + dtb);
    }

    @Override
    public String toString() {
        return "Student{" +
                "masv='" + masv + "\' " +
                super.toString() +
                ", dtb=" + dtb +
                "} ";
    }
}