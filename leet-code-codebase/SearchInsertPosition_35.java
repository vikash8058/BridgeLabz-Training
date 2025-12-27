/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        //define start and end pointers
        int start = 0;
        int end = nums.length - 1;
        
        //apply binary search
        while(start <= end) {
            
            //find middle index
            int mid = start + (end - start) / 2;
            
            //if target is found at mid
            if(nums[mid] == target) {
                return mid;
            }
            //if target is smaller than mid element
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            //if target is greater than mid element
            else {
                start = mid + 1;
            }
        }
        
        //start gives the correct insert position
        return start;
    }
}
