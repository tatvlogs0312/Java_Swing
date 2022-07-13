/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buoi5.model;

/**
 *
 * @author Tran Anh Tuan
 */
public class LopHoc {

    private String id;
    private String ten;
    
    public LopHoc(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public LopHoc() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
