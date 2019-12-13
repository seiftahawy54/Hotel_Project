
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login  extends JFrame{
    JPanel p1,p2;
   
    JButton login;
    JButton exit;
    JTextField username;
    JPasswordField password;
    JLabel name,line;
    JLabel pass;
            
    public Login() {
        login=new JButton("LOGIN");
        exit=new JButton("EXIT");
        username=new JTextField();
        password =new JPasswordField();
        name=new JLabel("USERNAME : ");
        pass=new JLabel("PASSWORD : ");
        line=new JLabel("HOTEL RESGISTRATION ");

        p1=new JPanel();
        p2=new JPanel();

        setTitle("LOGIN FORM");
        setSize(900,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(500, 200);
        name.setFont(new Font("Agency fb", Font.BOLD,35));
        pass.setFont(new Font("Agency fb", Font.BOLD,35));
        name.setForeground(Color.orange);
        pass.setForeground(Color.orange);
        login.setFont(new Font("Agency fb", Font.BOLD,40));
        exit.setFont(new Font("Agency fb", Font.BOLD,40));
        login.setBackground(Color.ORANGE);
        exit.setBackground(Color.ORANGE);
        
        setLayout(null);
        p1.setBackground(Color.darkGray);
        p2.setBackground(Color.ORANGE);
        
        login.setBounds(550,450,250,50);
        exit.setBounds(150 ,450,250,50);
        username.setBounds(170,220,650,50);
        password.setBounds(170,320,650,50);
        name.setBounds(25, 195, 150, 100);
        pass.setBounds(22, 295, 150, 100);
        line.setBounds(300,70, 400,100);
        line.setFont(new Font("Agency fb", Font.BOLD,40));
       
        
        add(p1);
        p1.setLayout(null);
        p1.setBounds(0,0, 900, 600);
        p2.setLayout(null);
        p2.setBounds(290,70, 350,100);
        p1.add(login);
        p1.add(exit);
        p1.add(username);
        p1.add(password);
        p1.add(name);
        p1.add(pass);
        p1.add(line);
        p1.add(p2);

    }
}
