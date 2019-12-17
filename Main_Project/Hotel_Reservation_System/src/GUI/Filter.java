/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.print.DocFlavor;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class Filter extends JFrame {
    private JPanel p1,p2;
    private JLabel l1,h; 
    private JButton b1;

    public Filter() {
    
    
   String[] fill={"High","Medium","Low"};
 JComboBox c= new JComboBox(fill);
        
///////////////////////////intialization and DECLARETION of JTable and JScrollPane////////////////////////          
        String[][] data = { {"RoomNumber", "FloorNumber", "RoomCapacity","RoomType" , "PriceForNight" ,  "ServicesName"}};
        String [] Column = {"RoomNumber", "FloorNumber", "RoomCapacity","RoomType" , "PriceForNight" ,  "ServicesName"};
        JTable tab1 = new JTable(data , Column);    
        JScrollPane sp1 = new JScrollPane(tab1);
 /////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////       
            p1 = new JPanel();
             p2 = new JPanel();  
/////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////       
            l1 = new JLabel("Choose:"); 
/////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
            h= new JLabel("Filter"); 
 /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////     
            b1=new JButton("SEARCH");
  ////////////////////////////// SET THE FRAME//////////////////////////////////////            
            this.setTitle("Filter");
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
            l1.setBounds(45, 75, 200, 35);
            l1.setForeground(Color.ORANGE);
            l1.setFont(new Font("Agency fm", Font.BOLD, 40));
  /////////////////////////// SET  OF  HEADER ////////////////////////////////           
            h.setBounds(350, 5, 300, 45);
            h.setFont(new Font("Agency fm", Font.BOLD, 50));
            h.setForeground(Color.DARK_GRAY);
 /////////////////////////// SET  OF THE TABLE  /////////////////////////          
        tab1.setBounds( 60,150 , 700, 500 );
        tab1.setFont(new Font("Agency fm", Font.BOLD, 13)); 
/////////////////////////// SET OF combobox ////////////////////////////////                      
    c.setBounds(230, 70, 500, 50);
    c.setFont(new Font("Agency fm", Font.BOLD, 30));
    c.setForeground(Color.orange);
    c.setBackground(Color.gray);
 /////////////////////////// SET  OF BUTTONS////////////////////////////////        
            b1.setBounds(250,680,300,60);
            b1.setFont(new Font("Agency fb", Font.BOLD,35));
            b1.setBackground(Color.ORANGE);
            b1.setForeground(Color.DARK_GRAY);   
/////////////////////  ADD PANEL////////////////////////////////////////////////                 
            this.add(p1);
//////////////////////////////////////////  ADD LABELS ///////////////////////               
            p1.add(l1); 
//////////////////  ADD BUTTONS/////////////////////////////////////////////////   
            p1.add(b1);
/////////////////////  ADD HEADER////////////////////////////////////////////////         
            p1.add(h);         
 /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            p1.add(p2);
////////////////////  ADD TABLE AND ScrollPane //////////////////////////////////////            
            p1.add(tab1);
            p1.add(sp1);

            p1.add(c);


    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
}
