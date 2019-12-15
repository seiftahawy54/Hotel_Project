package GUI;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;



public class SeriveMS extends JFrame {
    private JButton B1,B2;
    private JPanel pn6,p;
    private JLabel h;
    public SeriveMS() {
     /////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////               
            pn6 = new JPanel();
            p = new JPanel();
     /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////        
            B1 = new JButton("Manage Services");
            B2 = new JButton("Get Report");
    /////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
            h= new JLabel("Services");   
    ////////////////////////////// SET THE FRAME//////////////////////////////////////         
            this.setTitle("Services");
            this.setSize(600, 400);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLayout(null);
    /////////////////////////// SET  OF PANELS////////////////////////////////
            pn6.setBounds(0, 0, 600, 400);
            pn6.setLayout(null);
            pn6.setBackground(Color.darkGray);

            p.setBounds(0,0,600,65);
            p.setBackground(Color.ORANGE);
            p.setLayout(null);
    /////////////////////////// SET  OF BUTTONS////////////////////////////////
            B1.setBounds( 110,80 ,400 ,110 );
            B1.setBackground(Color.ORANGE); 
            B1.setForeground(Color.DARK_GRAY);
            B1.setFont(new Font("Agency fm", Font.BOLD, 40));

            B2.setBounds( 110,220 ,400 ,110 );
            B2.setBackground(Color.ORANGE); 
            B2.setForeground(Color.DARK_GRAY);
            B2.setFont(new Font("Agency fm", Font.BOLD, 40));
     /////////////////////////// SET  OF  HEADER ////////////////////////////////           
            h.setBounds(210, 5, 300, 45);
            h.setFont(new Font("Agency fm", Font.BOLD, 45));
            h.setForeground(Color.DARK_GRAY); 
     /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            this.add(pn6);
     /////////////////////  ADD BUTTONS////////////////////////////////////////////////         
            pn6.add(B1);
            pn6.add(B2);
     /////////////////////  ADD HEADER////////////////////////////////////////////////         
            pn6.add(h);         
     /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            pn6.add(p);
            
        /* Actions */
     
            /* Manage services, Get Report */
            
            SManager manage = new SManager();
            PrintRepo reporter = new PrintRepo();
            
            B1.addActionListener(manage);
            B2.addActionListener(reporter);
            
    }
    
    /* Actions To be performed */
    private class SManager implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            SeriveMS.this.setVisible(false);
        }
    }
    
    private class PrintRepo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            SeriveMS.this.setVisible(false);
            Report go2Frame = new Report();
        }
    }
    
}

