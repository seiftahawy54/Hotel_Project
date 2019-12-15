package GUI;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;


public class Booking extends JFrame {
////////////////////////initialization of our components///////////////////////////////////////////////    
   private  JPanel p,p1;
   private JLabel l1,l2, l3,l4,l5,h;
   private JTextField t1,t2,t3,t4,t5;
   private JButton b1;

public Booking() {
 ///////////////////////////intialization and DECLARETION of JTable and JScrollPane////////////////////////          
        String[][] data = { {"", "", "","" , "" , "", ""}};
        String [] Column = {"", "", "","" , "" , "", ""};
        JTable tab1 = new JTable(data , Column);
         JTable tab2 = new JTable(data , Column);
        JScrollPane sp1 = new JScrollPane(tab1);
        JScrollPane sp2 = new JScrollPane(tab2);
////////////////////////////////// DECLARETION OF THE JPanel/////////////////////////////     
            p=new JPanel();
            p1=new JPanel();
/////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////       
            l1=new JLabel("GUEST ID :");
            l2=new JLabel("ROOM NUMBER :");
            l3=new JLabel("START DATE :");
            l4=new JLabel("END DATE :");
            l5=new JLabel("SERVICE NAME :");
            h=new JLabel("BOOKING APP");
 /////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////    
            t1=new JTextField();
            t2 =new JTextField();
            t3 =new JTextField();
            t4 =new JTextField();
            t5 =new JTextField();
 /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////     
            b1=new JButton("SUBMIT");
 ////////////////////////////// SET THE FRAME//////////////////////////////////////            
            this.setTitle("BOOKING APP");
            this.setSize(900,900);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setLocation(500,100);    
            this.setLayout(null);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////           
            p.setBackground(Color.darkGray);
            p.setBounds(0, 0,900, 900);
            p.setLayout(null);
            p1.setBackground(Color.ORANGE);
            p1.setBounds(0, 0,900, 50);
            p1.setLayout(null);
 /////////////////////////// SET  OF TextField////////////////////////////////           
            t1.setBounds(190,60,650,40);
            t1.setFont(new Font("Agency fb", Font.BOLD,35));

            t2.setBounds(190,120,650,40);
            t2.setFont(new Font("Agency fb", Font.BOLD,35));

            t3.setBounds(190,180,650,40);
            t3.setFont(new Font("Agency fb", Font.BOLD,35));

            t4.setBounds(190,240,650,40);
            t4.setFont(new Font("Agency fb", Font.BOLD,35));

            t5.setBounds(190,300,650,40);
            t5.setFont(new Font("Agency fb", Font.BOLD,35));
/////////////////////////// SET OF Labels////////////////////////////////                      
            l1.setBounds(65,30,100,100);
            l1.setFont(new Font("Agency fb", Font.BOLD,30));
            l1.setForeground(Color.ORANGE);

            l2.setBounds(20,90,150,100);
            l2.setFont(new Font("Agency fb", Font.BOLD,30));
            l2.setForeground(Color.ORANGE);

            l3.setBounds(40,150,150,100);
            l3.setFont(new Font("Agency fb", Font.BOLD,30));
            l3.setForeground(Color.ORANGE);

            l4.setBounds(60,210,150,100);
            l4.setFont(new Font("Agency fb", Font.BOLD,30));
            l4.setForeground(Color.ORANGE);

            l5.setBounds(20,270,150,100);  
            l5.setFont(new Font("Agency fb", Font.BOLD,30));
            l5.setForeground(Color.ORANGE);
/////////////////////////// SET OF HEADER ////////////////////////////////                      
            
            h.setBounds(350,5,200,40);
            h.setFont(new Font("Agency fb", Font.BOLD,40));
            h.setForeground(Color.DARK_GRAY);
 /////////////////////////// SET  OF BUTTONS////////////////////////////////        
            b1.setBounds(300,780,300,60);
            b1.setFont(new Font("Agency fb", Font.BOLD,35));
            b1.setBackground(Color.ORANGE);
            b1.setForeground(Color.DARK_GRAY);
/////////////////////////// SET  OF THE TABLE  /////////////////////////          
            tab1.setBounds( 10,360 ,410, 400 );
            tab1.setFont(new Font("Agency fm", Font.BOLD, 13)); 
            tab2.setBounds( 430,360 ,450, 400 );
            tab2.setFont(new Font("Agency fm", Font.BOLD, 13));         
/////////////////////  ADD PANEL////////////////////////////////////////////////                 
            add(p);
/////////////  ADD TEXTFIELD////////////////////////////////////////////////////                
            p.add(t1);
            p.add(t2);
            p.add(t3);
            p.add(t4);
            p.add(t5);
//////////////////////////////////////////  ADD LABELS ///////////////////////               
            p.add(l1);
            p.add(l2);
            p.add(l3);
            p.add(l4);
            p.add(l5);
//////////////////  ADD BUTTONS/////////////////////////////////////////////////   
            p.add(b1);
 ////////////////////  ADD TABLE AND ScrollPane //////////////////////////////////////            
          p.add(tab1);
          p.add(tab2);
          p.add(sp1);
          p.add(sp2);
/////////////////////  ADD HEADER////////////////////////////////////////////////         
          p.add(h);
/////////////////////  ADD PANEL 2////////////////////////////////////////////////         
          p.add(p1);
      }    

}

