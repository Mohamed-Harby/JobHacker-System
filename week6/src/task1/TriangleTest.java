package week6.src.task1;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        System.out.print("Enter the triangle color: ");
        String colorName = sc.next();

        System.out.print("is the triangle filled with the color? (true or false) ");
        boolean filled = sc.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColorName(colorName);
        triangle.setFilled(filled);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColorName());
        System.out.println("Filled: " + triangle.isFilled());

        sc.close();
    }
}
