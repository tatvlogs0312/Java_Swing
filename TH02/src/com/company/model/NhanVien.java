package com.company.model;

import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private int soSP;

    public NhanVien(){

    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        if(soSP > 0){
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }

    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if(soSP > 0){
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên : ");
        maNV = sc.nextLine();
        System.out.print("Nhập số lượng sản phẩm : ");
        soSP = sc.nextInt();
    }

    public boolean vuotChuan(){
        if(soSP > 500){
            return true;
        }
        return false;
    }

    public String getTongKet(){
        if(soSP > 500){
            return "Vượt";
        }
        return "";
    }

    public long getLuong(){
        if(soSP > 500){
            return 20000L*500 + (soSP - 500)* 30000L;
        }
        else {
            return 20000L *soSP;
        }
    }

    public void xuatTieuDe(){
        System.out.println("Mã Nhân Viên | Số Sản Phẩm | Lương | Tổng kết");
    }

    @Override
    public String toString() {
        return maNV + "\t" + soSP + "\t" + getLuong() + "\t" + getTongKet();
    }
}
