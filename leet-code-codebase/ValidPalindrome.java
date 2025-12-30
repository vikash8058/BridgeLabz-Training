/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

*/

class Solution {
    public boolean isPalindrome(String s) {
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        
        // Compare original and reversed strings
        return cleanedString.equals(reversedString);
    }
}
