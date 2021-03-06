/**
 * HelloJava
 */
import java.time.LocalDate; // import the LocalDate class

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java World!!");
        // Primitive Types -8 
        byte myByte=20;
        int myInt=5000000;
        long myLong=8990099888978L;
        float myFloat=56.78f;
        double myDouble=56.7898892;
        boolean myBool=true;
        char myChar='g';
        LocalDate myObj = LocalDate.now();// Create a date object
        System.out.println(myObj); // Display the current date
        // Non Primitive Type
        String myName=new String("John");
        System.out.println(myName);
        System.out.println(myName.toUpperCase());
        //Calling Method
        OneTo255();
        // Method overloading
        greet();
        greet("Frank");

    }
    public static void OneTo255() {
        for(int i=1;i<=255;i++){
            System.out.println(i);
        }
    }
    public static void greet() {
        System.out.println("Hello Welcome to CD");
    }
    public static void greet(String firstName) {
        System.out.println("Hello Welcome to CD " + firstName);
        System.out.println("Hello " + firstName + " welcome to Java");
        String lastName="Dangi";
        System.out.println(String.format("Hello %s %s welcome to Jaclearva",firstName,lastName));

    }
    
}