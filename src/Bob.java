//Problem 2

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userAnswers;
        String keepTalking;

        do {
        System.out.println("Talk to Bob");
            userAnswers = scan.nextLine();
            if (userAnswers.endsWith("?")) {
                System.out.println("Sure");
            } else if (userAnswers.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (userAnswers.endsWith("!") || userAnswers.toUpperCase().equals(userAnswers)) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
            System.out.println("Do you want to keep talking to Bob? y/n");
            keepTalking = scan.nextLine();
        } while (keepTalking.equalsIgnoreCase("y"));
    }
}
//    Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.