package com.company;

import java.util.Scanner;

public class Bai2 {
    public void giaiPT1(){
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextDouble();
        System.out.print("Nhập b : ");
        b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            System.out.println("Nghiệm của phương trình : " + -b/a);
        }
    }
}
