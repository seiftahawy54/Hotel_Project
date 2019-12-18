package GUI;

/* SERVICE CLASS IS DONE */

/* JAVA SWING LIBRARIES */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;
import Services.service;


public class MainServiceClass extends JFrame {
    public JTextField t1 = new JTextField();
    public JTextArea t2 = new JTextArea();
    public JTextField t4 = new JTextField();
    
    public MainServiceClass(){
            JFrame bn4 = new JFrame();
            JPanel pn4 = new JPanel();
            JLabel l1 = new JLabel("ServiceName :"); 
            JLabel l2 = new JLabel("ServiceDescription :");
            JLabel l4 = new JLabel("ServicePrice :");
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
            AdderHandler add = new AdderHandler();
            UpdaterHandler update = new UpdaterHandler();
            DeleterHandler delete = new DeleterHandler();
            B1.addActionListener(add);
            B2.addActionListener(update);
            B3.addActionListener(delete);
    }
    
    private class AdderHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String servicename = t1.getText().toString();
            String serviceDescription = t2.getText().toString();
            String serviceprice = t4.getText().toString();
            double serviceprice1 = Double.parseDouble(serviceprice);
            
            service get = new service();
            get.Add(servicename, serviceDescription, serviceprice1);
        }
        
    }
    
    private class UpdaterHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String servicename = t1.getText().toString();
            String serviceDescription = t2.getText().toString();
            String serviceprice = t4.getText().toString();
            double serviceprice1 = Double.parseDouble(serviceprice);
            
            service get = new service();
            get.Update(servicename, serviceDescription, serviceprice1);
        }
        
    }
    
    private class DeleterHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String servicename = t1.getText().toString();
            service get = new service();
            get.Delete(servicename);
            
        }
        
    }
    
}
