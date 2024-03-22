/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Graphics;
import model.Data;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.pdfbox.rendering.PDFRenderer;


/**
 *
 * @author Admin
 */
public class Panel_show_PDF extends JPanel{
    public Data data;
    public int countPage;
    public int currentPage;
    public PDFRenderer render;
    public BufferedImage image1;
    public BufferedImage image2;
    public MiniPagePanel page1;
    public MiniPagePanel page2;
    
    public Panel_show_PDF(Data data) {
        this.data = data;
        this.initData();
        this.initView();
    }
    private void initData(){
        this.countPage = this.data.document.getNumberOfPages();
        this.currentPage = 0;
        this.render = new PDFRenderer(this.data.document);
        this.page1 = new MiniPagePanel();
        this.page2 = new MiniPagePanel();
    }
    
    private void initView(){  
        this.setLayout(new GridLayout(1, 2, 20, 20));
        this.add(page1);
        this.add(page2);
    }
    public void drawPage(){
        try {
            this.image1 = render.renderImageWithDPI(this.currentPage,72);
            this.image2 = render.renderImageWithDPI(this.currentPage + 1, 72);
            this.page1.draw(this.image1);
            this.page2.draw(this.image2);
        } catch (IOException ex) {
            Logger.getLogger(Panel_show_PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void DownPage(){
        if(currentPage > 0){
            currentPage -= 2;
        }
    }
    public void UpPage(){
        if(currentPage < countPage - 2){
            currentPage += 2;
        }
    }
    
    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
