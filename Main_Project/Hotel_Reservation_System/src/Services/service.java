package Services;

public class service {
    /*useing protected modifier to make access
    on the attributes only in their super or derived classes*/
   protected String Name;
   protected String Description;
   protected double Price;

    public service() {
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getName() {
        return Name;
    }
    
     
    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }
    
    public String getReport(){
       return Name + Description + Price;
    }
}

