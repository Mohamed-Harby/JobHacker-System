import java.io.IOException;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer number: ");
        int number = sc.nextInt();
        if ((number & 1) == 1) { // rightmost bit is 1 -> odd number
            System.out.println("You Entered an odd number!");
        } else {
            System.out.println("You Entered an even number!");
        }
    }

}
