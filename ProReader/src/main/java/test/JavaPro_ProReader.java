package test;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.DataHandler;
import view.LibraryFrame;

public class JavaPro_ProReader {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            
            DataHandler dataHandler = new DataHandler();
            dataHandler.Read_Libarary();
            dataHandler.Read_Recent_Book_List();
            
            LibraryFrame libraryFrame = new LibraryFrame(dataHandler);
            libraryFrame.add_LibraryList_to_table();
            libraryFrame.add_RecentList_to_table();
            libraryFrame.open();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JavaPro_ProReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
