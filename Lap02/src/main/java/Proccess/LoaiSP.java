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
public class LoaiSP {
    public ConnectDB connectDB = new ConnectDB();
    
    public List<SanPham> getSPTheoloai(String ml){
        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L where L.Maloai=S.Maloai and L.Maloai=?";
        
        List<SanPham> lst = new ArrayList<>();
        
        Connection cn = connectDB.getConnection();
        
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setNString(1, ml);
            
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
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }
    
     public List<SanPham> getSP(){
        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L where L.Maloai=S.Maloai";
        
        List<SanPham> lst = new ArrayList<>();
        
        Connection cn = connectDB.getConnection();
        
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            
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
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }

    public List<String> getLoaiSP() {
        String sql = "SELECT MaLoai FROM LoaiSP L";
        
        List<String> lst = new ArrayList<>();
        
        Connection cn = connectDB.getConnection();
        
        try {
            PreparedStatement st = cn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String MaLoai = rs.getString("MaLoai");
                lst.add(MaLoai);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }
}
