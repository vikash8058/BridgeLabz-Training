/*
204. Count Primes
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given an integer n, return the number of prime numbers that are strictly less than n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:
*/

class Solution {
    public int countPrimes(int n) {
        
        // No prime numbers less than 2
        if (n <= 2) {
            return 0;
        }
        
        boolean[] isPrime = new boolean[n];
        
        // Assume all numbers are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Mark non-prime numbers
        for (int number = 2; number * number < n; number++) {
            if (isPrime[number]) {
                for (int multiple = number * number; multiple < n; multiple += number) {
                    isPrime[multiple] = false;
                }
            }
        }
        
        // Count prime numbers
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }
        
        return primeCount;
    }
}
