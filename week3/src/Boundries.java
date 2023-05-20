package week3.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boundries {

    public static Integer getMin(List<Integer> list) {
        if (list.size() == 0)
            return -1;
        int result = list.get(0);
        for (Integer i : list) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    public static Integer getMax(List<Integer> list) {
        if (list.size() == 0)
            return -1;
        int result = list.get(0);
        for (Integer i : list) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("min vlue is: " + getMin(list));
        System.out.println("max vlue is: " + getMax(list));
    }
}
