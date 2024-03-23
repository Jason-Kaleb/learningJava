package jpanelinjava;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

/*
    JPanel = a GUI component that
    functions as a container to hold
    other components
*/

public class JPanelInJava
{
    public static void main(String[] args)
    {
        JLabel label = new JLabel();
        
        label.setText("Hello World!!!");
        label.setForeground(Color.black);
        label.setFont(new Font("Railway", Font.BOLD, 30));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel redPanel = new JPanel();
        JPanel bluePanel = new JPanel();
        JPanel orangePanel = new JPanel();
        JPanel blackPanel = new JPanel();
        
        
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());
        
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        
        orangePanel.setBackground(new Color(0xff4500));
        orangePanel.setBounds(0, 250, 250, 250);
        
        blackPanel.setBackground(new Color(0x000000));
        blackPanel.setBounds(250, 250, 250, 250);
        
        JFrame frame = new JFrame();
        
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(orangePanel); 
        frame.add(blackPanel);
        redPanel.add(label);
    }
}
