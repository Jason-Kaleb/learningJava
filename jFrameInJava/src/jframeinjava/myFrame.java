package jframeinjava;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame
{
    myFrame()
    {
       this.setTitle("My Frame"); // sets title of frame
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
       this.setResizable(false);  // prevents frame from being resized
       this.setSize(840, 420);  // sets the x-dimension and y-dimension of frame
       this.setVisible(true);
       
       ImageIcon image = new ImageIcon("JzTrackr.png"); // create an ImageIcon
       this.setIconImage(image.getImage()); // change icon of frame
       this.getContentPane().setBackground(new Color(0xff4500));
    }
}
