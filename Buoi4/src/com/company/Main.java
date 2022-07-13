package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //try catch
//------------------------------------------------------------------------------
	    try{
            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap a : ");
            a = sc.nextInt();
            System.out.print("Nhap b : ");
            b = sc.nextInt();
            System.out.println("Kq : " + -b/a);
        }
        catch (Exception ex){
            System.out.println("Lỗi : " + ex.getMessage());
        }
//        catch (ArithmeticException ex){
//            System.out.println("Lỗi : " + ex.getMessage());
//        }
//        catch (InputMismatchException ex){
//            System.out.println("Lỗi : " + ex.getMessage());
//        }
//------------------------------------------------------------------------------

    }
}
