/**
 * Employee
 */
public class Employee {
    // Encapsulation 
    
    // Attribute/Fields 
    // Access Modifiers 
 
    private String email;
    private Double pay;
    private String project;
    private static int noOfEmps=0;
    private Employee manager;

   
    // Constructor  
    public Employee(String email,double pay){
        this.email=email;
        this.pay=pay;
        noOfEmps++;

    }
     // Constructor overloading 
     public Employee(String email,double pay,String project){
        this.email=email;
        this.pay=pay;
        this.project=project;
        noOfEmps++;

    }
    // Getters/Accessor and Setters/Mutator 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    // Static Methods
    public static int getNoOfEmps() {
        return noOfEmps;
    }
   // class methods
   public void empDetails() {
       System.out.printf("\nEmail : %s , Pay: %,.2f, Project: %s",this.email,this.pay, this.project); 
   }
   private double calculateBonus(){
    return 5000;
   }
   // Method - overloading - Polymorphism 
   public void payRaise() {
    
       this.pay+=(this.pay/100)*4 + calculateBonus();
   }
   public void payRaise(int hike) {
    this.pay+=(this.pay/100)*hike + calculateBonus();;
}
    //How object will talk to each other 
    public void setManager(Employee manager) {
        this.manager=manager;
        
    }
    public Employee getManager(){
        return this.manager;
    }
}