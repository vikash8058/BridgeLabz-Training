/*
3099. Harshad Number
Solved
Easy
Topics
premium lock icon
Companies
Hint
An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.

 

Example 1:

Input: x = 18

Output: 9

Explanation:

The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.
*/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        int originalNumber = x;
        int digitSum = 0;
        
        // Calculate sum of digits
        while (x > 0) {
            digitSum += x % 10;
            x = x / 10;
        }
        
        // Check Harshad number condition
        if (originalNumber % digitSum == 0) {
            return digitSum;
        }
        
        return -1;
    }
}



