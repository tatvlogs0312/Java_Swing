import model.Person;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSach {
    private int sl;
    private Person[] person;

    public DanhSach(int sl , Person[] person) {
        this.sl = sl;
        this.person = person;
    }

    public DanhSach(){

    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong : ");
        sl = sc.nextInt();
        person = new Person[sl];
        for(int i = 0 ; i < sl ; i++){
            person[i] = new Person();
            person[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("Số lượng : " + sl);
        for(int i = 0 ; i < sl ; i++){
            person[i].xuat();
        }
    }

}
