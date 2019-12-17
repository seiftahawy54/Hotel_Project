package GUI;

/* SERVICE CLASS IS DONE */

/* JAVA SWING LIBRARIES */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;


public class MainServiceClass extends JFrame {
    public MainServiceClass(){
            JFrame bn4 = new JFrame();
            JPanel pn4 = new JPanel();
            JLabel l1 = new JLabel("ServiceName :"); JTextField t1 = new JTextField();
            JLabel l2 = new JLabel("ServiceDescription :"); JTextArea t2 = new JTextArea();
            JLabel l4 = new JLabel("ServicePrice :"); JTextField t4 = new JTextField();
            JButton B1 = new JButton("Add"); JButton B2 = new JButton("Update"); JButton B3 = new JButton("Delete");
            this.setTitle("Services");
            this.setSize(600, 860);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            pn4.setLayout(null);
            l1.setBounds(25, 15, 145, 25);
            l1.setForeground(Color.ORANGE);
            l2.setBounds(25, 65, 145, 25);
            l2.setForeground(Color.ORANGE);
            l4.setBounds(25, 240, 145, 25);
            l4.setForeground(Color.ORANGE);
            pn4.add(l1); pn4.add(l2);pn4.add(l4);
            t1.setBounds(180, 15, 350, 25);
            t2.setBounds(180, 65, 350, 150);
            t4.setBounds(180, 240, 350, 25);
            pn4.add(t1); pn4.add(t2); pn4.add(t4);
            B1.setBounds( 80,350 ,100 ,30 );
            B2.setBounds( 210,350 ,100 ,30 );
            B3.setBounds( 340,350 ,100 ,30 );
            B1.setBackground(Color.ORANGE);
            B2.setBackground(Color.ORANGE);
            B3.setBackground(Color.ORANGE);
            B1.setForeground(Color.BLACK);
            B2.setForeground(Color.BLACK);
            B3.setForeground(Color.BLACK);
            pn4.add(B1); pn4.add(B2); pn4.add(B3);
            pn4.setBackground(Color.darkGray);
            this.add(pn4);
        }
}
