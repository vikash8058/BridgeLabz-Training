/*
3658. GCD of Odd and Even Sums
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

sumOdd: the sum of the first n odd numbers.

sumEven: the sum of the first n even numbers.

Return the GCD of sumOdd and sumEven.

 

Example 1:

Input: n = 4

Output: 4

Explanation:

Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.
*/


class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        // Based on mathematical observation,
        // GCD(sum of first n odd numbers, sum of first n even numbers) = n
        return n;
    }
}
