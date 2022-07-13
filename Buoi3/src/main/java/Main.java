import model.Student;
import shape.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        DanhSach ds = new DanhSach();
//        ds.nhap();
//        ds.xuat();
//
//        Student student = new Student();
//        student.nhap();
//        student.xuat();
//
//        Student student2 = new Student("1","a",20,"123",9.5);
//        student2.xuat();
//        System.out.println(student2.toString());

//--------------------------------------------------------------------------------
//        Square square = new Square();
//        square.Nhap();
//        square.Xuat();
//        System.out.println(square.DTich());
//
//        Circle circle = new Circle();
//        circle.Nhap();
//        circle.Xuat();
//        System.out.println(circle.DTich());
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.Nhap();
//        rectangle.Xuat();
//        System.out.println(rectangle.DTich());


//--------------------------------------------------------------------------------
//      Tính đa hình
//        Shape shape = new Shape();
//
//        shape = new Square();
//        shape.Nhap();
//        shape.Xuat();
//        System.out.println(shape.DTich());
//
//        shape = new Circle();
//        shape.Nhap();
//        shape.Xuat();
//        System.out.println(shape.DTich());
//
//        shape = new Rectangle();
//        shape.Nhap();
//        shape.Xuat();
//        System.out.println(shape.DTich());


//--------------------------------------------------------------------------------
//        Interface
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng : ");
        int n = sc.nextInt();
        IShape[] arr = new IShape[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("1-H�nh vuông \n2-Hình chữ nhật \n3-Hình tròn");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr[i] = new Square();
                    break;
                case 2:
                    arr[i] = new Rectangle();
                    break;
                case 3:
                    arr[i] = new Circle();
                    break;
            }
            arr[i].Nhap();
        }

        System.out.println();
        System.out.println("Danh sách : ");
        for (int i = 0 ; i < n ; i++){
            arr[i].Xuat();
            System.out.println(arr[i].DTich());
        }
//--------------------------------------------------------------------------------

    }
}
