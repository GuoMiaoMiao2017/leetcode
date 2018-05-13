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

class Solution1 {
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        StringBuilder string = new StringBuilder();
        int i = m > n?m-n:n-m;
        for (int j = 0; j < i; j++) {
            string = string.append("0");
        }
        
        if (m > n) {
            b = string.toString() + b;
        } else {
            a = string.toString() + a;
        }
        int max = m > n?m:n;
        StringBuilder value = new StringBuilder();
        String asub = "";
        String bsub = "";
        int sign = 0;
        for ( ; max >= 0; max--) {
            asub = a.substring(max, max+1);
            bsub = b.substring(max, max+1);
            if (asub.equals("0") && bsub.equals("0")) {
                value = value.append(String.valueOf(sign));
                sign = 0;
            } 
            if (Integer.valueOf(asub) + Integer.valueOf(bsub) == 1) {
                if (sign == 0) {
                    value = value.append("1");
                    sign = 0;
                } else {
                    value = value.append("0");
                    sign = 1;
                }
            }
            if (asub.equals("1") && bsub.equals("1")) {
                if (sign == 0) {
                    value = value.append("0");
                } else {
                    value = value.append("1");
                }
                sign = 1;
            }      
        }
        if (sign == 1)
            value = value.append("1");
        return value.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("11","1"));
    }
}