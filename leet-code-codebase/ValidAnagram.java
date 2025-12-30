/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true
*/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();
        
        // Sort both character arrays
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        
        // Compare both arrays
        return Arrays.equals(firstArray, secondArray);
    }
}
