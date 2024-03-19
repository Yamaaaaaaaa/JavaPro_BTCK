/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Admin
 */
public class MainView extends JFrame{

    public MainView() {
        this.init();
        this.open();
    }
    private void init(){
        this.setTitle("ProReader");
        this.setSize(800, 450);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(1,1));
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void open(){
        this.setVisible(true);
    }
}
