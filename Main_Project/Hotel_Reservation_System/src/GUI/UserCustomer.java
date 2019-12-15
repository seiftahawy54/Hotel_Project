package GUI;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;

public class UserCustomer extends JFrame{
    ////////////////////////initialization of our components///////////////////////////////////////////////
        private JPanel pn2 ,p;
        private JLabel l1,l2,l3,l4,l5,l6,h;
        private JButton B1,B2,B3;
        private JTextField t1,t2,t3,t4,t5,t6;

    public UserCustomer() {
    ///////////////////////////intialization and DECLARETION of JTable and JScrollPane////////////////////////          
            String[][] data = { {"Name", "Ssn","ID" , "Age" , "Pay.Method", "Num.People"}};
            String [] Column = {"Name", "Ssn","ID" , "Age" , "Pay.Method", "Num.People"};
            JTable t = new JTable(data , Column);
            JScrollPane sp = new JScrollPane(t); 
    /////////////////////////////// DECLARETION OF THE JPanel/////////////////////////////
            pn2 = new JPanel();
            p = new JPanel();
    /////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////               
            l1 = new JLabel("Name :");
            l2 = new JLabel("SSN :");
            l3 = new JLabel("ID :");
            l4= new JLabel("Age :"); 
            l5 = new JLabel("PaymentMethod :");
            l6 = new JLabel("Num.OfPeople :"); 
            h = new JLabel("Customer App");
    /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////           
            B1 = new JButton("Add"); 
            B2 = new JButton("Update");
            B3 = new JButton("Delete");
    /////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////
            t1 = new JTextField();
            t2 = new JTextField();
            t3 = new JTextField();
            t4 = new JTextField();
            t5 = new JTextField();
            t6 = new JTextField();
    ////////////////////////////// SET THE FRAME//////////////////////////////////////        
            this.setTitle("Customer APP");
            this.setSize(600, 860);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
    ////////////////////////////////////////////// SET THE PANEL////////////////////////////////        
            pn2.setBackground(Color.darkGray);
            pn2.setBounds(0,0,600,860);
            pn2.setLayout(null);
            p.setBounds(0,0,600,60);
            p.setBackground(Color.ORANGE);
            p.setLayout(null);
    /////////////////////////// SET OF Labels////////////////////////////////              
            l1.setBounds(25, 70, 85, 25);
            l1.setFont(new Font("Agency fm", Font.BOLD, 25));
            l1.setForeground(Color.ORANGE);

            l2.setBounds(35, 120, 70, 25);
            l2.setForeground(Color.ORANGE);
            l2.setFont(new Font("Agency fm", Font.BOLD, 25));

            l3.setBounds(60, 175, 85, 25);
            l3.setForeground(Color.ORANGE);
            l3.setFont(new Font("Agency fm", Font.BOLD, 25));

            l4.setBounds(45, 225, 70, 35);
            l4.setForeground(Color.ORANGE);
            l4.setFont(new Font("Agency fm", Font.BOLD, 25));

            l5.setBounds(0, 275, 145, 25);
            l5.setForeground(Color.ORANGE);
            l5.setFont(new Font("Agency fm", Font.BOLD, 15));  

            l6.setBounds(5, 325, 145, 25);
            l6.setFont(new Font("Agency fm", Font.BOLD, 15));        
            l6.setForeground(Color.ORANGE);
     /////////////////////////// SET  OF  HEADER ////////////////////////////////         
            h.setBounds(180, 0, 300, 55);
            h.setForeground(Color.DARK_GRAY);
            h.setFont(new Font("Agency fm", Font.BOLD, 35));        

    /////////////////////////// SET  OF TextField////////////////////////////////        
            t1.setBounds(130, 70, 450, 35);
            t1.setFont(new Font("Agency fm", Font.BOLD, 15)); 

            t2.setBounds(130, 120, 450, 35);
            t2.setFont(new Font("Agency fm", Font.BOLD, 15)); 

            t3.setBounds(130, 175, 450, 35);
            t3.setFont(new Font("Agency fm", Font.BOLD, 15)); 

            t4.setBounds(130, 225, 450, 35);
            t4.setFont(new Font("Agency fm", Font.BOLD, 15));

            t5.setBounds(130, 275, 450, 35);
            t5.setFont(new Font("Agency fm", Font.BOLD, 15)); 

            t6.setBounds(130, 320, 450, 35);
            t6.setFont(new Font("Agency fm", Font.BOLD, 15)); 

    /////////////////////////// SET  OF BUTTONS////////////////////////////////
            B1.setBounds(50,730,100 ,40);
            B1.setFont(new Font("Agency fm", Font.BOLD, 17));
            B1.setBackground(Color.ORANGE);

            B2.setBounds( 250,730,100 ,40 );
            B2.setBackground(Color.ORANGE);
            B2.setFont(new Font("Agency fm", Font.BOLD, 17));

            B3.setBounds( 450,730,100 ,40 );
            B3.setBackground(Color.ORANGE);
            B3.setFont(new Font("Agency fm", Font.BOLD, 17));
    /////////////////////////// SET  OF THE TABLE  /////////////////////////          
            t.setBounds( 10,380 , 580, 300 );
            t.setFont(new Font("Agency fm", Font.BOLD, 13));              
    /////////////////////  ADD PANEL////////////////////////////////////////////////            
            this.add(pn2);
    //////////////////  ADD BUTTONS/////////////////////////////////////////////////
            pn2.add(B1);
            pn2.add(B2); 
            pn2.add(B3);
    /////////////  ADD TEXTFIELD////////////////////////////////////////////////////            
            pn2.add(t1);
            pn2.add(t2);
            pn2.add(t3);
            pn2.add(t4);
            pn2.add(t5);
            pn2.add(t6);
    //////////////////////////////////////////  ADD LABELS ///////////////////////            
            pn2.add(l1);
            pn2.add(l2);
            pn2.add(l3);
            pn2.add(l4);
            pn2.add(l5);
            pn2.add(l6);           
     ////////////////////  ADD TABLE AND ScrollPane //////////////////////////////////////            
            pn2.add(sp); 
            pn2.add(t);            
    /////////////////////  ADD HEADER////////////////////////////////////////////////                
            pn2.add(h);
    /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            pn2.add(p);

    }

}