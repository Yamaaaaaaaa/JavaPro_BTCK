/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Data;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        try {
            int checkLsF = 1;
            Data data = new Data("D:\\A.Documents\\Code\\JAVA\\Project\\ProReader_JavaPro\\src\\main\\java\\sourceFilePDF\\pdfFileDemo_Text.pdf");
            UIManager.setLookAndFeel(new FlatLightLaf());
            MainView view = new MainView(data); 
            view.open();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
