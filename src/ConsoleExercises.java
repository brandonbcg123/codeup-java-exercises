import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer.");
        int integerEntered = scan.nextInt();
        System.out.println(integerEntered);
//        If an integer is not entered than Java will not execute the full code.

        System.out.println("Please enter 3 words.");
        String wordOne = scan.next();
        String wordTwo = scan.next();
        String wordThree = scan.next();
        scan.nextLine();
        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);
//        If less than three words are entered the scanner won't run and if more than 3 words are entered than the scanner will only take the first three words'

        System.out.println("Please enter a sentence.");
        String sentence = scan.nextLine();
        System.out.println(sentence);
//        It only captures the first one when only using next()

        System.out.println("Please enter the length of the classroom.");
        int length = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter the width of the classroom.");
        int width = Integer.parseInt(scan.nextLine());
        int area = length * width;
        System.out.println("The area of the room is: " + area);
        int perimeter = (2 * length) + (2 * width);
        System.out.println("The perimeter of the room is: " + perimeter);
    }
}