package jlayeredpaneinjava;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *  JLayeredPane = Swing container that provides
 *  a third dimension for positioning components
 *  ex. depth, Z-index
 **/

public class JLayeredPaneInJava
{
    public static void main(String[] args)
    {
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        
        label1.setOpaque(true);
        label1.setBounds(50, 50, 100, 100);
        label1.setBackground(new Color(0xff4500));
        
        label2.setOpaque(true);
        label2.setBounds(100, 100, 100, 100);
        label2.setBackground(Color.red);
        
        label3.setOpaque(true);
        label3.setBounds(150, 150, 100, 100);
        label3.setBackground(Color.black);
        
        JLayeredPane layeredPane = new JLayeredPane();
        
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label1, Integer.valueOf(1));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(3));
        
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
        frame.setVisible(true);
    }
}
