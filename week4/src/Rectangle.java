public class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle () {
        this.width = this.height = 1;
    }

    public void setWidth(double value) {
        this.width = value;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double value) {
        this.height = value;
    }

    public double getHeight() {
        return this.height;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2.0 * (this.width + this.height);
    }
}