/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Data;

/**
 *
 * @author Admin
 */
public class MainView extends JFrame{
    public Data data;
    public Panel_show_PDF pdf;
    public HeaderPanel header;
    public FooterPanel footer;
    public MainView(Data data) {
        this.data = data;
        this.init();
        this.open();
    }
    private void init(){
        this.setTitle("ProReader");
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        

        pdf = new Panel_show_PDF(this.data);
        pdf.drawPage();
        
        
        
        footer = new FooterPanel(pdf);
        header = new HeaderPanel(this,data,pdf);
        
        this.add(header, BorderLayout.NORTH);
        this.add(pdf,BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setTheme(){
        try {
            if(this.header.checkLsF == 1){
                UIManager.setLookAndFeel(new FlatLightLaf());
            }
            else if(this.header.checkLsF == 2){
                UIManager.setLookAndFeel(new FlatDarkLaf());
            }
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(this);
        this.pack();
        this.setSize(1000,700);
    }
    public void open(){
        this.setVisible(true);
    }
}
