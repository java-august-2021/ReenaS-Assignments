/**
 * HelloJava
 */
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java World!!");
        // Primitive Type -8 
        byte myByte=20;
        int myInt=5000000;
        long myLong=8990099888978L;
        float myFloat=56.78f;
        double myDouble=56.7898892;
        boolean myBool=true;
        char myChar='g';

        // Non Primitive Type
        String myName=new String("John");
        System.out.println(myName);
        System.out.println(myName.toUpperCase());
        // OneTo255();
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

    }
    

    
}