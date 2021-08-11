import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava myPuzzle=new PuzzleJava();
        System.out.println(myPuzzle.getTenRolls());
        int[] myArray={1,2,3,4,5};
        System.out.println(Arrays.toString(myPuzzle.shuffleArray(myArray)));
    }
}
