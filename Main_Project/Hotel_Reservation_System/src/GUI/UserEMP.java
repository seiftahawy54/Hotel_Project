package GUI;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;

public class UserEMP extends JFrame {
////////////////////////initialization of our components///////////////////////////////////////////////    
    private JTable t;
    private JPanel pn,p;
    private JLabel l1,l2,l3,l4,l5,l6,h;
    private JTextField t1, t2,t3,t4,t5;
    private JRadioButton r1,r2;
    private JButton B1,B2,B3;
    private ButtonGroup bg;
    
    public UserEMP(){
   ///////////////////////////intialization and DECLARETION of JTable and JScrollPane////////////////////////          
           String[][] data = { {"Name", "Ssn", "Gender","ID" , "Age" , "Position", "Salary   "}      };
           String [] Column = {"Name", "Ssn", "Gender","ID" , "Age" , "Position", "Salary"};
           JTable t = new JTable(data , Column);
           JScrollPane sp = new JScrollPane(t); 
   /////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////       
           pn = new JPanel();
           p = new JPanel();
   /////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////        
           t1 = new JTextField();
           t2 = new JTextField();  
           t3 = new JTextField();  
           t4 = new JTextField();
           t5 = new JTextField();
   /////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////         
           l1 = new JLabel("Name :");
           l2 = new JLabel("SSN :");
           l3 = new JLabel("Salary :");
           l4 = new JLabel("Age :"); 
           l5 = new JLabel("Position :");
           l6 = new JLabel("Gender :"); 
           h = new JLabel("Employee App");
   /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////        
           B1 = new JButton("Add");
           B2 = new JButton("Update");
           B3 = new JButton("Delete");
    /////////////////////////////// DECLARETION OF BUTTON GROUP//////////////////////////////             
           bg = new ButtonGroup();
    /////////////////////////////// DECLARETION OF RADIO BUTTONS//////////////////////////////         
           r1 = new JRadioButton("Male"); 
           r2 = new JRadioButton("Female");    
   ////////////////////////////// SET THE FRAME//////////////////////////////////////         
           this.setTitle("Employee App");
           this.setSize(600, 860);
           this.setLocation(650, 80);
           this.setResizable(false);
           this.setVisible(true);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setLayout(null);
   ////////////////////////////////////////////// SET THE PANEL////////////////////////////////        
           pn.setBounds(0,0,600,860);
           pn.setBackground(Color.darkGray);
           pn.setLayout(null);

           p.setBounds(0,0,600,60);
           p.setBackground(Color.ORANGE);
           p.setLayout(null);

   /////////////////////////// SET  OF Labels//////////////////////////////// 
           l1.setBounds(25, 70, 100, 25);
           l1.setFont(new Font("Agency fm", Font.BOLD, 25));
           l1.setForeground(Color.ORANGE);

           l2.setBounds(55, 120, 100, 25);
           l2.setForeground(Color.ORANGE);
           l2.setFont(new Font("Agency fm", Font.BOLD, 20));

           l3.setBounds(35, 170, 100, 25);
           l3.setForeground(Color.ORANGE);
           l3.setFont(new Font("Agency fm", Font.BOLD, 20));

           l4.setBounds(55, 220,100, 25);
           l4.setForeground(Color.ORANGE);
           l4.setFont(new Font("Agency fm", Font.BOLD, 20));

           l5.setBounds(13, 265, 100, 35);
           l5.setForeground(Color.ORANGE);
           l5.setFont(new Font("Agency fm", Font.BOLD, 20));

           l6.setBounds(25, 315, 100, 25);
           l6.setForeground(Color.ORANGE);
           l6.setFont(new Font("Agency fm", Font.BOLD, 20));
   /////////////////////////// SET  OF  HEADER ////////////////////////////////           
           h.setBounds(180, 0, 300, 55);
           h.setForeground(Color.DARK_GRAY);
           h.setFont(new Font("Agency fm", Font.BOLD, 35));
   /////////////////////////// SET  OF TextField////////////////////////////////   
           t1.setBounds(130, 70, 450, 30);
           t1.setFont(new Font("Agency fm", Font.BOLD, 15)); 

           t2.setBounds(130, 120, 450, 30);
           t2.setFont(new Font("Agency fm", Font.BOLD, 15)); 

           t3.setBounds(130, 170, 450, 30);
           t3.setFont(new Font("Agency fm", Font.BOLD, 15));

           t4.setBounds(130, 220, 450, 30);
           t4.setFont(new Font("Agency fm", Font.BOLD, 15)); 

           t5.setBounds(130, 270, 450, 30);
           t5.setFont(new Font("Agency fm", Font.BOLD, 15)); 
    //////////////////////////SET OF RADIO BUTTONS //////////////////////////////////////////////////////////     
           r1.setBounds(150, 315, 80, 25);
           r1.setFont(new Font("Agency fm", Font.BOLD, 17));
           r1.setBackground(Color.DARK_GRAY);
           r1.setForeground(Color.ORANGE);

           r2.setBounds(300, 315, 80, 25);
           r2.setFont(new Font("Agency fm", Font.BOLD, 17));
           r2.setBackground(Color.DARK_GRAY);
           r2.setForeground(Color.ORANGE);        
   /////////////////////////// SET  OF BUTTONS////////////////////////////////
           B1.setBounds(50,730,100 ,40);
           B1.setFont(new Font("Agency fm", Font.BOLD, 17));
           B1.setBackground(Color.ORANGE);
           B1.setForeground(Color.DARK_GRAY);


           B2.setBounds( 250,730,100 ,40 );
           B2.setFont(new Font("Agency fm", Font.BOLD, 17));
           B2.setBackground(Color.ORANGE);
           B2.setForeground(Color.DARK_GRAY);

           B3.setBounds( 450,730,100 ,40 );
           B3.setFont(new Font("Agency fm", Font.BOLD, 17));
           B3.setBackground(Color.ORANGE);
           B3.setForeground(Color.DARK_GRAY);
   /////////////////////////// SET  OF THE TABLE  /////////////////////////          
           t.setBounds( 20,380 , 550, 300 );
           t.setFont(new Font("Agency fm", Font.BOLD, 17));      
   /////////////////////  ADD PANEL////////////////////////////////////////////////         
           this.add(pn);
   ////////////////// // ADD BUTTONS/////////////////////////////////////////////////        
           pn.add(B1);
           pn.add(B2); 
           pn.add(B3);
   //////////////////// ADD LABELS ///////////////////////       
           pn.add(l1);
           pn.add(l2);
           pn.add(l3);       
           pn.add(l4);
           pn.add(l5);
           pn.add(l6);
   ////////////////////  ADD TEXTFIELD///////////////////////////////////////               
           pn.add(t1);
           pn.add(t2);
           pn.add(t3);
           pn.add(t4);
           pn.add(t5);
   ////////////////////  ADD RADIO BUTTONS //////////////////////////////////////          
           pn.add(r1);
           pn.add(r2);
   ////////////////////  ADD RADIO BUTTONS TO BUTTON GROUP/////////////////////////   
           bg.add(r1);
           bg.add(r2);
    ////////////////////  ADD TABLE AND ScrollPane //////////////////////////////////////            

           pn.add(sp); 
           pn.add(t);
   /////////////////////  ADD HEADER////////////////////////////////////////////////         
           pn.add(h);
   /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
           pn.add(p);
        }
}