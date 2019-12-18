package Customers;
import DataBase.sqlconection;
import User.*;
import java.sql.*;

public class customer extends user /* Generalization(inherite) from User class */ {Connection conn=null;
    PreparedStatement pst= null;
    ResultSet rs=null;
    private String PaymentMethod;
    private String Order;
    private int DaysOfStaying;
    private int NumberOfPeople;
    sqlconection db; /* Composition relationship between Customers and DataBase */
    
    public void setPaymentMethod(String PM){
        this.PaymentMethod = PM;
    }
    public String getPaymentMethod(){
        return PaymentMethod;
    }
    
    public void setOrder(String O){
        this.Order = O;
    }
    public String getOrder(){
        return Order;
    }
    
    public void setDaysOfStaying(int DOS){
        this.DaysOfStaying = DOS;
    }
    public int getDaysOfStaying(){
        return DaysOfStaying;
    }
    
    public void setNumberOfPeople(int NOP){
        this.NumberOfPeople = NOP;
    }
    public int getNumberOfPeople(){
        return NumberOfPeople;
    }
     
    public void Add(String name,int ssn,int age,String paymentmethod,int numberofpeople , int daysofstay)
    {
     try{
            conn=sqlconection.ConnectDB();
            String str="insert into customer(Name, SSN, Age, PaymentMethod, NumberOfPeople , DaysOfStay)"
            + "values(?,?,?,?,?,?)";

            pst = conn.prepareStatement(str);
            pst.setString(1, name);
            pst.setInt(2, ssn);
            pst.setInt(3, age);
            pst.setString(4,paymentmethod);
            pst.setInt(5, numberofpeople);
            pst.setInt(6, daysofstay);
            

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
    
    public void Delete(int id)
    {
        conn=sqlconection.ConnectDB();
        try{
            String del="delete from customer where id='"+id+"'";
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
    
   public void Update(String name, int ssn , int age,String paymentmethod,int numberofpeople , int daysofstay , int id)
    {
        try{
            conn=sqlconection.ConnectDB();
            String str="update customer set Name=?, SSN=?, Age=?, PaymentMethod=?, NumberOfPeople=? , DaysOfStay=? where ID=?";
            
            pst = conn.prepareStatement(str);
            pst.setString(1, name);
            pst.setInt(2, ssn);
            pst.setInt(3, age);
            pst.setString(4, paymentmethod);
            pst.setInt(5, numberofpeople);
            pst.setInt(6, daysofstay);
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
}
