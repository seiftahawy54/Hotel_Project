package GUI;


/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;


public class Report extends JFrame {
////////////////////////initialization of our components///////////////////////////////////////////////        
    JPanel pn7,p;
    JLabel l1,l2,l3,h;
    JTextField t1,t2,t3;  
    JButton b1;
            
    public Report() {
/////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////       
            pn7 = new JPanel();
             p = new JPanel();  
/////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////       
            l1 = new JLabel("HighService :"); 
            l2 = new JLabel("MediumService :"); 
            l3 = new JLabel("LowService :");
 /////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////    
            t1 = new JTextField();
            t2 = new JTextField();
            t3 = new JTextField();
 /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////     
            b1 =new JButton("submit");
/////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
            h= new JLabel("Report"); 
 ////////////////////////////// SET THE FRAME//////////////////////////////////////            
            this.setTitle("Report");
            this.setSize(500, 300);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLayout(null);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////           
            pn7.setBounds(0,0,500,350);
            pn7.setBackground(Color.darkGray);
            pn7.setLayout(null);
            
            p.setBounds(0,0,500,50);
            p.setBackground(Color.ORANGE);
            p.setLayout(null);
/////////////////////////// SET OF Labels////////////////////////////////                      
            l1.setBounds(45, 65, 145, 25);
            l1.setForeground(Color.ORANGE);
            l1.setFont(new Font("Agency fm", Font.BOLD, 20));
            
            l2.setBounds(20, 115, 200, 25);
            l2.setForeground(Color.ORANGE);
            l2.setFont(new Font("Agency fm", Font.BOLD, 20));
            
            l3.setBounds(55, 165, 145, 25);
            l3.setForeground(Color.ORANGE);
            l3.setFont(new Font("Agency fm", Font.BOLD, 20));
 /////////////////////////// SET  OF TextField////////////////////////////////           
            t1.setBounds(185, 60, 280, 35);
            t1.setFont(new Font("Agency fm", Font.BOLD, 15));

            t2.setBounds(185, 110, 280, 35);      
            t2.setFont(new Font("Agency fm", Font.BOLD, 15));

            t3.setBounds(185, 160, 280, 35);     
            t3.setFont(new Font("Agency fm", Font.BOLD, 15));
 /////////////////////////// SET  OF BUTTONS////////////////////////////////        
            b1.setBounds(140, 210, 250, 50);
            b1.setFont(new Font("Agency fb", Font.BOLD,35));
            b1.setBackground(Color.ORANGE);
            b1.setForeground(Color.DARK_GRAY);
  /////////////////////////// SET  OF  HEADER ////////////////////////////////           
            h.setBounds(190, 5, 300, 45);
            h.setFont(new Font("Agency fm", Font.BOLD, 40));
            h.setForeground(Color.DARK_GRAY);             
/////////////////////  ADD PANEL////////////////////////////////////////////////                 
            this.add(pn7);
//////////////////////////////////////////  ADD LABELS ///////////////////////               
            pn7.add(l1); 
            pn7.add(l2);
            pn7.add(l3);
/////////////  ADD TEXTFIELD////////////////////////////////////////////////////                
            pn7.add(t1);
            pn7.add(t2);
            pn7.add(t3);
//////////////////  ADD BUTTONS/////////////////////////////////////////////////   
            pn7.add(b1);
/////////////////////  ADD HEADER////////////////////////////////////////////////         
            pn7.add(h);         
 /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            pn7.add(p);

    }
}
