package com.company;

import java.util.Scanner;

public class Bai4 {
    public void bai4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0 ; i <= n ; i++){
            sum += i;
        }
        System.out.println("Tổng từ 1 -> " + n + " : " + sum);
    }
}
