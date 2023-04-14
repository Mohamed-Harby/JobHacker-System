import java.io.IOException;
import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) throws IOException {
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double A = pi * R * R;
        System.out.printf("A=%.4f\n", A);
    }
}
