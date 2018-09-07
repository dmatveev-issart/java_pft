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

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + " !");
    }

}