/**
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0

¶ş·Ö²éÕÒ
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) 
            return nums.length;
        if (target <= nums[0])
            return 0;
        
        int start = 0;
        int end = length - 1;
        int mid = 0; 
        
        while(true) {
            mid = (start + end)/2;
            if (mid == start)
                return end;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                start = mid;
            else 
                end = mid;
        }
        
    }
} 