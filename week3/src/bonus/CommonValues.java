package week3.src.bonus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import week3.src.Duplicate;

public class CommonValues {

    public static List<Integer> getCommon(List<Integer> A, List<Integer> B) {
        List<Integer> ListA = Duplicate.removeDublicates(A);
        List<Integer> ListB = Duplicate.removeDublicates(B);

        Map<Integer, Integer> frequency = new HashMap<>();

        for (Integer v : ListA) {
            if (frequency.get(v) == null) {
                frequency.put(v, 1);
            } else {
                frequency.put(v, frequency.get(v) + 1);
            }
        }
        for (Integer v : ListB) {
            if (frequency.get(v) == null) {
                frequency.put(v, 1);
            } else {
                frequency.put(v, frequency.get(v) + 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> v : frequency.entrySet()) {
            if (v.getValue() == 2) {
                result.add(v.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6, 7, 7));
        List<Integer> b = new ArrayList<>(Arrays.asList(9, 9, 2, 3, 3, 3, 3, 3, 7));

        List<Integer> common = getCommon(a, b);
        for (Integer v : common) {
            System.out.println(v);
        }

    }
}
