package GUI;

/* JAVA SWING LIBRARIES */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;
import Rooms.*;
import Team_Framework.Askerbtn;


public class UserRoom extends JFrame {
     private JLabel l1,l2,l3,l4,l5,l6,h;
    private JPanel pn3,p;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2,b3;   
    
    public UserRoom(){
  /////////////////////////////// DECLARETION OF THE JPanel//////////////////////////////       
        pn3 =new JPanel();
         p = new JPanel();
/////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////         
        l1 = new JLabel("RoomNumber :"); 
        l2 = new JLabel("FloorNumber :"); 
        l3 = new JLabel("RoomCapacity :"); 
        l4 = new JLabel("RoomType :"); 
        l5 = new JLabel("PriceForNight :");
        l6 = new JLabel("ServicesName :"); 
/////////////////////////////// DECLARETION OF THE HEADER //////////////////////////////                 
        h= new JLabel("Rooms App");  
/////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
/////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////        
        b1 = new JButton("Add"); 
        b2 = new JButton("Update");
        b3 = new JButton("Delete");
////////////////////////////// SET THE FRAME//////////////////////////////////////         
        this.setTitle("Rooms");
        this.setSize(600, 500);
        this.setLocation(650, 80);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
 ////////////////////////////////////////////// SET THE PANEL////////////////////////////////        
        pn3.setLayout(null);
        pn3.setBackground(Color.darkGray);
        pn3.setBounds(0, 0, 600, 500);
        
        p.setBounds(0,0,600,60);
        p.setBackground(Color.ORANGE);
        p.setLayout(null);
/////////////////////////// SET  OF Labels//////////////////////////////// 
        l1.setBounds(20, 75, 145, 25);
        l1.setForeground(Color.ORANGE);
        l1.setFont(new Font("Agency fm", Font.BOLD, 20));
        
            
        l2.setBounds(25, 125, 145, 25);
        l2.setForeground(Color.ORANGE);
        l2.setFont(new Font("Agency fm", Font.BOLD, 20));
        
            
        l3.setBounds(10, 175, 200, 25);
        l3.setForeground(Color.ORANGE);
        l3.setFont(new Font("Agency fm", Font.BOLD, 20));
        
            
        l4.setBounds(40, 225, 200, 25);
        l4.setForeground(Color.ORANGE);
        l4.setFont(new Font("Agency fm", Font.BOLD, 20));
        
            
        l5.setBounds(12, 275, 200, 25);
        l5.setForeground(Color.ORANGE);
        l5.setFont(new Font("Agency fm", Font.BOLD, 20));
       
            
        l6.setBounds(10, 325, 200, 25);
        l6.setForeground(Color.ORANGE); 
        l6.setFont(new Font("Agency fm", Font.BOLD, 20));
  /////////////////////////// SET  OF  HEADER ////////////////////////////////           
        h.setBounds(200, 5, 300, 45);
        h.setFont(new Font("Agency fm", Font.BOLD, 35));
        h.setForeground(Color.DARK_GRAY);          
/////////////////////////// SET  OF TextField////////////////////////////////   
            
        t1.setBounds(180, 70, 400, 35);
        t1.setFont(new Font("Agency fm", Font.BOLD, 15));
        
        t2.setBounds(180, 120, 400, 35);
        t2.setFont(new Font("Agency fm", Font.BOLD, 15));
        
        t3.setBounds(180, 170, 400, 35);
        t3.setFont(new Font("Agency fm", Font.BOLD, 15));
        
        t4.setBounds(180, 220, 400, 35);
        t4.setFont(new Font("Agency fm", Font.BOLD, 15));
        
        t5.setBounds(180, 270, 400, 35);
        t5.setFont(new Font("Agency fm", Font.BOLD, 15));
        
        t6.setBounds(180, 320, 400, 35);
        t6.setFont(new Font("Agency fm", Font.BOLD, 15));
/////////////////////////// SET  OF BUTTONS////////////////////////////////
        b1.setBounds( 60,400 ,100 ,35 );
        b1.setForeground(Color.DARK_GRAY);
        b1.setBackground(Color.ORANGE);
        b1.setFont(new Font("Agency fm", Font.BOLD, 15)); 
        
        b2.setBounds( 250,400 ,100 ,35 );
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.DARK_GRAY);
        b2.setFont(new Font("Agency fm", Font.BOLD, 15)); 
        
        b3.setBounds( 450,400 ,100 ,35 );
        b3.setForeground(Color.DARK_GRAY);
        b3.setBackground(Color.ORANGE);
        b3.setFont(new Font("Agency fm", Font.BOLD, 15));
/////////////////////  ADD PANEL////////////////////////////////////////////////         
        this.add(pn3);
////////////////////  ADD TEXTFIELD///////////////////////////////////////               
        pn3.add(t1);
        pn3.add(t2);
        pn3.add(t3);
        pn3.add(t4);
        pn3.add(t5);
        pn3.add(t6);
//////////////////// ADD LABELS ///////////////////////       
        pn3.add(l1); 
        pn3.add(l2);
        pn3.add(l3);
        pn3.add(l4);
        pn3.add(l5);
        pn3.add(l6);
////////////////// // ADD BUTTONS/////////////////////////////////////////////////               
        pn3.add(b1);
        pn3.add(b2);
        pn3.add(b3);
 /////////////////////  ADD HEADER////////////////////////////////////////////////         
        pn3.add(h);         
 /////////////////////  ADD PANEL 2////////////////////////////////////////////////         
        pn3.add(p);
        
            
        AdderHandler add = new AdderHandler();
        UpdaterHandler update = new UpdaterHandler();
        DeleterHandler delete = new DeleterHandler();
        b1.addActionListener(add);
        b2.addActionListener(update);
        b3.addActionListener(delete);
    }
    
    private class AdderHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String roomnumber = t1.getText().toString();
            int roomnumber1 = Integer.parseInt(roomnumber);
            String floornumber = t2.getText().toString();
            int floornumber1 = Integer.parseInt(floornumber);
            String roomcapacity = t3.getText().toString();
            int roomcapacity1 = Integer.parseInt(roomcapacity);
            String RoomType = t3.getText().toString();
            String pricefornight = t4.getText().toString();
            double pricefornight1 = Double.parseDouble(pricefornight);
            String servicesname = t5.getText().toString();
            Room x = new Room();
            /* RoomNumber, FloorNumber, RoomCapacity, RoomType, PriceForNight, ServicesName */
            /* int int int int string double boolean */
            x.Add_Room(roomnumber1, floornumber1, roomcapacity1, RoomType, pricefornight1, servicesname);
        }
    }
    
    private class UpdaterHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String roomnumber = t1.getText().toString();
            int roomnumber1 = Integer.parseInt(roomnumber);
            String floornumber = t2.getText().toString();
            int floornumber1 = Integer.parseInt(floornumber);
            String roomcapacity = t3.getText().toString();
            int roomcapacity1 = Integer.parseInt(roomcapacity);
            String RoomType = t3.getText().toString();
            String pricefornight = t4.getText().toString();
            double pricefornight1 = Double.parseDouble(pricefornight);
            String servicesname = t5.getText().toString();
            Room x = new Room();
            /* Hint : ROOMID = ROOMNUMBER */
            x.Update_rooms(roomnumber1, floornumber1, roomcapacity1, RoomType, pricefornight1, servicesname);
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
            Room x = new Room();
            x.Delete(id); /* Add POPUP */
        }
    }
    
}

