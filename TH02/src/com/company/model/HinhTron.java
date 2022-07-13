package com.company.model;

import java.util.Scanner;

public class HinhTron {
    private double r;

    public HinhTron(){

    }

    public HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính : ");
        r = sc.nextDouble();
    }

    public double chuVi(){
        return 2*r*Math.PI;
    }

    public double dienTich(){
        return Math.PI*r*r;
    }
}
