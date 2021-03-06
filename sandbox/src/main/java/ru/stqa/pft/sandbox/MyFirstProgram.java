package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("Alexei");

        Square s = new Square(5);
        System.out.println("The area of the square with the side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("The area of the rectangle with the side a = " + r.a + " and b = " + r.b + " is " + r.area());


        // Points calculating:
        Point p1 = new Point(4,6);
        Point p2 = new Point(7,12);

        // Using the function:
        System.out.println("Function: the distance between point 1, with the coordinates x = " + p1.x + " , y = " + p1.y
                + " and point 2, with the coordinates x = " + p2.x + " , y = " + p2.y + " is " + distance(p1, p2));

        // Using the method:
        System.out.println("Method: the distance between point 1, with the coordinates x = " + p1.x + " , y = " + p1.y
                + " and point 2, with the coordinates x = " + p2.x + " , y = " + p2.y + " is " + p1.distance(p2));

        // One more example of using the method:
        p1.x = 3.5;
        p1.y = 7.7;
        p2.x = 9.5;
        p2.y = 2.6;
        System.out.println("Example: the distance between point 1, with the coordinates x = " + p1.x + " , y = " + p1.y
                + " and point 2, with the coordinates x = " + p2.x + " , y = " + p2.y + " is " + p1.distance(p2));
    }

    // The function:
    public static double distance(Point p1, Point p2) {
        return (Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)));
    }


    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + " !");
    }

}