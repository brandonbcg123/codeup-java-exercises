import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(add(4, 6));
        System.out.println(subtract(4, 6));
        System.out.println(multiply(4, 6));
        System.out.println(divide(4, 6));
        System.out.println(module(4, 6));
//        int userNumber = getInteger(4, 11);

        String ask;
        do {
            long userNumber = (long) getInteger(1, 10);
            System.out.println(numberFactorial(userNumber));
            System.out.println("\nDo you want to enter a new number? y/n");
            ask = scan.next();
        } while (ask.equalsIgnoreCase("y") || (ask.equalsIgnoreCase("yes")));

        String rollAgain;
        String rolling;
        do {
            System.out.println("\nYou ready to roll the dice? y/n");
            rolling = scan.next();
            } while (!(rolling.equalsIgnoreCase("y") || rolling.equalsIgnoreCase("yes")));
            do {
            System.out.println("\nHow many sides would you like your dice to have?");
            int userSides = scan.nextInt();
            rollingDice(userSides);
            System.out.println("\nWould you like to roll the dice again? y/n");
            rollAgain = scan.next();
        } while (rollAgain.equalsIgnoreCase("y") || (rollAgain.equalsIgnoreCase("yes")));

    }

    //        Problem 1
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
//        Can't divide by 0 as the result will not have a defined value, so this method would not run as it will be an error
    }

    public static int module(int a, int b) {
        return a % b;
    }

    //    Problem 2
    public static int getInteger(int min, int max) {
        System.out.println("\nEnter a number between " + min + " and " + max);
        int userInput = scan.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("This is an invalid input, please try again.");
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

    //    Problem 3
    public static String numberFactorial(long userNumber) {
        long factorNumber = 1;
        StringBuilder output = new StringBuilder(userNumber + "! = ");
        for (long i = 1; i <= userNumber; i++) {
            factorNumber *= i;
            output.append(i + " x ");
        }
        output.deleteCharAt(output.toString().lastIndexOf('x'));
        output.append(" = " + factorNumber);
        return output.toString();
    }

    //    Problem 4


    public static void rollingDice(int userSides) {
        int sides = 0;
        int diceSidesOne = (int) (Math.random() * (userSides) + 1);
        int diceSidesTwo = (int) (Math.random() * (userSides) + 1);
        System.out.println("Dice One landed on " + diceSidesOne);
        System.out.println("Dice Two landed on " + diceSidesTwo);
    }
}

//                if(die1 + die2 == sum)
//                {
//                    match = 0;
//                    match++;
//                }
//                double probability = 0.0;
//                probability = (double)match / numRolls * 100;
//                System.out.println("     " + sum + "\t\t" + probability);
//            }
//            // Random number between 0 and 1.
//            double a = Math.random();
//            double b = Math.random();

//}

//    public static double rollingDice(double diceOne, double diceTwo) {
//        double value = Math.randomRandom diceRoller = new Random();
//        diceOne = Math.random();
//        diceTwo = Math.random();

// print the numbers and print the higher one
//        System.out.println("Random number 1:" + diceTwo);
//        System.out.println("Random number 2:" + diceOne);
//    } return diceOne, diceTwo;
//        System.out.println("Highest number:" + Math.max(diceOne, diceTwo));
//}

//        if (userInput < min || userInput > max) {
//            System.out.println("This is an invalid input, please try again.");
//            return getInteger(min, max);
//        } else {
//            return userInput;
//        }
