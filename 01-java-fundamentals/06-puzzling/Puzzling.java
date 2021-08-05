import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzling {

	public static void main(String[] args) {
	    System.out.println(getTenRolls()); 
        generatePassword();
    }
   
    public static ArrayList getTenRolls(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 1; i < 20; i++){
            numbers.add(r.nextInt(10));
        }
        System.out.println(numbers);
        Collections.shuffle(numbers);
        return numbers;
    }
    public static void generatePassword() {
     String ranStr = new String();
        Random ch = new Random();
        for (int i = 0; i < 8; i++) {
        
            char ranChar = (char) ('a' + ch.nextInt(26));
            ranStr+= ranChar;
        }
        System.out.println(ranStr);

    }
       //  Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
       public static ArrayList<Character> alphabetShuffle(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ch++){
            alphabet.add(ch);
        }
        Collections.shuffle(alphabet);
        System.out.println("the first letter is: " + alphabet.get(0));
        System.out.println("the last letter is: " + alphabet.get(25));
        char firstLetter = alphabet.get(0);
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++){
            if(vowels[i] == firstLetter){
                System.out.println("First Letter Is A Vowel");
            }
        }
        return alphabet;
    }
}