/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap01.Proccess;

import com.mycompany.lap01.Model.ILoaiSP;
import com.mycompany.lap01.database.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Anh Tuan
 */
public class LoaiSP {

    public Connect cn = new Connect();

    public List<ILoaiSP> getLoaiSP() throws SQLException {
        List<ILoaiSP> list = new ArrayList<>();
        String sql = "SELECT * FROM LoaiSP";
        Connection db = cn.getConnection();
        PreparedStatement st = db.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            String maLoai = rs.getString("MaLoai");
            String tenLoai = rs.getString("TenLoai");
            ILoaiSP loaiSP = new ILoaiSP(maLoai, tenLoai);
            list.add(loaiSP);
        }
        return list;
    }

    public ILoaiSP getLoaiSP(String ml) throws SQLException {
        
        String sql = "SELECT * FROM LoaiSP where Maloai=?";
        
        Connection db = cn.getConnection();
        
        db.setAutoCommit(false);
        PreparedStatement st = db.prepareStatement(sql);       
        st.setString(1, ml);
        db.commit();
        db.setAutoCommit(true);
        
        ResultSet rs = st.executeQuery();
        String maLoai = rs.getString("MaLoai");
        String tenLoai = rs.getString("TenLoai");
        ILoaiSP loaiSP = new ILoaiSP(maLoai, tenLoai);

        return loaiSP;
    }
 
    public boolean insertData(ILoaiSP obj) throws SQLException {
        String sql = "INSERT INTO LoaiSP values(?, ?)";
        
        Connection db = cn.getConnection();
        
        db.setAutoCommit(false);
        PreparedStatement st = db.prepareStatement(sql);       
        st.setString(1, obj.getMaLoai());
        st.setString(2, obj.getTenLoai());
        db.commit();
        db.setAutoCommit(true);
        
        int rs = st.executeUpdate();
        
        return rs > 0;
    }
    
    public boolean EditData(ILoaiSP obj) throws SQLException {
        String sql = "Update LoaiSP set Tenloai=? where Maloai=?";
        
        Connection db = cn.getConnection();
        
        db.setAutoCommit(false);
        PreparedStatement st = db.prepareStatement(sql);       
        st.setString(1, obj.getMaLoai());
        st.setString(2, obj.getTenLoai());
        db.commit();
        db.setAutoCommit(true);
        
        int rs = st.executeUpdate();
        
        return rs > 0;
    }
    
    public boolean DeleteData(String ml) throws SQLException {
        String sql = "Delete from LoaiSP where Maloai=?";
                
        Connection db = cn.getConnection();
        
        db.setAutoCommit(false);
        PreparedStatement st = db.prepareStatement(sql);       
        st.setString(1, ml);
        db.commit();
        db.setAutoCommit(true);
        
        int rs = st.executeUpdate();
        
        return rs > 0;
    }
    
    

}
