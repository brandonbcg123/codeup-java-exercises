package grades;

import util.Input;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.size();
    }

    public static void main(String[] args) {
        Student student = new Student("Timmy");
        student.grades.add(100);
        student.grades.add(100);
        student.grades.add(100);
        student.grades.add(50);
        student.grades.add(50);
        student.grades.add(50);
        System.out.println(student.getName() + "'s average grade: " + student.getGradeAverage());
    }
}