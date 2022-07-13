package model;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private int age;

//    Contructer không tham số
    public Person(){

    }
//    Contructer không tham số
    public Person(String id,String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id : ");
        id = sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        age = sc.nextInt();
    }

    public void xuat(){
        System.out.print(id + " - " + name + " - " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                "} ";
    }
}