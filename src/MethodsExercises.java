import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(4, 6));
        System.out.println(subtract(4, 6));
        System.out.println(multiply(4, 6));
        System.out.println(divide(4, 6));
        System.out.println(module(4, 6));
        int userNumber = getInteger(4, 11);
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scan.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("This is an invalid input, please try again.");
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }
}