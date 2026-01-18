package com.setinterface;
import java.util.*;

public class CheckSetEquality {

    // method to check if two sets are equal
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {

        // checking size first
        if (set1.size() != set2.size()) {
            return false;
        }

        // checking if all elements are present
        return set1.containsAll(set2);
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        boolean result = areSetsEqual(set1, set2);

        System.out.println(result);
    }
}
