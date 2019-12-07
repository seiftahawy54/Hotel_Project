package Rooms;
import Customers.guest;
import java.util.Date;

public class Booking extends guest {
   
    public void setGuestData(String GuestName,String GuestID,Date StartDate,Date EndDate,Date History)
    {//Getdata from user
      
      this.GuestName=GuestName;
      this.GuestID=GuestID;
      this.StartDate=StartDate;
      this.EndDate=EndDate;
      this.History=History;
    }
   /* public String getGuestData()
    {//returning the data we set
        return GuestName + GuestID + StartDate.toString + EndDate.toString + History ;
       
    }*/
   @Override 
   public String  toString(){
    return "main_class{" +"GuestName="+GuestName+",GuestID="+ GuestID +",StartDate="+StartDate+",EndDate="+EndDate+",History"+History+ "}";
   }
   
}

