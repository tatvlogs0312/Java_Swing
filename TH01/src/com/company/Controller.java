package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    public void controller(){
        boolean isCheck = false;
        Scanner sc = new Scanner(System.in);
        while(!isCheck){
            menu();
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    Bai1 bai1 = new Bai1();
                    bai1.bai1();
                    break;
                case 2:
                    Bai2 bai2 = new Bai2();
                    bai2.giaiPT1();
                    break;
                case 3:
                    Bai3 bai3 = new Bai3();
                    bai3.giaiPT2();
                    break;
                case 4:
                    Bai4 bai4 = new Bai4();
                    bai4.bai4();
                    break;
                case 5:
                    Bai5 bai5 = new Bai5();
                    bai5.bai5();
                    break;
                case 6:
                    Bai6 bai6 = new Bai6();
                    bai6.bai6();
                    break;
                case 7:
                    Bai7 bai7 = new Bai7();
                    bai7.bai7();
                    break;
                case 8:
                    Bai8 bai8 = new Bai8();
                    bai8.bai8();
                    break;
                case 9:
                    System.out.print("Nhập số phần tử : ");
                    int n = sc.nextInt();
                    int []a = new int[n];
                    Bai9 bai9 = new Bai9();

                    bai9.nhap(a,n);
                    System.out.print(Arrays.toString(a));
                    System.out.println();

                    bai9.maxMin(a,n);

                    bai9.demSoPTChan(a,n);

                    System.out.println("Danh sách số nguyên tố : ");
                    bai9.dsSoNguyenTo(a,n);
                    System.out.println();

                    System.out.println("Mảng sau khi sắp xếp : ");
                    Arrays.sort(a);
                    System.out.println(Arrays.toString(a));

                    System.out.print("Nhập số cần tìm : ");
                    int x = sc.nextInt();
                    bai9.timKiem(a,n,x);
                    break;

                case 10:
                    System.out.print("Nhập số hàng : ");
                    int hang = sc.nextInt();
                    System.out.print("Nhập số cột : ");
                    int cot = sc.nextInt();
                    int [][] arr = new int[hang][cot];
                    Bai10 bai10 = new Bai10();
                    bai10.nhap(arr,hang,cot);
                    bai10.xuat(arr,hang,cot);
                    bai10.min(arr,hang,cot);
                    bai10.leMax(arr,hang,cot);
                    bai10.tong(arr,hang,cot);
                    break;
                default:
                    System.out.println("Kết thúc chương trình !!!");
                    isCheck = true;
            }
        }
    }

    public static void menu(){
        System.out.println("1 - Bài 1");
        System.out.println("2 - Bài 2");
        System.out.println("3 - Bài 3");
        System.out.println("4 - Bài 4");
        System.out.println("5 - Bài 5");
        System.out.println("6 - Bài 6");
        System.out.println("7 - Bài 7");
        System.out.println("8 - Bài 8");
        System.out.println("9 - Bài 9");
        System.out.println("10 - Bài 10");
        System.out.println("Nhập bất kì để thoát");
        System.out.print("Nhập lựa chọn : ");
    }
}
