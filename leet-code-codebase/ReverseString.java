/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

class Solution {
    public void reverseString(char[] s) {
        
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        
        // Swap characters from both ends
        while (leftIndex < rightIndex) {
            
            char temporaryCharacter = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temporaryCharacter;
            
            leftIndex++;
            rightIndex--;
        }
    }
}
