/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi5.controller;

import com.mycompany.buoi5.database.ConnectDB;
import com.mycompany.buoi5.model.LopHoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Anh Tuan
 */
public class Controller {
    //Thêm 1 lớp
    public boolean add(LopHoc lopHoc) {
        //b1: kết nối csdl
        ConnectDB connectDB = new ConnectDB();
        Connection conn = connectDB.getConnection();
        
        try {
//            //b2: tạo 1 phiên làm việc với csdl
//            Statement st = conn.createStatement();
//            
//            //b3: tạo truy vấn
//            String query = "insert into lophoc(id,ten) values ('" + lopHoc.getId() + "',N'" + lopHoc.getTen() + "')";
//            
//            //b4: tạo thực thi để thực thi truy vấn
//            int kt = st.executeUpdate(query);
//            if(kt == 1){
//                return true;
//            }
    
               //b2 : tạo truy vấn
               String query = "insert into lophoc(id,ten) values (?,?)";
               
               conn.setAutoCommit(false);
               PreparedStatement st = conn.prepareStatement(query);
               st.setString(1, lopHoc.getId());
               st.setString(2, lopHoc.getTen());
               conn.commit();
               conn.setAutoCommit(true);               
               int kt = st.executeUpdate();
               
               return kt > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
