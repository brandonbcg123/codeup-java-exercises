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
    }
}
