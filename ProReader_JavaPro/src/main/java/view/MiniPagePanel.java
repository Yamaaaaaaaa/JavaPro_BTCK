/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class MiniPagePanel extends JPanel{
    public BufferedImage image;
    public MiniPagePanel(){
        this.setLayout(new FlowLayout());
    }
    public void draw(BufferedImage image){
        this.image = image;
        this.repaint();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.drawImage(image, 0,0,500,600,this);
        g.dispose();
    }
}
