/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;

import Database.ConnectDB;
import Entity.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Anh Tuan
 */
public class TimKiemController {
    ConnectDB connectDB = new ConnectDB();
    
    public List<SanPham> getAll() {
        List<SanPham> lst = new ArrayList<>();

        Connection cn = connectDB.getConnection();

        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L where L.Maloai=S.Maloai";

        try {
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String MaSP = rs.getString("MaSP");
                String TenSP = rs.getString("TenSP");
                Float Dongia = rs.getFloat("Dongia");
                String Tenloai = rs.getString("Tenloai");
                SanPham sp = new SanPham(MaSP, TenSP, Dongia, Tenloai);
                lst.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SPController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;
    }
    
    public List<SanPham> timKiemTheoTen(String tenSP){
        List<SanPham> lst = new ArrayList<>();
        
        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L where L.Maloai=S.Maloai AND S.TenSP = ?";
        
        Connection cn = connectDB.getConnection();
        
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, tenSP);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String MaSP = rs.getString("MaSP");
                String TenSP = rs.getString("TenSP");
                Float Dongia = rs.getFloat("Dongia");
                String Tenloai = rs.getString("Tenloai");
                SanPham sp = new SanPham(MaSP, TenSP, Dongia, Tenloai);
                lst.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TimKiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }
    
    public List<SanPham> timKiemTheoGia(float GiaTu , float GiaDen){
        List<SanPham> lst = new ArrayList<>();
        
        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L where L.Maloai=S.Maloai AND S.DonGia >= ? AND S.DonGia <= ?";
        
        Connection cn = connectDB.getConnection();
        
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setFloat(1, GiaTu);
            st.setFloat(1, GiaDen);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String MaSP = rs.getString("MaSP");
                String TenSP = rs.getString("TenSP");
                Float Dongia = rs.getFloat("Dongia");
                String Tenloai = rs.getString("Tenloai");
                SanPham sp = new SanPham(MaSP, TenSP, Dongia, Tenloai);
                lst.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TimKiemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }
}
