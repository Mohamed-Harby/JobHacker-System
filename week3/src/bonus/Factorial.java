package week3.src.bonus;

public class Factorial {
    public static long getFactorialOf(int n) {
        if (n <= 2) {
            return (long) n;
        }
        return n * getFactorialOf(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(getFactorialOf(5));
    }
}
