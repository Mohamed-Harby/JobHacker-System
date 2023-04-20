// package week3.src;

import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            System.out.println(n);
            return;
        }
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        while (n >= a + b) {
            System.out.println(a + b);
            int temp = a;
            a = b;
            b = temp + b;
        }

    }

    public static void main(String[] args) {
        fibonacciSeries(20);
    }
}