/**
 * EmployeeTest
 */
public class EmployeeTest {
   public static void main(String[] args) {
      Employee Jordan=new Employee("Jordan@chimp.com",300000);
      Jordan.empDetails();

      Engineer lucas=new Engineer("lucas@chimp.com",400000,"Banana Smoothie");

      lucas.empDetails();
      lucas.setEmail("l@chimp.com");
      lucas.empDetails();
      lucas.enggDetails();
      lucas.addSkill("Find Banana");
      lucas.addSkill("Throw Banana");
      lucas.enggDetails();

   }
}