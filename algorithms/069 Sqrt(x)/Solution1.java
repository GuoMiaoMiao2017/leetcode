/**
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
*/

class Solution1 {
    public int mySqrt(int x) {
        String s = new Double(Math.sqrt(x)).toString();
        int i =  s.lastIndexOf(".");
        return Integer.valueOf(s.substring(0, i));
    }
}