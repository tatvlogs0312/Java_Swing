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
public class SPController {

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
    
    public SanPham getSanPham(String MaSP) {
        SanPham sp = new SanPham();

        Connection cn = connectDB.getConnection();

        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L where L.Maloai=S.Maloai AND S.MaSP = ?";

        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, MaSP);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                sp.setMaSP(rs.getString("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setDonGia(rs.getFloat("Dongia"));
                sp.setMaLoai(rs.getString("Tenloai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SPController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sp;
    }
    
    public String getMaLoai(String tenLoai) {
        String sql = "SELECT MaLoai FROM LoaiSP WHERE Tenloai = ?";

        String tenL = "";

        Connection cn = connectDB.getConnection();

        try {
            PreparedStatement st = cn.prepareStatement(sql);
            st.setString(1, tenLoai);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                tenL = rs.getString("MaLoai");               
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tenL;
    }
    
    

    public List<String> getLoaiSP() {
        String sql = "SELECT MaLoai FROM LoaiSP L";

        List<String> lst = new ArrayList<>();

        Connection cn = connectDB.getConnection();

        try {
            PreparedStatement st = cn.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String MaLoai = rs.getString("MaLoai");
                lst.add(MaLoai);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;
    }

    public boolean insertData(SanPham sp) throws SQLException {
        String sql = "INSERT INTO SanPham (MaSP, TenSP, DonGia, MaLoai) VALUES (?, ?, ?, ?)";

        Connection cn = connectDB.getConnection();

        PreparedStatement st = cn.prepareStatement(sql);
        st.setString(1, sp.getMaSP());
        st.setString(2, sp.getTenSP());
        st.setDouble(3, sp.getDonGia());
        st.setString(4, sp.getMaLoai());

        int kq = st.executeUpdate();

        return kq > 0;
    }
    
    public boolean updateData(SanPham sp) throws SQLException {
        String sql = "update SanPham set TenSP = ? , DonGia = ? , MaLoai = ? WHERE MaSP = ?";
        
        Connection cn = connectDB.getConnection();
             
        PreparedStatement st = cn.prepareStatement(sql);       
        
        st.setString(1, sp.getTenSP());
        st.setDouble(2, sp.getDonGia());
        st.setString(3, sp.getMaLoai());
        st.setString(4, sp.getMaSP());
        
        int rs = st.executeUpdate();
        
        return rs > 0;
    }
    
    public boolean deleteData(String MaSP) throws SQLException {
        String sql = "Delete from SanPham where MaSP = ?";
                
        Connection cn = connectDB.getConnection();
        
        PreparedStatement st = cn.prepareStatement(sql);       
        st.setString(1, MaSP);
        
        int rs = st.executeUpdate();
        
        return rs > 0;
    }
    
    
}
