import java.util.Scanner;

public class Question5 {

    public static void main(String[] args){

        try{

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number. ");
            int integer = scan.nextInt();

            if (integer % 2 == 0){

                System.out.print(integer + " is an even number.");

            }
            else{

                System.out.print(integer + " is an odd number.");

            }

        }
            catch (Exception InputMismatchException){

                System.out.println("Input wasn't an integer! A non-integer can't be even or odd!");

            }
    }
}
