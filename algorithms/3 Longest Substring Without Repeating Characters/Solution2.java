import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0;
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) 
                i = Math.max(map.get(s.charAt(j)), i);
            max = Math.max(max, j + 1 - i);
            map.put(s.charAt(j), j + 1);
        } 
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcdd";
        int max = new Solution().lengthOfLongestSubstring(s);
        System.out.println("max = " + max);
    }
}