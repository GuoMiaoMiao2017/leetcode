/** 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
import java.util.*;

class Solution {
    public static void main(String args[]) {
        int[] nums = new int[]{0, 2, 7, 4};
        int target = 9;
        int[] index = new Solution().twoSum(nums, target);
        System.out.println(index[0] + "," + index[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.get(value) != null && map.get(value) != i) {
                index[0] = i;
                index[1] = map.get(value);
                return index;
            }
        }
        return null;
    }
}