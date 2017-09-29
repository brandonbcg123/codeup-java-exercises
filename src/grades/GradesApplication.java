package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

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

//        System.out.println(students.get("nicholasgswan").getGradeAverage());
    }
}
