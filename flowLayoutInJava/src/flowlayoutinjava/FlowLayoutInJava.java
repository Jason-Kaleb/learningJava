package flowlayoutinjava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;


/*
    Layout Manager = defines the 
    natural layout for components within a container
    FlowLayout = places components in a row, sized at their preferred size.
    If the horizontal space in a container is too small, the flowLayout class uses the next available row.
*/

public class FlowLayoutInJava
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JPanel panel = new JPanel();
        
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(new Color(0xff4500));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        
        
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
