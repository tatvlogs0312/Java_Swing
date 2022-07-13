package com.company;

import java.util.Scanner;

public class Bai8 {
    public void bai8(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextInt();
        System.out.print("Nhập b : ");
        b = sc.nextInt();
        int temp1 = a;
        int temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int ucln = temp1;
        int bcnn = (a * b)/ucln;
        System.out.println("UCLN : " + ucln);
        System.out.println("BCNN : " + bcnn);
    }
}
