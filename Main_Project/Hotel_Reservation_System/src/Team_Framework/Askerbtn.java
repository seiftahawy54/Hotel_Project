package Team_Framework;

import java.awt.*;
import javax.swing.*;

public class Askerbtn extends JFrame  {
    private JPanel p1,p2;
    private JLabel l1;
    private JTextField t1;  
    private JButton b1;
    int id;
    
    public Askerbtn(){
        /////////////////////////////////// DECLARETION OF THE JPanel///////////////////     
            p1 = new JPanel();
            p2 = new JPanel();  
/////////////////////////////// DECLARETION OF THE LABELS////////////////////////       
            l1 = new JLabel("ENTER ID:"); 
/////////////////////////////// DECLARETION OF THE BUTTONS///////////////////////        
            b1 = new JButton("SUBMIT");
 /////////////////////////////// DECLARETION OF THE JTextField/////////////////////    
            t1 = new JTextField();
 ////////////////////////////// SET THE FRAME//////////////////////////////////////            
            this.setTitle("DELETE");
            this.setSize(700, 300);
            this.setLocation(650, 80);
            this.setResizable(false);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setLayout(null);
////////////////////////////////////////////// SET THE PANEL////////////////////////////////           
            p1.setBounds(0,0,700, 400);
            p1.setBackground(Color.darkGray);
            p1.setLayout(null);
            
            p2.setBounds(0,0,700,50);
            p2.setBackground(Color.ORANGE);
            p2.setLayout(null);
/////////////////////////// SET OF Labels////////////////////////////////                      
            l1.setBounds(45, 65, 200, 25);
            l1.setForeground(Color.ORANGE);
            l1.setFont(new Font("Agency fm", Font.BOLD, 30));
 /////////////////////////// SET  OF TextField////////////////////////////////           
            t1.setBounds(220, 60, 450, 40);
            t1.setFont(new Font("Agency fm", Font.BOLD, 25));
 /////////////////////////// SET  OF BUTTONS////////////////////////////////
            b1.setBounds(160,130 ,450 ,100 );
            b1.setFont(new Font("Agency fm", Font.BOLD, 40));
            b1.setBackground(Color.ORANGE);
            b1.setForeground(Color.DARK_GRAY);
 //////////////////////////////////////////  ADD PANEL////////////////////////////                 
            this.add(p1);
//////////////////////////////////////////  ADD LABELS //////////////////////////               
            p1.add(l1); 
//////////////////////////////////////////  ADD BUTTONS //////////////////////////               
            p1.add(b1);
///////////// ///////////////////////////// ADD TEXTFIELD////////////////////////                
            p1.add(t1);
 ////////////////////////////////////////////ADD PANEL 2/////////////////////////         
            p1.add(p2);
            
            String mainR = t1.getText().toString();
            this.id = Integer.parseInt(mainR);
    }
    
    public int giver()
    {
        return this.id;
    }
    
}
