package Rooms;

public class Room {
    public String RoomName;
    public int FloorNumber;
    public int RoomCapacity;
    public String RoomType;
    public Double PriceForNight;
    public Boolean RoomBusy;
    public int RoomID;
    DataBase db; // A compostion relationship between database and rooms
    

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
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
        return RoomBusy;
    }

    public void setRoomBusy(Boolean RoomBusy) {
        this.RoomBusy = RoomBusy;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }
    
    public String CalculateBill()
    {
        return;
    }
}
