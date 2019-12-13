
import java.sql.*;
import javax.swing.*;

public class sqlconection {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private Statement stmn;
    private String InsertQuere=null;
    public static Connection ConnectDB(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_2","root","");
        
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public int serrsh(String sql){
        conn=sqlconection.ConnectDB();
    try{

        ResultSet result=stmn.executeQuery(sql);
        if(result.next()) {
            return 1;
        } 
        }
    catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    return 0;
    }
    public int insert(String sql){
        try{
            //insert in DB
            // InsertQuere ="INSIRT INTO "+TableName +" (id,name,gender,ssn,position) VALUES ("+ id + ",'" +name+"','"+gender+"','"+ssn+"','"+position+"' )";
            //InsertQuere = "INSERT INTO " + TableName + " (`id`, `name`, `gender`, `ssn`, `position`) VALUES ("+ id + ",'" +name+"','"+gender+"','"+ssn+"','"+position+"' )";
            //System.out.println(sql);
            stmn.executeUpdate(sql);
            return 1;
            //System.out.println("inserted successfuiiy");
        }
        catch(SQLException e){
            //error condetion
            e.printStackTrace();
        }
        return 0;
    }
    
   public int update(String sql){
        try{
        //update the D
        stmn.executeUpdate(sql);
        return 1;
        }
        catch(SQLException e){
            //update error
        }
       return 0;
    }
   public int delete(String sql){
        try{
        //delete from the DB
        stmn.executeUpdate(sql);
        return 1;
        }
        catch(SQLException e){
            //update error
        }
    return 0;
    }
}
