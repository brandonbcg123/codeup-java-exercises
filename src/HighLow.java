import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

//Problem 5 for Methods Exercise
public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tryAgain;
        do {
            System.out.println("Guess the random number between 1 to 100?");
            int userGuess;
            try {
                userGuess = scan.nextInt();
                int randomNumber = (int) (Math.random() * 100) + 1;
                compareGuess(userGuess, randomNumber);
                System.out.println(randomNumber);
                System.out.println("Would you like to guess a new number? y/n");
            } catch (InputMismatchException ime) {
                System.out.println("Not a valid input!");
                System.out.println("Would you like to guess a new number? y/n");
                tryAgain = scan.next();
            }
            tryAgain = scan.next();
        } while (tryAgain.equalsIgnoreCase("y") || (tryAgain.equalsIgnoreCase("yes")));
    }

    public static void compareGuess(int guess, int randomNumber) {

        if (guess < 1 || guess > 100) {
            System.out.println("This is an invalid input, please try again.");
        } else if  (guess < randomNumber) {
            System.out.println("HIGHER");
        } else if (guess > randomNumber) {
            System.out.println("LOWER");
        } else if (guess == randomNumber) {
            System.out.println("GOOD GUESS!");
        }
    }
}