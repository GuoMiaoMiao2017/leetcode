/**
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

不对的结果
*/

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb = sb.append(digits[i]);
        }
        String value = String.valueOf(Double.valueOf(sb.toString()) + 1);
        value = value.substring(0, value.indexOf("."));
        System.out.println("value = " + value);
        int[] jieguo = new int[value.length()];
        for (int j = 0; j < value.length(); j++) {
            jieguo[j] = Integer.valueOf(value.substring(j,j+1));
        }
        return jieguo;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] value = new Solution().plusOne(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("value[" + i + "] = " + value[i]);
        }
    }
}