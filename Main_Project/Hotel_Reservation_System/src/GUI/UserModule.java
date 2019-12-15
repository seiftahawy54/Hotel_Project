package GUI;
import Customers.*;
import User.Employee;
import Rooms.Room;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;


public class UserModule extends JFrame {
////////////////////////initialization of our components///////////////////////////////////////////////        
    private JPanel p1,p2;
    private JButton b1 ,b2 ,b3, b4;
    private JLabel h;
    
public UserModule() {
/////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////               
        p1 = new JPanel();
        p2 = new JPanel();
/////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
        h =new JLabel("User App");
/////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////        
        b1 = new JButton("Employee");
        b2 = new JButton("Rooms");
        b3 = new JButton("Services");
        b4 = new JButton("Cutomers");
////////////////////////////// SET THE FRAME//////////////////////////////////////         
        this.setTitle("User App");
        this.setVisible(true);
        this.setSize(680, 720);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(600, 100);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////        
        p1.setBackground(Color.DARK_GRAY);
        p1.setBounds(0, 0, 700, 720);
        p1.setLayout(null);
       
        p2.setBackground(Color.ORANGE);
        p2.setBounds(0, 0, 700, 80);
        p2.setLayout(null);                
/////////////////////////// SET  OF BUTTONS////////////////////////////////
                
        b1.setBounds(120,100 ,450 ,100 );
        b1.setFont(new Font("Agency fm", Font.BOLD, 40));
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.DARK_GRAY);
        
        
        b2.setBounds(120,250 ,450 ,100 );
        b2.setFont(new Font("Agency fm", Font.BOLD, 40));
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.DARK_GRAY);
        
        b3.setBounds(120,400 ,450 ,100 );
        b3.setFont(new Font("Agency fm", Font.BOLD, 40));
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.DARK_GRAY);
        
        b4.setBounds(120,550 ,450 ,100 );
        b4.setFont(new Font("Agency fm", Font.BOLD, 40));
        b4.setBackground(Color.ORANGE);
        b4.setForeground(Color.DARK_GRAY);
        
/////////////////////////// SET  OF  HEADER ////////////////////////////////           
        h.setBounds(230, 10, 300, 55);
        h.setForeground(Color.DARK_GRAY);
        h.setFont(new Font("Agency fm", Font.BOLD, 45)); 
/////////////////////  ADD PANEL////////////////////////////////////////////////         
        this.add(p1);
////////////////// // ADD BUTTONS/////////////////////////////////////////////////               
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
 /////////////////////  ADD HEADER////////////////////////////////////////////////                
        p1.add(h);
/////////////////////  ADD PANEL2////////////////////////////////////////////////                
        p1.add(p2);
    
        
        EmployeeHand emp_do = new EmployeeHand();
        RoomHand rm_do = new RoomHand();
        ServiceHand ser_do = new ServiceHand();
        CustomerHand cus_do = new CustomerHand();
        
        b1.addActionListener(emp_do);
        b2.addActionListener(rm_do);
        b3.addActionListener(ser_do);
        b4.addActionListener(cus_do);
        
    }

    private class EmployeeHand implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            UserModule.this.setVisible(false);
            UserEMP go = new UserEMP();
        }
        
    }
    private class RoomHand implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            UserModule.this.setVisible(false);
            UserRoom go = new UserRoom();
        }
        
    }
    private class ServiceHand implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            UserModule.this.setVisible(false);
            SeriveMS go = new SeriveMS();
        }
        
    }
    private class CustomerHand implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae) {
            UserModule.this.setVisible(false);
            UserCustomer go = new UserCustomer();
        }
    }
    
}
