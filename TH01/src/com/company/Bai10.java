package com.company;

import java.util.Scanner;

public class Bai10 {
    public void nhap(int[][] a, int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập a[" + i + "][" + j + "] : ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void xuat(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void min(int[][] a, int m, int n) {
        int min = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }

        System.out.println("Min : " + min);
    }

    public void leMax(int[][] a, int m, int n) {
        int dem = 0;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 == 1) {
                    max = a[i][j];
                    dem++;
                    break;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((a[i][j] > max) && (a[i][j] % 2 == 1)) {
                    max = a[i][j];
                }
            }
        }

        if(dem != 0){
            System.out.println("Max : " + max);
        }
        else{
            System.out.println("Không có phần tử lẻ nào");
        }
    }

    public void tong(int[][] a, int m, int n) {
        int max = 0;
        int vitri = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
            if(sum >= max){
               max = sum;
               vitri = i;
            }
        }

        System.out.println("Dòng có tổng lớn nhất : " + max + " - vị trí i : " + vitri);
    }

}
