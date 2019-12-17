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

/**
 *
 * @author a7med
 */
public class view extends JFrame{
    private JPanel p1,p2;
    private JLabel h; 
    public view() {
 ///////////////////////////intialization and DECLARETION of JTable and JScrollPane////////////////////////          
        String[][] data = { {"RoomNumber", "FloorNumber", "RoomCapacity","RoomType" , "PriceForNight" ,  "ServicesName"}};
        String [] Column = {"RoomNumber", "FloorNumber", "RoomCapacity","RoomType" , "PriceForNight" ,  "ServicesName"};
        JTable tab1 = new JTable(data , Column);    
        JScrollPane sp1 = new JScrollPane(tab1);       
 /////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////       
            p1 = new JPanel();
             p2 = new JPanel();  
 /////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
            h= new JLabel("View Near Cheackout ");        
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
   /////////////////////////// SET  OF  HEADER ////////////////////////////////           
            h.setBounds(150, 5, 800, 45);
            h.setFont(new Font("Agency fm", Font.BOLD, 50));
            h.setForeground(Color.DARK_GRAY);       
 /////////////////////////// SET  OF THE TABLE  /////////////////////////          
        tab1.setBounds( 50,100 , 700, 630 );
        tab1.setFont(new Font("Agency fm", Font.BOLD, 13));         
/////////////////////  ADD PANEL////////////////////////////////////////////////                 
            this.add(p1);
/////////////////////  ADD HEADER////////////////////////////////////////////////         
            p1.add(h);         
 /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
            p1.add(p2);
////////////////////  ADD TABLE AND ScrollPane //////////////////////////////////////            
            p1.add(tab1);
            p1.add(sp1);
        
    }
    
    
    
    
    
    
    
    
    
    
}
