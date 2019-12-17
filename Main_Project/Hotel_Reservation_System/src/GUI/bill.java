
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author a7med
 */
public class bill extends JFrame {
    private JPanel p1,p2;
    private JLabel l1,l2,h;
    private JTextField t1,t2;  

    public bill() {
        ///////////////////////////intialization and DECLARETION of JTable and JScrollPane////////////////////////          
        String[][] data = { {"RoomNumber", "FloorNumber", "RoomCapacity","RoomType" , "PriceForNight" ,  "ServicesName"}};
        String [] Column = {"RoomNumber", "FloorNumber", "RoomCapacity","RoomType" , "PriceForNight" ,  "ServicesName"};
        JTable tab1 = new JTable(data , Column);    
        JScrollPane sp1 = new JScrollPane(tab1);
        /////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////       
            p1 = new JPanel();
             p2 = new JPanel();  
/////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////       
            l1 = new JLabel("GuestID :"); 
            l2 = new JLabel("GuestName:"); 
            
 /////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////    
            t1 = new JTextField();
            t2 = new JTextField();
         
/////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
            h= new JLabel("Bill"); 
 ////////////////////////////// SET THE FRAME//////////////////////////////////////            
            this.setTitle("Bill");
            this.setSize(800, 800);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLayout(null);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////           
            p1.setBounds(0,0,800, 900);
            p1.setBackground(Color.darkGray);
            p1.setLayout(null);
            
            p2.setBounds(0,0,800,50);
            p2.setBackground(Color.ORANGE);
            p2.setLayout(null);
/////////////////////////// SET OF Labels////////////////////////////////                      
            l1.setBounds(45, 65, 145, 25);
            l1.setForeground(Color.ORANGE);
            l1.setFont(new Font("Agency fm", Font.BOLD, 30));
            
            l2.setBounds(8, 115, 200, 25);
            l2.setForeground(Color.ORANGE);
            l2.setFont(new Font("Agency fm", Font.BOLD, 30));
 /////////////////////////// SET  OF TextField////////////////////////////////           
            t1.setBounds(185, 60, 600, 40);
            t1.setFont(new Font("Agency fm", Font.BOLD, 25));

            t2.setBounds(185, 110, 600, 40);      
            t2.setFont(new Font("Agency fm", Font.BOLD, 25));
 /////////////////////////// SET  OF  HEADER ////////////////////////////////           
            h.setBounds(380, 5, 300, 45);
            h.setFont(new Font("Agency fm", Font.BOLD, 50));
            h.setForeground(Color.DARK_GRAY);
 /////////////////////////// SET  OF THE TABLE  /////////////////////////          
        tab1.setBounds( 60,190 , 700, 500 );
        tab1.setFont(new Font("Agency fm", Font.BOLD, 13));      
/////////////////////  ADD PANEL////////////////////////////////////////////////                 
            this.add(p1);
//////////////////////////////////////////  ADD LABELS ///////////////////////               
            p1.add(l1); 
            p1.add(l2);
/////////////  ADD TEXTFIELD////////////////////////////////////////////////////                
            p1.add(t1);
            p1.add(t2);
/////////////////////  ADD HEADER////////////////////////////////////////////////         
            p1.add(h);         
 /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            p1.add(p2);
////////////////////  ADD TABLE AND ScrollPane //////////////////////////////////////            
            p1.add(tab1);
            p1.add(sp1);

        
        
    }
    
    
    
    
    
}
