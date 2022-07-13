package shape;

import java.util.Scanner;

public class Rectangle implements IShape {
    private float a;
    private float b;

    public Rectangle(float a,float b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(){}

    @Override
    public void Nhap() {
        System.out.println("Nhập hình chữ nhật : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextFloat();
        System.out.print("Nhập b : ");
        b = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hình chữ nhật : " + a + " - " + b);
    }

    @Override
    public float DTich() {
        return a * b;
    }
}
