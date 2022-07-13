package com.company;

import java.util.Scanner;

public class Bai5 {
    public void bai5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1 ; i <= n ; i++){
            sum += (double) 1/i;
        }
        System.out.println("Tổng từ 1/1 -> 1/" + n + " : " + sum);
    }
}
