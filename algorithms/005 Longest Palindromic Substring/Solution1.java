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
        String jieguo = "";
        String value = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                value = s.substring(i, j + 1);
                if (isPalindrome(s, i, j)) {
                    jieguo = value.length() > jieguo.length()?value:jieguo;
                }
            }
        }
        return jieguo;
    }

    //判断一个字符串s从start到end这个子串是不是回文数

    public boolean isPalindrome(String s, int start, int end) {
        if (end - start == 1 && (new Character(s.charAt(start))).equals(new Character(s.charAt(end))))
            return true;
        if (start > end)
            return false;
        if (start == end)
            return true;

        if (!(new Character(s.charAt(start))).equals(new Character(s.charAt(end))))
            return false;
        else
            return isPalindrome(s, start+1, end-1);
    }
    //magic判断一个字符串s从start到end这个子串是不是回文数
    // public boolean magic(String s, int start, int end) {
        
    // }

    // public boolean isSure(String string) {
    //     int n = string.length();
    //     for (int i = 0; i < (n+1)/2; i++) {
    //         if (!new Character(string.charAt(i)).equals(new Character(string.charAt(n-1-i))))  {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        String string = "cbbd";
        System.out.println("string1 = " + new Solution().longestPalindrome(string));
    }
}
