class TestCase {
    Rectangle rectangle;
    public TestCase(double width, double height) {
        rectangle = new Rectangle(width, height);
    }
    public void testResult() {
        System.out.printf("Rectangle:\nWidth: %f \nHeight: %f \nArea: %f \nPerimeter: %f \n",
                rectangle.getWidth(), rectangle.getHeight(),
                rectangle.getArea(), rectangle.getPerimeter()
        );
    }
}
public class RectangleTest {
    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(4, 40);
        TestCase testCase2 = new TestCase(3.5, 35.9);
        testCase1.testResult();
        testCase2.testResult();
    }
}