/**
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
 */

import java.util.Arrays.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {  
        int num = nums1.length;
        for (int x = m; x < num; x++) {
            int y = x - m;
            nums1[x] = nums2[y++];
            
        }
        for (int i = 0; i < num - 1; i++) {
            for (int z = i + 1; z < num; z++) {
                if (nums1[i] > nums1[z]) {
                    int count = nums1[i];
                    nums1[i] = nums1[z];
                    nums1[z] = count;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        new Solution().merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}