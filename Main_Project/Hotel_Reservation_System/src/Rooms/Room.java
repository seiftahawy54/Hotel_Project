package Rooms;
import DataBase.database;
import Services.service;

public class Room {
    public int RoomID;
    public int RoomNumber;
    public int FloorNumber;
    public int RoomCapacity;
    public String RoomType;
    public Double PriceForNight;
    public Boolean RoomState;
    database db; // A compostion relationship between database and rooms
    
    

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
}
