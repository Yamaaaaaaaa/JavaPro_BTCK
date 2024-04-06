package test;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.DataHandler;
import view.MainFrame;

public class JavaPro_ProReader {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            
            DataHandler dataHandler = new DataHandler();
            dataHandler.Read_Libarary();
            dataHandler.Read_Recent_Book_List();
            
            MainFrame mainFrame = new MainFrame(dataHandler);
            mainFrame.add_LibraryList_to_table();
            mainFrame.add_RecentList_to_table();
            mainFrame.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(JavaPro_ProReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
