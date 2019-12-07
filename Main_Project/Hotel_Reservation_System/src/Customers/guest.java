/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;
import Rooms.*;
import Services.service;
import java.util.Date;

public class guest extends customer {
    public String GuestName;
    public String GuestID;
    public Date StartDate;
    public Date EndDate;
    public Date History;
    Booking BK; /* Composition relationship between Booking and Guest */
    Room RM; /* Composition relationship between Rooms and Guest */
    service SV; /* Composition relationship between Services and Guest */

}
