package User;
import java.awt.print.PrinterException;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import DataBase.sqlconection;


public class Employee extends user {
    
    Connection conn=null;
    PreparedStatement pst= null;
    ResultSet rs=null;
    double salary;
    int age;
    String position;
    
    
    public void Update(int id,int ssn,String name,int salary,String position,int age,String gender)
    {
        try{
            conn=sqlconection.ConnectDB();
            String str="update employee set ssn=?, Name=?, Salary=?, Position=?, Age=?, gender=? where ID=?";
            
            pst = conn.prepareStatement(str);
            pst.setInt(1, ssn);
            pst.setString(2, name);
            pst.setInt(3, salary);
            pst.setString(4, position);
            pst.setInt(5, age);
            pst.setString(6, gender);
            
            pst.setInt(7, id);
            

            pst.executeUpdate();

            pst.close();

            
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

                        
    }
    
    
    public void Delete(int id)
    {
        conn=sqlconection.ConnectDB();
        try{
            String del="delete from employee where id='"+id+"'";
            pst=conn.prepareStatement(del);
            pst.executeUpdate();
            pst.close();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }
    }
    
    
    
    public void Add(int ssn,String name,int salary,String position,int age,String gender)
    {
     try{
            conn=sqlconection.ConnectDB();
            String str="insert into employee(ssn, Name, Salary, Position, Age, gender)"
            + "values(?,?,?,?,?,?)";

            pst = conn.prepareStatement(str);
            pst.setInt(1, ssn);
            pst.setString(2, name);
            pst.setInt(3, salary);
            pst.setString(4, position);
            pst.setInt(5, age);
            pst.setString(6, gender);
            

            pst.executeUpdate();

            pst.close();

            
            //pst.close();
            
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        
        }
    }
}