package GUI;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import Customers.customer;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import Rooms.Room;
import Team_Framework.Askerbtn;
import java.sql.*;

public class UserCustomer extends JFrame{
    ////////////////////////initialization of our components///////////////////////////////////////////////
    private JPanel pn2 ,p;
    private JLabel l1,l2,l3,l4,l5,l6,h;
    private JButton B1,B2,B3;
    private JTextField t1,t2,t3,t4,t5,t6;
    public UserCustomer() {
    

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
        this.setSize(600, 500);
        this.setLocation(650, 80);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////        
        pn2.setBackground(Color.darkGray);
        pn2.setBounds(0,0,600,500);
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
        B1.setBounds(50,400,100 ,40);
        B1.setFont(new Font("Agency fm", Font.BOLD, 17));
        B1.setBackground(Color.ORANGE);
        
        B2.setBounds( 250,400,100 ,40 );
        B2.setBackground(Color.ORANGE);
        B2.setFont(new Font("Agency fm", Font.BOLD, 17));
        
        B3.setBounds( 450,400,100 ,40 );
        B3.setBackground(Color.ORANGE);
        B3.setFont(new Font("Agency fm", Font.BOLD, 17));
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
/////////////////////  ADD HEADER////////////////////////////////////////////////                
        pn2.add(h);
/////////////////////  ADD PANEL 2////////////////////////////////////////////////         
        pn2.add(p);

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
        public void actionPerformed(ActionEvent e)
        {
            String name = t1.getText().toString();
            String ssn = t2.getText().toString();
            int ssn1 = Integer.parseInt(ssn);
            String age = t3.getText().toString();
            int age1 = Integer.parseInt(age);
            String paymentmethod = t4.getText().toString();
            String numberofpeople = t5.getText().toString();
            int numpeople = Integer.parseInt(numberofpeople);
            String DOF = t6.getText().toString();
            int dof1 = Integer.parseInt(DOF);
            customer x = new customer();
            x.Add(name, ssn1, age1, paymentmethod, numpeople, dof1);
        }
    }
    
    private class UpdaterHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String name = t1.getText().toString();
            String ssn = t2.getText().toString();
            int ssn1 = Integer.parseInt(ssn);
            String age = t3.getText().toString();
            int age1 = Integer.parseInt(age);
            String paymentmethod = t4.getText().toString();
            String numberofpeople = t5.getText().toString();
            int numpeople = Integer.parseInt(numberofpeople);
            String DOF = t6.getText().toString();
            int dof1 = Integer.parseInt(DOF);
            customer x = new customer();
            Askerbtn give = new Askerbtn();
            int id = give.giver();
            x.Update(name, ssn1, age1, paymentmethod, numpeople, dof1, id);
        }
    }
    
    private class DeleterHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Askerbtn testing = new Askerbtn();
            int id = testing.giver();
            /* Hint : ROOMID = ROOMNUMBER */
            customer x = new customer();
            x.Delete(id); /* Add POPUP */
        }
    }

}