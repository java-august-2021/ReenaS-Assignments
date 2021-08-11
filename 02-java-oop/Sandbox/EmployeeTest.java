/**
 * EmployeeTest
 */
public class EmployeeTest {
   public static void main(String[] args) {
      Employee paul=new Employee("paul@chimp.com",250000);
      // paul.email="paul@chimp.com";
      // paul.pay=250000;
      // paul.setEmail("paul@chimp.com");
      // System.out.println(paul.getEmail());
      Employee Jordan=new Employee("Jordan@chimp.com",300000);
      // System.out.println(Jordan.getEmail());
      // System.out.println(Jordan.getPay());
      paul.empDetails();
      Jordan.payRaise();
      Jordan.empDetails();
      paul.payRaise(8);
      Employee mike=new Employee("mike@chimp.com",350000,"GetBananas");
      mike.empDetails();
      
     System.out.println(Employee.getNoOfEmps());

     Jordan.setManager(mike);
     System.out.println("\n*************\n");
   //   Employee newManager= Jordan.getManager();
   //   newManager.empDetails(); 
    Jordan.getManager().empDetails();
    //mike.empDetails()   




      





      

   }

  
}