package com.company.model;

import java.util.Scanner;

public class KhachHang{
    private String tenKH;
    private String caoVoi;
    private String tayTrang;
    private int nhoRang;
    private int tramRang;

    public KhachHang(){

    }

    public KhachHang(String tenKH, String caoVoi, String tayTrang, int nhoRang, int tramRang) {
        this.tenKH = tenKH;
        this.caoVoi = caoVoi;
        this.tayTrang = tayTrang;
        this.nhoRang = nhoRang;
        this.tramRang = tramRang;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getCaoVoi() {
        return caoVoi;
    }

    public void setCaoVoi(String caoVoi) {
        this.caoVoi = caoVoi;
    }

    public String getTayTrang() {
        return tayTrang;
    }

    public void setTayTrang(String tayTrang) {
        this.tayTrang = tayTrang;
    }

    public int getNhoRang() {
        return nhoRang;
    }

    public void setNhoRang(int nhoRang) {
        this.nhoRang = nhoRang;
    }

    public int getTramRang() {
        return tramRang;
    }

    public void setTramRang(int tramRang) {
        this.tramRang = tramRang;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng : ");
        tenKH = sc.nextLine();

        do {
            System.out.print("Khách hàng có cạo vôi không (yes  hoặc no) : ");
            caoVoi = sc.nextLine();
            if(!caoVoi.equals("yes") && !caoVoi.equals("no")){
                System.out.println("Nhập sai , yêu cầu nhập lại");
            }
        }
        while (!caoVoi.equals("yes") && !caoVoi.equals("no"));

        do {
            System.out.print("Khách hàng có tẩy trắng không ? (yes  hoặc no) : ");
            tayTrang = sc.nextLine();
            if(!tayTrang.equals("yes") && !tayTrang.equals("no")){
                System.out.println("Nhập sai , yêu cầu nhập lại");
            }
        }
        while (!tayTrang.equals("yes") && !tayTrang.equals("no"));

        System.out.print("Nhập số lượng răng nhổ : ");
        nhoRang = sc.nextInt();

        System.out.print("Nhập số lượng răng trám : ");
        tramRang = sc.nextInt();
    }

    public long tongTien(){
        if(caoVoi.equals("yes")){
            return 100000L + nhoRang*150000L + tramRang*200000L;
        }
        else if(tayTrang.equals("yes")){
            return 1500000L + nhoRang*150000L + tramRang*200000L;
        }
        else if(tayTrang.equals("yes") && caoVoi.equals("yes")){
            return 1500000L + 100000L + nhoRang*150000L + tramRang*200000L;
        }
        return nhoRang*150000L + tramRang*200000L;
    }

    public void xuat(){
        System.out.println("Tên : " + tenKH + " - Cạo vôi : " + caoVoi + " - Tẩy trắng : "
                + tayTrang + " - Răng nhổ : " + nhoRang + " - Trám răng : " + tramRang + " - Tổng tiền : " + tongTien());
    }

}
