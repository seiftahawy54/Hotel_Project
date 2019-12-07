package Customers;

public class customer extends User /* Generalization(inherite) from User class */ implements UserFunctions{
    private String PaymentMethod;
    private String Order;
    private int DaysOfStaying;
    private int NumberOfPeople;
    DataBase db; /* Composition relationship between Customers and DataBase */
    
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
     
    public void Add(){
        System.out.println("Customer has been added successfully");/* Assuming */
    }
    
    public void Delete(){
        System.out.println("Customer has been deleted successfully");/* Assuming */
    }
    
    public void Update(){
        System.out.println("Date has been updated successfully");/* Assuming */ 
    }
}

