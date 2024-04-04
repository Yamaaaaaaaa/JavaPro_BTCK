/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Admin
 */


// PHẢI ĐÁNH DÁU SERIALIZABLE ĐỂ CÓ THỂ ĐỌC GHI NÓ VÀO FILE 
public class Book implements Serializable{
    private String bookPath;
    private String bookName;
    public Vector<String> listBookMark;
    public Vector<String> listBookMark_Note;
    public Book(String bookPath, String bookName, Vector<String> listBookMark,Vector<String> listBookMark_Note) {
        this.bookPath = bookPath;
        this.bookName = bookName;
        this.listBookMark = listBookMark;
        this.listBookMark_Note = listBookMark_Note;
    }

    public String getBookPath() {
        return bookPath;
    }

    public void setBookPath(String bookPath) {
        this.bookPath = bookPath;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Vector<String> getListBookMark() {
        return listBookMark;
    }

    public void setListBookMark(Vector<String> listBookMark) {
        this.listBookMark = listBookMark;
    }
    
    
}
