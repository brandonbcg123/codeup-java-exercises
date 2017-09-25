package util;

import java.util.Scanner;

//Problem 3
public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        return userInput;
    }

    public Boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("This is an invalid input, please try again.");
            return getInt(prompt, min, max);
        } else {
            return userInput;
        }
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max) {
            System.out.println("This is an invalid input, please try again.");
            return getDouble(prompt, min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }
}