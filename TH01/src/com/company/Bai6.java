package com.company;

import java.util.Scanner;

public class Bai6 {
    public void bai6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1 ; i <= n ; i++){
            sum *= i;
        }
        System.out.println(n + "! = " + sum);
    }
}
