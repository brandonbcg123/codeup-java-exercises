import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner loops = new Scanner(System.in);

////       Problem 1a.
////        Refactor to For Loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//
//
////        Problem 1b.
////        Refactor to For Loop
//        System.out.println();
//
//        for (int j = 0; j <= 100; j += 2) {
//            System.out.println(j);
//        }
////        counts by 2 from 0 to 100
////
////        Refactor to For Loop
//        System.out.println();
//
//        for (int j = 100; j >= -10; j -= 5) {
//            System.out.println(j);
//        }
////    counts down by -5 from 100 to -10
//
//
////        Refactor to For Loop
//        System.out.println();
//
//        for (long j = 2; j < 1000000; j *= j) {
//            System.out.println(j);
//        }
////    squares each number until it reached 1000000
//    }
//}

//  Problem 2.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

//        Problem 3.
        System.out.println();
        String continuation;
        do {
            int number;
            int j = 1;
            System.out.print("What number would you like to go up to? \n");
            number = loops.nextInt();

            System.out.println("\nHere is your table!\n");

            System.out.printf("%-10s|%-10s|%-10s\n", "Number", "Squared", "Cubed");

            System.out.printf("%-10s|%-10s|%-10s\n", "------", "-------", "-----");
            do {
                String output = String.format("%-10s|%-10s|%-10s", j, j * j, j * j * j);
                System.out.println(output);
//            System.out.printf("%-10s|%-10s|%-10s \n", j , j * j , j * j *j);
//            System.out.print(j * j);
//            System.out.println(j * j * j);
                j++;
            } while (j <= number);
            System.out.println("\nWould you like to continue?");
            continuation = loops.next();
        } while (continuation.equalsIgnoreCase("y"));

        //        Problem 4.
        System.out.println();

        String moreGrades;
        int grade;


        do {
            System.out.println("Please enter your grade from 0 to 100. ");

            grade = loops.nextInt();

            System.out.println("\nHere is your grade:");
//            if (grade <= 100 && grade >= 88) {
            if (grade <= 100 && grade >= 96) {
                System.out.println("A+");
            } else if (grade <= 95 && grade >= 92) {
                System.out.println("A");
            } else if (grade <= 91 && grade >= 88) {
                System.out.println("A-");
            } else if (grade <= 87 && grade >= 85) {
                System.out.println("B+");
            } else if (grade <= 84 && grade >= 82) {
                System.out.println("B");
            } else if (grade <= 81 && grade >= 80) {
                System.out.println("B-");
            } else if (grade <= 79 && grade >= 75) {
                System.out.println("C+");
            } else if (grade <= 74 && grade >= 71) {
                System.out.println("C");
            } else if (grade <= 70 && grade >= 67) {
                System.out.println("C-");
            } else if (grade <= 66 && grade >= 64) {
                System.out.println("D+");
            } else if (grade <= 63 && grade >= 62) {
                System.out.println("D");
            } else if (grade <= 61 && grade >= 60) {
                System.out.println("D-");
            } else if (grade <= 59 && grade >= 50) {
                System.out.println("F+");
            } else if (grade <= 49 && grade >= 40) {
                System.out.println("F");
            } else if (grade <= 39 && grade >= 0) {
                System.out.println("F-");
            } else {
            System.out.println("Not a valid grade!");
        }
        System.out.println("\nWould you like to continue?");
        moreGrades = loops.next();
    } while(moreGrades.equalsIgnoreCase("y"));

}

}