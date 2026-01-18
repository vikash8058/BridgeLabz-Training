package com.listinterface;
import java.util.*;

public class RotateList {

    // method to rotate list by k positions
    public static List<Integer> rotate(List<Integer> list, int k) {

        int n = list.size();
        List<Integer> result = new ArrayList<>(Collections.nCopies(n, null));

        // adjusting k if greater than size
        k = k % n;

        // placing elements using given formula
        for (int i = 0; i < n; i++) {
            int idx = (i - k + n) % n;
            result.set(idx, list.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> rotated = rotate(list, 2);

        System.out.println(rotated);
    }
}
