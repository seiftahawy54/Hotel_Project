package Customers;
import DataBase.database;
import User.*;

public class customer extends user /* Generalization(inherite) from User class */ implements UserFunction {
    private String PaymentMethod;
    private String Order;
    private int DaysOfStaying;
    private int NumberOfPeople;
    database db; /* Composition relationship between Customers and DataBase */
    
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
     
    public void Add(int ssn,String name,int salary,String position,int age,String gender){
        System.out.println("Customer has been added successfully");/* Assuming */
    }
    
    public void Delete(){
        System.out.println("Customer has been deleted successfully");/* Assuming */
    }
    
    public void Update(){
        System.out.println("Date has been updated successfully");/* Assuming */ 
    }
}

