import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class JavaSyntax {
    public static void main(String[] args) {
        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);

        String myString = "Hi, my name is Brandon.";
        System.out.println(myString);

//        String myString = 'B';
//        System.out.println(myString);
//        This causes an error

//        String myString = '3.14159';
//        System.out.println(myString);
//          This causes an error

//        long myNumber;
//        System.out.println(myNumber);
//        a compiling error occured

//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        A compling error occured;

//        long myNumber = 123L;
//        System.out.println(myNumber);
//        This works prints out 123;

//        long myNumber = 123;
//        System.out.println(myNumber);
////        This works prints out 123;
//        This works because its a not a decimal unlike 3.14
//
//        float myNumber = 3.14;
//        System.out.println(myNumber);
        //An error occurs
//        This can be fixed by adding an f after 3.14 or changing the   float to a double
////
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        prints out 5 on one line and than 6 on the next line

        int x = 5;
        System.out.println(++x);
        System.out.println(x);
//        prints out 6 on one line and 6 on the next line

        //The difference between the two code block outputs is a result of the first codeblock (x++) is not incrementing until after it is first printed out while the second codeblock (++x) is incrementing the x before it prints it out.

//        String class;
//        //it's a reserved word by the Java language so it will not work, as it may not be used as an identifier

//        int x = 4;
//        x = x + 5;
        int x = 4;
        x += 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

        int x = 3;
        int y = 4;
        y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
    }
}