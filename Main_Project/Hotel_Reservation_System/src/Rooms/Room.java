package Rooms;
import DataBase.database;
import DataBase.sqlconection;
import Services.service;
import User.*;
import java.sql.*;

public class Room {
    public int RoomID;
    public int RoomNumber;
    public int FloorNumber;
    public int RoomCapacity;
    public String RoomType;
    public Double PriceForNight;
    public Boolean RoomState;
    database db; // A compostion relationship between database and rooms
    
    Connection conn=null;
    PreparedStatement pst= null;
    ResultSet rs=null;
    

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int FloorNumber) {
        this.FloorNumber = FloorNumber;
    }

    public int getRoomCapacity() {
        return RoomCapacity;
    }

    public void setRoomCapacity(int RoomCapacity) {
        this.RoomCapacity = RoomCapacity;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public Double getPriceForNight() {
        return PriceForNight;
    }

    public void setPriceForNight(Double PriceForNight) {
        this.PriceForNight = PriceForNight;
    }

    public Boolean getRoomBusy() {
        return RoomState;
    }

    public void setRoomState(Boolean RoomState) {
        this.RoomState = RoomState;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }
    
    public String CalculateBill()
    {
        return null;
    }
    
    public void Add_Room(int RoomID, int FloorNumber,int RoomCapacity, String RoomType, double PriceForNight, String serviceName) {
        try{
            conn=sqlconection.ConnectDB();
            String str="INSERT INTO `room`(`RoomNum`, `FloorNum`, `RoomCapacity`, `RoomType`, `PriceForNight`, `Service_Name`) VALUES (?,?,?,?,?,?)";

            pst = conn.prepareStatement(str);
            pst.setInt(1, RoomID);
            pst.setInt(2, FloorNumber);
            pst.setInt(3, RoomCapacity);
            pst.setString(4, RoomType);
            pst.setDouble(5, PriceForNight);
            pst.setString(6, serviceName);

            pst.executeUpdate();

            pst.close();
            
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        
        }
    }

    public void Update_rooms(int RoomID, int FloorNumber,int RoomCapacity, String RoomType, double PriceForNight, String serviceName) {
            try{
            conn=sqlconection.ConnectDB();
            String str="UPDATE `room` SET `FloorNum`=?,`RoomCapacity`=?,`RoomType`=?,`PriceForNight`=?,`Service_Name`=? WHERE `RoomNum` = ?";
            
            pst = conn.prepareStatement(str);
            pst.setInt(6, RoomID);
            pst.setInt(1, FloorNumber);
            pst.setInt(2, RoomCapacity);
            pst.setString(3, RoomType);
            pst.setDouble(4, PriceForNight);
            pst.setString(5, serviceName);
            

            pst.executeUpdate();

            pst.close();

            
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void Delete(int id) {
        conn=sqlconection.ConnectDB();
        try{
            String del="delete from room where id='"+id+"'";
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
  
}
