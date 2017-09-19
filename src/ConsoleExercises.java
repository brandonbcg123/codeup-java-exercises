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


//        System.out.println("Please enter the length of the classroom.");
//        int length = Integer.parseInt(scan.nextLine());
//        System.out.println("Please enter the width of the classroom.");
//        int width = Integer.parseInt(scan.nextLine());
//        int area = length * width;
//        System.out.println("The area of the room is: " + area);
//        int perimeter = (2 * length) + (2 * width);
//        System.out.println("The perimeter of the room is: " + perimeter);


//       Bonus 1
        System.out.println("Please enter the length of the classroom.");
        double length = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter the width of the classroom.");
        double width = Double.parseDouble(scan.nextLine());
        double area = length * width;
        System.out.printf("The area of the room is: %.2f%n", area);
        double perimeter = (2 * length) + (2 * width);
        System.out.printf("The perimeter of the room is: %.2f%n" , perimeter);
        //The %.2f round to two decimal places and the %n adds a new lines

//    Bonus 2
        System.out.println("Please enter the height of the classroom.");
        double height = Double.parseDouble(scan.nextLine());
        double volume = length * width * height;
        System.out.printf("The volume of the room is: %.2f%n", volume);
    }

}