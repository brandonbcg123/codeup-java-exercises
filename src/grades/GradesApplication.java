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
            String userInput = input.getString("Enter a student's github username or 'all' for the whole class: ");
            if (students.containsKey(userInput)) {
                gradeDisplay(students.get(userInput));
                System.out.println("Class Avg: " + getClassAvg(students));
            } else if (userInput.equalsIgnoreCase("all")) {
                for (Student student : students.values()) {
                    gradeDisplay(student);
                }
                System.out.println("Class Avg: " + getClassAvg(students));
            } else {
                System.out.println("NO STUDENTS BY THAT USERNAME!!!");
            }
            continueOn = input.getString("Do you want to continue");
        } while (continueOn.equalsIgnoreCase("y")
                || (continueOn.equalsIgnoreCase("yes")));

        System.out.println("Goodbye, and have a wonderful day!");

    }

    public static void gradeDisplay(Student student) {
        double classTotal = 0;

        double studentAvg = student.getGradeAverage();
        classTotal += studentAvg;

        System.out.println(student.getName() + "'s grades:");
        for (Integer grade : student.getGrades()) {
            System.out.println(grade);
        }

        System.out.println(studentAvg + " avg");
//        System.out.println("Class Average: " + (classTotal / student.size()));
    }

    public static double getClassAvg(HashMap<String, Student> students) {
        double classTotal = 0;

        for (Student student : students.values()) {
            classTotal += student.getGradeAverage();
        }
        return classTotal / students.size();
    }
}