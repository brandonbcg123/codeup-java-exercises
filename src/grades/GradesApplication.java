package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        students.put("brandonbcg123", new Student("Brandon"));
        students.get("brandonbcg123").addGrade(100);
        students.get("brandonbcg123").addGrade(90);
        students.get("brandonbcg123").addGrade(95);

        students.put("nicholasgswan", new Student("Nick"));
        students.get("nicholasgswan").addGrade(100);
        students.get("nicholasgswan").addGrade(100);
        students.get("nicholasgswan").addGrade(100);

        students.put("kathycodingexpert", new Student("Kathy"));
        students.get("kathycodingexpert").addGrade(84);
        students.get("kathycodingexpert").addGrade(93);
        students.get("kathycodingexpert").addGrade(95);

        students.put("vdogajaxin1234", new Student("Vincent"));
        students.get("vdogajaxin1234").addGrade(30);
        students.get("vdogajaxin1234").addGrade(52);
        students.get("vdogajaxin1234").addGrade(90);

        String continueOn;
        do {
            for (String usernames : students.keySet()) {
                System.out.println(usernames);
            }
            String userInput = input.getString("Enter a Username: ");
            if(students.containsKey(userInput)){
                System.out.println("Student's Name: " + students.get(userInput).getName());
                System.out.println("Student's Grade average: " + students.get(userInput).getGradeAverage());
            }else{
                System.out.println("NO STUDENTS BY THAT USERNAME!!!");
            }
            continueOn = input.getString("Do you want to continue");
        } while (continueOn.equalsIgnoreCase("y")
                || (continueOn.equalsIgnoreCase("yes")));
        System.out.println("Goodbye, and have a wonderful day!");

//        System.out.println(students.get("nicholasgswan").getGradeAverage());


        // Iterating over keys only
//        for (String key : map.keySet()) {
//            System.out.println("Key = " + key);
//        }
//
//// Iterating over values only
//        for (String value : map.values()) {
//            System.out.println("Value = " + value);
//        }


    }
}