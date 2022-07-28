public class E2 {
    public static void main(String [] args){

    try {

        int[] a = new int [10];

        System.out.println(a[10]);

    }
        catch(Exception IndexOutOfBoundsException){

            System.out.println("Array has no 10th index.");

        }
    /* I've used try-catch block to prevent exception. */
    }
}
