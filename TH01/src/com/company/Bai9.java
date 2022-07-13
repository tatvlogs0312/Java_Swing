package com.company;

import java.util.Scanner;

public class Bai9 {
    public void nhap(int[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
    }

    public void maxMin(int[] a, int n) {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
            if (a[i] <= min) {
                min = a[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }

    public void demSoPTChan(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Số phần tử chẵn trong mảng : " + count);
    }

    public void dsSoNguyenTo(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (check(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public boolean check(int x) {
        int dem = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                dem++;
            }
        }
        if (dem == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void timKiem(int[] a, int n, int x) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Vị trí : " + i);
                dem++;
            }
        }

        if (dem == 0) {
            System.out.println("Không có phần tử nào !!");
        }
    }

}
