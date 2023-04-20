package week3.src.bonus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderCheck {

    public static boolean ascendinglySorted(List<Integer> list) {
        boolean isSorted = true;
        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) < list.get(i - 1)) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 7, 9, 4, 5));
        System.out.println("list1 is sorted? " + ascendinglySorted(list1));
        System.out.println("list2 is sorted? " + ascendinglySorted(list2));
    }
}
