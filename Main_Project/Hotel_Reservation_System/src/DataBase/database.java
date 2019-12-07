
package DataBase;

import java.sql.*;


public class database {
   private final String DRIVER="com.mysql.jdbc.Driver";
   private final String URL="jdbc:mysql://localhost/hotel";
   private final String NAME="root";
   private final String PASSWORD="root1234";
  
   //private String TableName = null;
   //private String QuereName = null;
   private Connection con;
   private Statement stmn;
   private String InsertQuere=null;
   //private String UpdateQuere=null;   
    database(){
    
        con=null;
        stmn=null;
        
        try{
            //connecting to the data base
            Class.forName(DRIVER);
            con=DriverManager.getConnection(URL, NAME, PASSWORD);
            //connecting sicssesfuly condetion
            if(con!=null)
                System.out.println("connected");
            stmn=con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            //error condetion
            System.out.println(e.getMessage());
        }
    }
    
    void insert(String TableName,String name,String gender,String ssn,String position){
        try{
            //insert in DB
            InsertQuere ="INSIRT INTO "+TableName +" (name,gender,ssn,position) VALUES ('"+name+"','"+gender+"','"+ssn+"','"+position+"' )";
            stmn.executeUpdate(InsertQuere);
            System.out.println("inserted successfuiiy");
        }
        catch(SQLException e){
            //error condetion
            System.out.println("inserting error");
        }
    }
    String Select(int id,String QuereName,String TableName){
        try{
        //select from DB
        String SelectQuere ="SELECT "+QuereName+" FROM "+TableName+"whare id ="+id;
        ResultSet result=stmn.executeQuery(SelectQuere);
        while(result.next())
         return result.getString(QuereName);
        }
        catch(SQLException e){
            //selecting error
            System.out.println("Selecting error");
        }
       return "0";
    }
    
    void update(String TableName,String QuereName,int id, String NewData){
        try{
        //update the DB
        String UpdateQuere ="UPDATE "+TableName+" set "+QuereName+"= "+NewData+" whare id ="+id;
        stmn.executeUpdate(UpdateQuere);
        System.out.println("updated successfuiiy");
        }
        catch(SQLException e){
            //update error
            System.out.println("Selecting error");
        }
    }
    
    void delete(String TableName,int id){
        try{
        //delete from the DB
        String DeleteQuere ="DELETE FROM "+TableName+" whare id ="+id;
        stmn.executeUpdate(DeleteQuere);
        System.out.println("deleted successfuiiy");
        }
        catch(SQLException e){
            //update error
            System.out.println("deleting error");
        }
    }
    
}
