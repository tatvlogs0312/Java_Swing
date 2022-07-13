package com.mycompany.buoi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Tran Anh Tuan
 */
public class Buoi1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        //Nhập - BufferedReader
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhập tên : ");
        String name = rd.readLine();
        System.out.print("Nhập tuổi : ");
        int age = Integer.parseInt(rd.readLine());
        System.out.println("Hello " + name + " - " + age + " tuổi");


        //Nhập - Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        String name2 = sc.nextLine();
        System.out.print("Nhập tuổi : ");
        int age2 = sc.nextInt();
        System.out.println("Hello " + name2 + " - " + age2 + " tuổi");
    }
}
