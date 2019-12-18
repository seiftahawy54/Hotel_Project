package Services;

import DataBase.sqlconection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class service {
    /*using protected modifier to make access on the attributes only in their super or derived classes*/
    protected String Name;
    protected String Description;
    protected double Price;
    Connection conn=null;
    PreparedStatement pst= null;
    ResultSet rs=null;

    public service() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getName() {
        return Name;
    }
    
     
    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }
    
    public String getReport(){
       return Name + Description + Price;
    }
    
    public void Update(String servicename, String Servicedescription, double servicePrice)
    {
        try{
            conn=sqlconection.ConnectDB();
            String str="UPDATE `service` SET `ServiceName`=?,`ServiceDescription`=?,`ServicePrice`=[value-3] WHERE servicename = ?";
            
            pst = conn.prepareStatement(str);
            pst.setString(3, servicename);
            pst.setString(1, Servicedescription);
            pst.setDouble(2, servicePrice);
            pst.executeUpdate();

            pst.close();

            
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

                        
    }
    
    
    public void Delete(String servicename)
    {
        conn=sqlconection.ConnectDB();
        try{
            String del="delete from service where ServiceName='"+servicename+"'";
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
    
    
    
    public void Add(String servicename, String Servicedescription, double servicePrice)
    {
        try{
               conn=sqlconection.ConnectDB();
               String str="insert into service(ServiceName, ServiceDescription, ServicePrice)"
               + "values(?,?,?)";

               pst = conn.prepareStatement(str);
               pst.setString(1, servicename);
               pst.setString(2, Servicedescription);
               pst.setDouble(3, servicePrice);


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

