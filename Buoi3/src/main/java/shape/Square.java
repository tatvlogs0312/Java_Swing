package shape;

import java.util.Scanner;

public class Square implements IShape{
    private float a;

    public Square(float a) {
        this.a = a;
    }

    public Square(){}

    @Override
    public void Nhap() {
        System.out.println("Nhập hình vuông : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextFloat();
    }

    @Override
    public void Xuat() {
        System.out.println("Hình vuông : " + a);
    }

    @Override
    public float DTich() {
        return a * a;
    }
}
