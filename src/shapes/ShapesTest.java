package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(7.3);
        showRectangleInfo(myShape);
        myShape = new Rectangle(6.3, 7.7);
        showRectangleInfo(myShape);
       }

    public static void showRectangleInfo (Measurable rectangle) {
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }

}

//9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

//Answer: The code would fail to compile if I left off the getPerimeter method in Rectangle because it would not be defined as it would not have been implemented because every method that's declared as a method of the interface must be implemented by any class that uses the interface.

//10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

//Answer: It would result in an error because the getLength and getWidth methods of the myShape variable does not exist for the type Measurable, as they are not declared in the Measurable variable..