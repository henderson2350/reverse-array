import java.util.*;

public class Reverse {
    public int[] arrayy;

    public Reverse(int[] arrayy) {
        this.arrayy = arrayy;
    }

    //Brute force method
    public int[] reverseArrayBrute() {

        int[] reversedArray = new int[this.arrayy.length];

        int counter = 0;
        for (int i=this.arrayy.length -1 ; i>=0; i--) {
            reversedArray[counter] = this.arrayy[i];
            counter++;
        }
        return reversedArray;
    }
}