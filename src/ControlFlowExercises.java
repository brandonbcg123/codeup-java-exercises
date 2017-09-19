import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner loops = new Scanner(System.in);

//       Problem 1a.
        int i = 5;
        while(i <= 15) {
            System.out.print(i + " ");
            i++;
        }

//        Problem 1b.
//        System.out.println();
//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//
//        } while (j <= 100);
//    counts by 2 from 0 to 100

//        System.out.println();
//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -10);
//    counts down by -5 from 100 to -10

        System.out.println();
        long j = 2;
        do {
            System.out.println(j);
            j *= j;
        } while (j < 100000);
    }
}
