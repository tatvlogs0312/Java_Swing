package shape;

import java.util.Scanner;

public class Circle implements IShape{
    private float a;

    public Circle(float a) {
        this.a = a;
    }

    public Circle(){}

    @Override
    public void Nhap() {
        System.out.println("Nhập hình tròn : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hình tròn : " + a);
    }

    @Override
    public float DTich() {
        return (float) Math.PI * a * a;
    }
}
