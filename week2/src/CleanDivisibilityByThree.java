/*
 * I'm studying clean code in my college and I'm trying to apply it to my code.
 * If possible, give me some feedback.
 * I'm studying it in C++ and I'm trying to apply it to Java. so there could be mistakes in my code.
 * 
 */

import java.util.stream.IntStream;

public class CleanDivisibilityByThree {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RangeNumberGenerator(1, 100);
        Filter divisibilityByThreeFilter = new DivisibilityByThreeFilter();

        for (int number : numberGenerator.generate()) {
            if (divisibilityByThreeFilter.filter(number)) {
                System.out.println(number);
            }
        }
    }
}

interface NumberGenerator {
    int[] generate();
}

class RangeNumberGenerator implements NumberGenerator {
    private final int start;
    private final int end;

    public RangeNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int[] generate() {
        return IntStream.rangeClosed(start, end).toArray();
    }
}

interface Filter {
    boolean filter(int number);
}

class DivisibilityByThreeFilter implements Filter {
    @Override
    public boolean filter(int number) {
        return (number % 3 == 0);
    }
}