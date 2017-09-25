package util;
import java.util.Scanner;

//Problem 3
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        String stringInput = input.getString("Enter Your name: ");
        System.out.println(stringInput);

        Boolean isYes = input.yesNo("Are you over 21 years old?");
        System.out.println(isYes);

        int chooseNumberRange = input.getInt("Please enter a number between 1 to 20:", 1, 20);
        System.out.println(chooseNumberRange);

        int pickNumber = input.getInt("Pick a number.");
        System.out.println(pickNumber);

        double chooseDoubleRange = input.getDouble("Please enter a number between 0 to 1", 0, 1);
        System.out.println(chooseDoubleRange);

        double pickDoubleNumber = input.getDouble("Pick a number.");
        System.out.println(pickDoubleNumber);

    }
}