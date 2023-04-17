import java.io.IOException;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) throws IOException {
        int WeightOfA = 2;
        int WeightOfB = 3;
        int WeightOfC = 5;

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double MEDIA = (A * WeightOfA + B * WeightOfB + C * WeightOfC)
                /
                (WeightOfA + WeightOfB + WeightOfC);
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
