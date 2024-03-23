package jbuttoninjava;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class frame extends JFrame implements ActionListener
{
    JButton button;
    JLabel label;
    
    frame()
    {
        button = new JButton();
        label = new JLabel();
        
        label.setText("Jason");
        label.setBounds(155, 20, 100, 100);
        label.setForeground(new Color(0xff4500));
        label.setFont(new Font("Courier", Font.BOLD, 30));
        label.setVisible(false);
        
        button.setBounds(100, 100, 200, 40);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setFont(new Font("Railway", Font.BOLD, 26));
        button.setForeground(Color.white);
        button.setBackground(new Color(0xff4500));
        button.setBorder(BorderFactory.createEtchedBorder());
        
        this.setSize(500, 500);
        this.setTitle("Frame with buttons");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            System.out.println("Jason is the best");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
