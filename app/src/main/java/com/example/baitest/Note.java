package com.example.baitest;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "AppNote")
public class Note implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tenNote;
    private String ngay;
    private String ghiChu;
    private String color;

    public Note() {
    }

    public Note(String tenNote, String ngay, String ghiChu, String color) {
        this.tenNote = tenNote;
        this.ngay = ngay;
        this.ghiChu = ghiChu;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNote() {
        return tenNote;
    }

    public void setTenNote(String tenNote) {
        this.tenNote = tenNote;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
