/**
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */


 class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = palindrome(s, i, i);
            int len2 = palindrome(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int palindrome(String s, int start, int end) {
        while(start >= 0 && end < s.length() && (new Character(s.charAt(start))).equals(new Character(s.charAt(end)))) {
            start--;
            end++;
        }
        return end - start - 1;
    }

    public static void main(String[] args) {
        String string = "cbbd";
        System.out.println("string1 = " + new Solution().longestPalindrome(string));
    }
 }