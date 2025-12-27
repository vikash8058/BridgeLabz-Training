/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //pointer for last index of nums1 original elements
        int index1 = m - 1;
        
        //pointer for last index of nums2
        int index2 = n - 1;
        
        //pointer for last index of nums1 total length
        int mergeIndex = m + n - 1;
        
        //merge arrays from the end
        while(index1 >= 0 && index2 >= 0) {
            
            //place the larger element at the end
            if(nums1[index1] > nums2[index2]) {
                nums1[mergeIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergeIndex] = nums2[index2];
                index2--;
            }
            
            mergeIndex--;
        }
        
        //copy remaining elements of nums2 if any
        while(index2 >= 0) {
            nums1[mergeIndex] = nums2[index2];
            index2--;
            mergeIndex--;
        }
        
        //no need to copy nums1 remaining elements
        //they are already in correct position
    }
}
