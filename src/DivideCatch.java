import java.util.Scanner;

public class DivideCatch {
    public static void main(String [] args){
        try {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the numerator: ");
            int numerator = scan.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scan.nextInt();

            System.out.println("The result of the dividing operation: " + (numerator / denominator));

        }
            catch(Exception ArithmeticException){

                System.out.println("Denominator can't be zero!");

            }
    }
}
