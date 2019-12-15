
package GUI;

/* JAVA SWING LIBRARIES */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import DataBase.sqlconection;
import java.sql.*;

public class Login  extends JFrame {
    ////////////////////////initialization of our components///////////////////////////////////////////////
    private JPanel p1,p2;
    private JButton login,exit;
    private JTextField username;
    private JPasswordField password;
    private JLabel name,line,pass;
   
    public Login() {
    /////////////////////////////// DECLARETION OF THE JPanel/////////////////////////////       
            p1=new JPanel();
            p2=new JPanel();
    /////////////////////////////// DECLARETION OF THE BUTTONS//////////////////////////////               
            login=new JButton("LOGIN");
            exit=new JButton("EXIT");
    /////////////////////////////// DECLARETION OF THE JTextField//////////////////////////////               
            username=new JTextField();
    /////////////////////////////// DECLARETION OF THE JPasswordField//////////////////////////////                
            password =new JPasswordField();
    /////////////////////////////// DECLARETION OF THE LABELS//////////////////////////////         
            name=new JLabel("USERNAME : ");
            pass=new JLabel("PASSWORD : ");
            line=new JLabel("HOTEL RESGISTRATION ");
     ////////////////////////////// SET THE FRAME//////////////////////////////////////        
            this.setTitle("LOGIN FORM");
            this.setSize(900,600);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setLocation(500, 200);
            this.setLayout(null);       
    ////////////////////////////////////////////// SET THE PANEL////////////////////////////////               
            p1.setBounds(0,0, 900, 600);
            p1.setBackground(Color.darkGray);
            p1.setLayout(null);

            p2.setBackground(Color.ORANGE);
            p2.setLayout(null);
            p2.setBounds(0,0, 900,200);
    /////////////////////////// SET  OF TextField////////////////////////////////   
            username.setBounds(170,220,650,50);
            username.setFont(new Font("Agency fb", Font.BOLD,35));
    /////////////////////////// SET  OF PasswordField ////////////////////////////////        
            password.setBounds(170,320,650,50);
            password.setFont(new Font("Agency fb", Font.BOLD,35));
    /////////////////////////// SET  OF Labels ////////////////////////////////        
            name.setBounds(25, 195, 150, 100);
            name.setFont(new Font("Agency fb", Font.BOLD,35));
            name.setForeground(Color.orange);

            pass.setBounds(22, 295, 150, 100);
            pass.setFont(new Font("Agency fb", Font.BOLD,35));
            pass.setForeground(Color.orange);

           line.setBounds(140,40, 800,100);
           line.setFont(new Font("Agency fb", Font.BOLD,90));
           line.setForeground(Color.DARK_GRAY);

    /////////////////////////// SET  OF BUTTONS////////////////////////////////
           login.setFont(new Font("Agency fb", Font.BOLD,40));
           login.setBackground(Color.ORANGE);
           login.setForeground(Color.DARK_GRAY);
           login.setBounds(550,450,250,50);

           exit.setFont(new Font("Agency fb", Font.BOLD,40));
           exit.setBackground(Color.ORANGE);
           exit.setForeground(Color.DARK_GRAY);
           exit.setBounds(150 ,450,250,50);
    /////////////////////  ADD PANEL////////////////////////////////////////////////            
           this.add(p1);              
    ////////////////// // ADD BUTTONS/////////////////////////////////////////////////        
           p1.add(login);
           p1.add(exit);
    ////////////////////  ADD TEXTFIELD///////////////////////////////////////               
           p1.add(username);
     ////////////////////  ADD PASSWORDFIELD///////////////////////////////////////                     
           p1.add(password);
    //////////////////// ADD LABELS ///////////////////////       
           p1.add(name);
           p1.add(pass);
           p1.add(line);
    /////////////////////  ADD PANEL 2////////////////////////////////////////////////           
           p1.add(p2);

            ActionHandler LoginChecker = new ActionHandler();
            Exiter exiter = new Exiter();
            login.addActionListener(LoginChecker);
            exit.addActionListener(exiter);
        }
    
    private class ActionHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            try {
                    String userName = username.getText().toString();
                    String userPassword = password.getText().toString();
                    /* Connection Getting Ready */
                    Connection conn = sqlconection.ConnectDB();
                    String sql_line = "SELECT * FROM user WHERE UserName = ? AND Password = ?";
                    PreparedStatement pst = conn.prepareStatement(sql_line);
                    
                    pst.setString(1, userName);
                    pst.setString(2, userPassword);
                    
                    ResultSet return_data = pst.executeQuery();
                    
                    if (return_data.next())
                    {
                        String usertype = return_data.getString("UserType");
                        
                        if (usertype.equals("user"))
                        {
                            Login.this.setVisible(false);
                            JOptionPane.showMessageDialog(null, String.format("%s %s", "Welcome Sir", userName));
                            UserModule go = new UserModule();
                            
                        } else if (usertype.equals("rms")) {
                            Login.this.setVisible(false);
                            JOptionPane.showMessageDialog(null, String.format("%s %s", "Welcome RMS", userName));
                            RMS go = new RMS();
                        } else if (usertype.equals("service")) {
                            Login.this.setVisible(false);
                            JOptionPane.showMessageDialog(null, String.format("%s %s", "Welcome Serivce MS", userName));
                            SeriveMS go = new SeriveMS();
                        }
                        
                        
                        /*
                        while (return_data.next()) {
                            if (usertype.equals("user"))
                            {
                                Login.this.setVisible(false);
                                JOptionPane.showMessageDialog(null, String.format("%s", "Welcome Sir"));
                                // Testing frame2 = new Testing();
                            }
                        }
                        */
                    }
                
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
    }
    
    private class Exiter implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, String.format("%s", "Thanks for using our app :)"));
            // Login.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
