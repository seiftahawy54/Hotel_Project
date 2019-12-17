package User;

public interface UserFunction {
    
   public void Add(int ssn,String name,int salary,String position,int age,String gender);
   public void Delete();
   public void Update(int id,int ssn,String name,int salary,String position,int age,String gender);
   
}