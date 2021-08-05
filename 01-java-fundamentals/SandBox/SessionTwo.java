import java.util.ArrayList;
import java.util.HashMap;

public class SessionTwo {
    public static void main(String[] args) {
        // Array
        int[] myArray=new int[3];
        // myArray[0]=200;
        // myArray[1]=900;
        // myArray[2]=700;
        for(int j=0;j<myArray.length;j++){
            myArray[j]=j+10;
        }

        // Exception Handling
        try{
            myArray[5]=100;
        }
        catch(Exception e){
            System.out.println("Some error, but keep moving!!");
        }
       
        //for each loop 
        for(int num:myArray ){
            System.out.println(num);
        }
        String[] colors={"Red","Blue","yellow"};
        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }

        //Arraylist
        ArrayList<String> myArrayList=new ArrayList<String>();
        myArrayList.add("Reena");
        myArrayList.add("Matt");
        myArrayList.add("Devon");
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));

        //Hashmap
        HashMap<String,String> superHeros=new HashMap<String,String>();
        superHeros.put("Hulk","Can turn Green");
        superHeros.put("Cap","Brave");
        superHeros.put("Iron Man","Smart");
        superHeros.put("MyMom","Love");
        System.out.println(superHeros);
        // System.out.println(superHeros.get("Hulk"));

        for(String hero:superHeros.keySet()){
            System.out.println(hero + ":" + superHeros.get(hero) );
        }

        for(String superPower:superHeros.values()){
            System.out.println(superPower);
        }

        HashMap<String,String> student=new HashMap<String,String>();
        student.put("firstName","Ellie");
        student.put("lastName","Hanson");
        student.put("email","e@gmail.com");
        student.put("stack","Java");

        System.out.println(student.get("firstName"));

    }
}
