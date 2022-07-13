package com.company;

import java.util.Scanner;

public class Bai7 {
    public void bai7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        int sum = 1;
        if(n % 2 == 1){
            for (int i = 1 ; i <= n ; i = i + 2){
                sum *= i;
            }
        }
        else {
            for (int i = 2 ; i <= n ; i = i + 2){
                sum *= i;
            }
        }
        System.out.println(n + "! = " + sum);
    }
}
