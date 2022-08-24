package com.example.baitest.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.baitest.Note;

import java.util.List;


@Dao
public interface DAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     void insert(Note note);

    @Query("SELECT * FROM AppNote ORDER BY id DESC ")
    List<Note> getAll();

    @Query("UPDATE AppNote SET tenNote = :tenNote, ngay = :ngay, ghiChu = :ghiChu, color = :color WHERE id = :id")
    void update(int id,String tenNote, String ngay, String ghiChu, String color);

    @Delete
    void delete(Note note);

}
