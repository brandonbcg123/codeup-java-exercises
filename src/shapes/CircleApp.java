package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Input input = new Input();

    double radius;
    radius = input.getDouble("enter a radius");

    Circle circle = new Circle(radius);

        System.out.println("The area of the circle:" + circle.getArea());
        System.out.println("The circumference of the circle:" + circle.getCircumference());
    }
}