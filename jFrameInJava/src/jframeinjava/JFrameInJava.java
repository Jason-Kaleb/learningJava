package jframeinjava;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

/*
    JFrame = a GUI window to
    add components to
*/

public class JFrameInJava
{
    public static void main(String[] args)
    {
//       // theres a better and neater way of doing this 
//       JFrame frame = new JFrame();  // creates frame
//       
//       frame.setTitle("My Frame"); // sets title of frame
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//       frame.setResizable(false);  // prevents frame from being resized
//       frame.setSize(840, 420);  // sets the x-dimension and y-dimension of frame
//       frame.setVisible(true);
//       
//       ImageIcon image = new ImageIcon("JzTrackr.png"); // create an ImageIcon
//       frame.setIconImage(image.getImage()); // change icon of frame
//       frame.getContentPane().setBackground(new Color(0xff4500));
       
       myFrame newframe = new myFrame();
    }
}
