/* Start Room managament system module */

package GUI;

/* JAVA SWING LIBRARIES */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;

public class RMS extends JFrame {
    
////////////////////////initialization of our components///////////////////////////////////////////////        
        private JButton b1,b2,b3,b4;
        private JPanel pn5,p;
        private JLabel h;
        public RMS() {
/////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////               
            pn5 = new JPanel();
            p = new JPanel();
/////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////        
            b1 = new JButton("Booking");
            b2 = new JButton("Filter");
            b3 = new JButton("View Near CheckOut");
            b4 = new JButton("Print Bill");
/////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
            h= new JLabel("Booking Managment System");              
////////////////////////////// SET THE FRAME//////////////////////////////////////         
            this.setTitle("Booking Managment System"); 
            this.setSize(600, 650);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLayout(null);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////        
            pn5.setBounds(0, 0, 600, 650);
            pn5.setBackground(Color.darkGray);
            pn5.setLayout(null);

            p.setBounds(0,0,600,80);
            p.setBackground(Color.ORANGE);
            p.setLayout(null);
/////////////////////////// SET  OF BUTTONS////////////////////////////////
            b1.setBounds( 150,100 ,300 ,100 );
            b1.setBackground(Color.ORANGE); 
            b1.setForeground(Color.DARK_GRAY);
            b1.setFont(new Font("Agency fm", Font.BOLD, 40));

            b2.setBounds( 150,220 ,300 ,100 );
            b2.setBackground(Color.ORANGE); 
            b2.setForeground(Color.DARK_GRAY);
            b2.setFont(new Font("Agency fm", Font.BOLD, 40));

            b3.setBounds( 150,340 ,300 ,100 );  
            b3.setBackground(Color.ORANGE); 
            b3.setForeground(Color.DARK_GRAY);
            b3.setFont(new Font("Agency fm", Font.BOLD, 25));

            b4.setBounds( 150,470 ,300 ,100 );
            b4.setBackground(Color.ORANGE);
            b4.setForeground(Color.DARK_GRAY);
            b4.setFont(new Font("Agency fm", Font.BOLD, 40));
/////////////////////////// SET  OF  HEADER ////////////////////////////////           
            h.setBounds(80, 10, 500, 55);
            h.setForeground(Color.DARK_GRAY);
            h.setFont(new Font("Agency fm", Font.BOLD, 35)); 
/////////////////////  ADD PANEL////////////////////////////////////////////////         
            this.add(pn5);
  ////////////////// // ADD BUTTONS/////////////////////////////////////////////////               
            pn5.add(b1);
            pn5.add(b2);
            pn5.add(b3); 
            pn5.add(b4);
/////////////////////  ADD HEADER////////////////////////////////////////////////         
            pn5.add(h);         
 /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            pn5.add(p);
            
            /*
                Booking, filter, nearcheckout, print bill
            */
            
            Bookingcall book = new Bookingcall();
            filter filt = new filter();
            Nearcheckout near = new Nearcheckout();
            billprinter bill = new billprinter();
            
            b1.addActionListener(book);
            b2.addActionListener(filt);
            b3.addActionListener(near);
            b4.addActionListener(bill);
    }
        
    private class Bookingcall implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            RMS.this.setVisible(false);
            Booking go = new Booking();
        }
    }
    
    private class filter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            RMS.this.setVisible(false);
            Filter go = new Filter();
        }
    }
    private class Nearcheckout implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            RMS.this.setVisible(false);
            view ya_rab = new view();
        }
    }
    private class billprinter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            RMS.this.setVisible(false);
            bill go = new bill();
        }
    }
}
