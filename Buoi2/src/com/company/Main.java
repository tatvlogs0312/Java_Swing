package com.company;

import java.util.Scanner;

public class Main {

    public static void timmUoc(){
        Scanner sc = new Scanner(System.in);
        int a;
        int dem = 0;

        do {
            System.out.print("\nNhập a : ");
            a = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                if(a % i == 0){
                    System.out.print(i + " ");
                    dem++;
                }
            }
        }
        while (a > 0);

        System.out.println("\n");

        if(dem == 2){
            System.out.println(a + " là số nguyên tố");
        }
        else{
            System.out.println(a + " không phải là số nguyên tố");
        }
    }

    public static void giaiPTBac1(){
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
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            double c = -b / a;
            System.out.println("Phương trình có nghiệm : " + c);
        }
    }

    public static void main(String[] args) {
//	    giaiPTBac1();
//      timmUoc();
    }
}
