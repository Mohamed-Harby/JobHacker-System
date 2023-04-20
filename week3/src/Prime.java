package week3.src;

import java.io.IOException;
import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n) {
        if (n == 0 || n == 1 || (n & 1) == 0) return false;
        if (n == 2) return true;
        for (int i = 3; i * i <= n; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n) == true) {
            System.out.println(n + "is a prime number!");
        }
        else {
            System.out.println(n + "is not a prime number!");
        }
    }
}