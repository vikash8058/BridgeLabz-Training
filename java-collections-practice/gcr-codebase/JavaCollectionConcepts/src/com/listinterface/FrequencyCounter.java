package com.listinterface;
import java.util.*;

public class FrequencyCounter {

    // method to count frequency of each element
    public static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        // traversing the list
        for (String item : list) {

            // updating count in map
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = countFrequency(list);

        System.out.println(result);
    }
}
