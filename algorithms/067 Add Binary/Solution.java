/**
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/

class Solution {
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        String string = "";
        int i = m > n?m-n:n-m;
        for (int j = 0; j < i; j++) {
            string = string + "0";
        }
        
        if (m > n) {
            b = string + b;
        } else {
            a = string + a;
        }
        System.out.println("a = " + a + "    b = " + b);
        int max = m > n?m:n;
        String value = "";
        String asub = "";
        String bsub = "";
        int sign = 0;
        for ( ; max >= 0; max--) {
            asub = a.substring(max, max+1);
            bsub = b.substring(max, max+1);
            if (asub.equals("0") && bsub.equals("0")) {
                value = String.valueOf(sign) + value;
                sign = 0;
            } 
            if (Integer.valueOf(asub) + Integer.valueOf(bsub) == 1) {
                if (sign == 0) {
                    value = "1" + value;
                    sign = 0;
                } else {
                    value = "0" + value;
                    sign = 1;
                }
            }
            if (asub.equals("1") && bsub.equals("1")) {
                if (sign == 0) {
                    value = "0" + value;
                    
                } else {
                    value = "1" + value;
                }
                sign = 1;
            }      
        }
        if (sign == 1)
            value = "1" + value;
        return value;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11","1"));
    }
}