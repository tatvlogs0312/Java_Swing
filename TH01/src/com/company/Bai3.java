package com.company;

import java.util.Scanner;

public class Bai3 {
    public void giaiPT2(){
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextDouble();
        System.out.print("Nhập b : ");
        b = sc.nextDouble();
        System.out.print("Nhập c : ");
        c = sc.nextDouble();

        double delta = b*b-4*a*c;
        if(delta > 0){
            System.out.println("Phương trình có 2 nghiệm : ");
            System.out.println("x1 = " + (double)((-b + Math.sqrt(delta)) / (2*a)));
            System.out.println("x2 = " + (double)((-b - Math.sqrt(delta)) / (2*a)));
        }
        else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép : ");
            System.out.println("x = " + (double)((-b + Math.sqrt(delta)) / (2*a)));
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
