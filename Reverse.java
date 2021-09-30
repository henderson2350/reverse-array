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

    //O(n/2) method
    //Swapping items
    public int[] reverseBetter() {
        for (int i=0; i<arrayy.length/2; i++) {
            int temp  = arrayy[i];
            arrayy[i] = arrayy[arrayy.length - i -1];
            arrayy[arrayy.length - i -1] = temp;
        }

        return arrayy;
    }
}