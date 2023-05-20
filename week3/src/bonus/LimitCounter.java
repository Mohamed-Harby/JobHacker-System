
package week3.src.bonus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LimitCounter {

    public static int getAboveThreshold(List<Integer> list, Integer threshold) {
        int cnt = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) > threshold)
                ++cnt;
        }
        return cnt;
    }

    public static void main(String[] Args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 3, 2, 1));
        System.out.println(getAboveThreshold(list, 4));
    }

}
