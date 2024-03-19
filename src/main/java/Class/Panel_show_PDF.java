/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;
import org.apache.pdfbox.pdmodel.PDPage;
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
    public Panel_show_PDF(Data data) {
        this.data = data;
        this.countPage = data.document.getNumberOfPages();
        this.currentPage = 0;
        this.render = new PDFRenderer(this.data.document);
        this.init();
    }
    
    private void init(){
        this.setLayout(new GridLayout(1, 2, 20, 20));
    }
    public void drawPage(){
        PDPage page1 = this.data.document.getPage(this.currentPage);
        PDPage page2 = this.data.document.getPage(this.currentPage + 1);
        
        
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        
    }
    
}
