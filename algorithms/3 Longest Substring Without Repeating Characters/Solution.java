/**
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int num = 1;
        int i = 0;
        int j = 0;
        for (i = 0; i < s.length() - 1; i++) {
            num = 1;            
            for (j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                     System.out.println("num = " + num + s.charAt(i) + s.charAt(j));
                    break;
                } else {
                    num++;
                    list.add(num);
                    // for (int k = i + 1; k < j ; k++) {
                    //     if (s.charAt(j) == s.charAt(k)) {
                    //         break;
                    //     } else {
                    //         continue;
                    //     }
                    // }
                    System.out.println("&&&&&&&&&&&num = " + num + s.charAt(i) + s.charAt(j));
                }
            }
        }
        for (int n : list) {
            num = list.get(n) > list.get(n + 1) ? list.get(n):list.get(n + 1);
            System.out.println("#########num = " + num + s.charAt(i) + s.charAt(j));
            System.out.println(list.get(n));
        }
        return num;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int num = new Solution().lengthOfLongestSubstring(s);
        System.out.println("num = " + num);
    }
}