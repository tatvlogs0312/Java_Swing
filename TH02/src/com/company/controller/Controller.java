package com.company.controller;

import com.company.model.HinhTamGiac;
import com.company.model.HinhTron;
import com.company.model.KhachHang;
import com.company.model.NhanVien;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    public void controller() {
        boolean isCheck = false;
        Scanner sc = new Scanner(System.in);
        while (!isCheck) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    HinhTron hinhTron = new HinhTron();
                    hinhTron.nhap();
                    System.out.println("Chu vi hình tròn : " + hinhTron.chuVi());
                    System.out.println("Diện tích hình tròn : " + hinhTron.dienTich());
                    break;
                case 2:
                    HinhTamGiac hinhTamGiac = new HinhTamGiac();
                    hinhTamGiac.nhap();
                    if (hinhTamGiac.isTamGiac()) {
                        System.out.println("Chu vi hình tam giác : " + hinhTamGiac.getChuVi());
                        System.out.println("Diện tích hình tam giác : " + hinhTamGiac.getDienTich());
                    } else {
                        System.out.println("Không phải hình tam giác");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số lượng nhân viên : ");
                    int slnv = sc.nextInt();
                    NhanVien[] arrNV = new NhanVien[slnv];
                    for (int i = 0; i < slnv; i++) {
                        arrNV[i] = new NhanVien();
                        arrNV[i].nhap();
                    }
                    NhanVien tieuDe = new NhanVien();
                    tieuDe.xuatTieuDe();
                    for (int i = 0; i < slnv; i++) {
                        System.out.println(arrNV[i].toString());
                    }
                    break;
                case 4:
                    System.out.print("Nhập số lượng khách hàng : ");
                    int slkh = sc.nextInt();
                    KhachHang[] arrKH = new KhachHang[slkh];
                    for (int i = 0; i < slkh; i++) {
                        arrKH[i] = new KhachHang();
                        arrKH[i].nhap();
                    }
                    System.out.println("Danh sách : ");
                    for (int i = 0; i < slkh; i++) {
                        arrKH[i].xuat();
                    }

                    for (int i = 0; i < slkh - 1; i++) {
                        for (int j = 0; j < slkh - i - 1; j++) {
                            if (arrKH[j].tongTien() < arrKH[j + 1].tongTien()) {
                                KhachHang temp = new KhachHang();
                                temp = arrKH[j];
                                arrKH[j] = arrKH[j + 1];
                                arrKH[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Danh sách sau khi sắp xếp : ");
                    for (int i = 0; i < slkh; i++) {
                        arrKH[i].xuat();
                    }
                    break;
                default:
                    System.out.println("Kết thúc chương trình !!!");
                    isCheck = true;
            }
        }
    }

    public static void menu() {
        System.out.println("1 - Bài 1");
        System.out.println("2 - Bài 2");
        System.out.println("3 - Bài 3");
        System.out.println("4 - Bài 4");
        System.out.println("Nhập bất kì để thoát");
        System.out.print("Nhập lựa chọn : ");
    }
}

