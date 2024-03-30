/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

/**
 *
 * @author Admin
 */
public class Data {
    public File file;
    public PDDocument document;
    public Book book;
    public Vector<PDPage> list = new Vector<PDPage>();
    public Data(Book book){
        this.book = book;
        this.file = new File(book.getBookPath());
        this.init();
    }
    private void init(){
        try {
            this.document = PDDocument.load(file);
            if(this.document.getNumberOfPages() % 2 != 0){
                this.document.addPage(new PDPage());
            }
            for(int i = 0; i < document.getNumberOfPages(); i++){
                list.add(document.getPage(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
