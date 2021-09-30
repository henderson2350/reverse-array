public class Main {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        Reverse reverse = new Reverse(array1);
        
        for (int i=0; i<reverse.reverseArrayBrute().length; i++) {
            System.out.println(reverse.reverseArrayBrute()[i]);
        }
    }
}
