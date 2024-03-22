package view;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("My Calculator");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);


        // B1: Tạo các JPanel: chứa các layout gồm các thành phần con.
            // jPanel cho Text Feild
            JTextField jTextField = new JTextField(100);
            JPanel jPanel_head = new JPanel();
            jPanel_head.setLayout(new BorderLayout());
            jPanel_head.add(jTextField, BorderLayout.CENTER);


            // jPanel cho Button
            JButton jButton_0 = new JButton("0");
            JButton jButton_1 = new JButton("1");
            JButton jButton_2 = new JButton("2");
            JButton jButton_3 = new JButton("3");
            JButton jButton_4 = new JButton("4");
            JButton jButton_5 = new JButton("5");
            JButton jButton_6 = new JButton("6");
            JButton jButton_7 = new JButton("7");
            JButton jButton_8 = new JButton("8");
            JButton jButton_9 = new JButton("9");

            JButton jButton_Cong = new JButton("+");
            JButton jButton_Tru = new JButton("-");
            JButton jButton_Nhan = new JButton("*");
            JButton jButton_Chia = new JButton("/");
            JButton jButton_Bang = new JButton("=");

            JPanel jPanel_Buttons = new JPanel();
            jPanel_Buttons.setLayout(new GridLayout(5,3));

            jPanel_Buttons.add(jButton_0);
            jPanel_Buttons.add(jButton_1);
            jPanel_Buttons.add(jButton_2);
            jPanel_Buttons.add(jButton_3);
            jPanel_Buttons.add(jButton_4);
            jPanel_Buttons.add(jButton_5);
            jPanel_Buttons.add(jButton_6);
            jPanel_Buttons.add(jButton_7);
            jPanel_Buttons.add(jButton_8);
            jPanel_Buttons.add(jButton_9);
            jPanel_Buttons.add(jButton_Cong);
            jPanel_Buttons.add(jButton_Tru);
            jPanel_Buttons.add(jButton_Nhan);
            jPanel_Buttons.add(jButton_Chia);
            jPanel_Buttons.add(jButton_Bang);

        //B2: Add các JPanel vô JFrame(giao diện chính)
        //Có thể hiểu là Jpanel là 1 container, là các layout con để add vô layout chính.

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_Buttons, BorderLayout.CENTER);



        // Show:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            // Look And Feel: Giao diện cho từng hệ điều hành

            // Nên SD: Hệ điều hành dựa trên chính máy tính của mình
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());// Lấy giao diện mặc định của hệ thống và run nó

            // SD: Hệ điều hành khác:
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");// Lấy giao diện mặc định của hệ thống và run nó
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");// Lấy giao diện mặc định của hệ thống và run nó


            MyCalculator mc = new MyCalculator();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
