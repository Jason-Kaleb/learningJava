package jlabelinjava;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/*
    JLabel = a GUI display
    area for a string of text
    image or both
*/

public class JLabelInJava
{
    public static void main(String[] args)
    {
        ImageIcon icon = new ImageIcon("JzTrackr.png");
        Border border = BorderFactory.createLineBorder(new Color(0xff4500));
        
        JLabel label = new JLabel();  // create a label
        
        label.setText("JzTrackr");  // set text of label
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);  // set Text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set Text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0xff4500)); // set color of text
        label.setFont(new Font("Railway", Font.ITALIC, 36)); // set font of text, style and size
        label.setIconTextGap(10); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // set border
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal position of icon+text within label
//        label.setBounds(30, 40, 500, 600);  // set x, y position as well as size
        
        
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 700);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();  // resize the size of the frame to accomodate all of the components - use after adding all components    
        
    }
    
}
