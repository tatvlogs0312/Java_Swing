/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Tran Anh Tuan
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private float  DonGia;
    private String Tenloai;

    public SanPham(String MaSP, String TenSP, float DonGia, String Tenloai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.Tenloai = Tenloai;
    }

    public SanPham() {
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public Float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public String getMaLoai() {
        return Tenloai;
    }

    public void setMaLoai(String Tenloai) {
        this.Tenloai = Tenloai;
    }
    
    
}
