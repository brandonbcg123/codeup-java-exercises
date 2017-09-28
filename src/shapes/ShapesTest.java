package shapes;

public class ShapesTest {
    public static void main(String[] args) {
       Rectangle box1 = new Rectangle(4, 5);
        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter());
        System.out.println("The area of the rectangle is: " + box1.getArea());
        Rectangle box2 = new Square(6);
        System.out.println("The perimeter of the square is: " + box2.getPerimeter());
        System.out.println("The area of the square is: " + box2.getArea());
        showRectangleInfo(box1);
        showRectangleInfo(box2);
       }

    public static void showRectangleInfo (Rectangle rectangle) {
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }

    }
//    ** Bonus **
//
//            1. Inside of `ShapesTest`, create a static method named `showRectangleInfo`
//        that accepts an object of type `Rectangle` and displays the rectangle's
//        area and perimeter.
//
//
// answer:
// Can you pass an object of type `Square` to this method?
//yes because it is inherited from the rectangle class because I made the class square extended from the rectangle class.