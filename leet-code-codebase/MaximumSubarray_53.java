/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

*/

class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentSubarraySum = nums[0];
        int maximumSubarraySum = nums[0];
        
        // Traverse the array starting from index 1
        for (int index = 1; index < nums.length; index++) {
            
            // Decide whether to extend the previous subarray
            // or start a new subarray from current element
            currentSubarraySum = Math.max(nums[index], currentSubarraySum + nums[index]);
            
            // Update the maximum subarray sum found so far
            maximumSubarraySum = Math.max(maximumSubarraySum, currentSubarraySum);
        }
        
        return maximumSubarraySum;
    }
}
