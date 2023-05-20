package week3.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Duplicate {

    public static List<Integer> removeDublicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();

        Collections.sort(list);

        if (list.size() > 0) {
            result.add(list.get(0));
        }

        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) != list.get(i - 1)) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(2, 2, 5, 5, 3, 3, 3, 3, 1, 1, 1, 1));
        List<Integer> noDublicatesList = removeDublicates(list);
        for (Integer i : noDublicatesList) {
            System.out.println(i);
        }
    }
}
