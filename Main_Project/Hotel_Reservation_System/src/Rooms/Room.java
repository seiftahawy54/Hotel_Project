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
    
    public void Add_room(int RoomID, int RoomNumber, int FloorNumber,int RoomCapacity, String RoomType, double PriceForNight,boolean RoomState) {
        try{
            conn=sqlconection.ConnectDB();
            String str="INSERT INTO `room`(`RoomNum`, `FloorNum`, `RoomCapacity`, `RoomType`, `PriceForNight`, `Service_Name`) VALUES (?,?,?,?,?,?)";

            pst = conn.prepareStatement(str);
            pst.setInt(1, RoomID);
            pst.setInt(2, FloorNumber);
            pst.setInt(3, RoomCapacity);
            pst.setString(4, RoomType);
            pst.setDouble(5, PriceForNight);
            pst.setBoolean(6, RoomState);
            

            pst.executeUpdate();

            pst.close();
            
            conn.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        
        }
    }

    /*
public void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/    
}
