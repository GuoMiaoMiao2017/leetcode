/**
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stackList = new LinkedList<>();
        int n = s.length();
        if (n == 0) return true;
    
        for (int i = 0 ; i < n; i++) {
            Character newChar = s.charAt(i);
            if ( newChar == '{' || newChar == '[' || newChar == '(' ) 
                stackList.add(newChar);
            else if (newChar == '}' && stackList.size() > 0 && stackList.removeLast() == '{') 
                ;
            else if (newChar == ']' && stackList.size() > 0 && stackList.removeLast() == '[')
                ;
            else if (newChar == ')' && stackList.size() > 0 && stackList.removeLast() == '(')
                ;
            else 
                return false; 
        }
        if (stackList.size() > 0) 
            return false;
        return true;
    }

    public static void main(String[] args) {
        String string = "";
        System.out.println(new Solution().isValid(string));
    }
}