package week6.src.task1;

import java.util.Date;

public class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        super("", false, new Date());
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(
                (semiPerimeter) *
                        (semiPerimeter - side1) *
                        (semiPerimeter - side2) *
                        (semiPerimeter - side3)
        );
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3;
    }
}
