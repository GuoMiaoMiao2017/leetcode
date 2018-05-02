import java.util.*;
class Solution {
    public LinkedList<Integer> linkedList = new LinkedList<Integer>();
    public int lengthOfLongestSubstring(String s) {
        String str = s;
        linkedList = this.isContains(s);
        int max = 0;
        for (int i : linkedList) {
            if (i > max) {
                max = i;
            }
        }
        if (str.length() == 1) {
            max = 1;
        }
        return max;
    }

    public LinkedList<Integer> isContains(String s) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        String newString = "";
        int head = 0;
        int size = 0;
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                System.out.println("i = " + i);
                System.out.println("s.length() = " + s.length());
                if (newString.contains(s.substring(i, i + 1))) {
                    head = s.indexOf(s.substring(i, i + 1))  + 1;
                    s = s.substring(head, s.length());
                    linkedList = this.isContains(s);  
                    System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnewString = " + newString.toString());
                    System.out.println("@@@@@@@@@@@@@@@@@@@size = " + size);
                     System.out.println("iiiiiiiiiiiiiiiiiiiiiiiii = " + i);
                     break;
                } else {
                    size++;
                    newString = newString.concat(s.substring(i, i + 1));
                    System.out.println("newString = " + newString.toString());
                    System.out.println("#######################size = " + size);
                }
            }
        } 
        
        linkedList.add(size);
        return linkedList;
    }
    public static void main(String[] args) {
        String s = "abcabcdd";
        int max = new Solution().lengthOfLongestSubstring(s);
        System.out.println("max = " + max);
    }
}