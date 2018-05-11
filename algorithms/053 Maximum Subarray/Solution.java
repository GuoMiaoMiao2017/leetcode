/**
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

 class Solution {
    public int maxSubArray(int[] nums) {
        int total = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                total = total > this.plus(nums, i, j+1)?total:this.plus(nums, i, j+1);
            }
        }
        return total;
    }

    public int plus(int[] nums, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            total = total + nums[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution().maxSubArray(nums));
    }
}
