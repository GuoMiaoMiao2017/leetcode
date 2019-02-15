/**
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 */

class Solution {
    public String convert(String s, int numRows) {
        int count = 2*(numRows-1);
        String[] arr = new String[s.length()/count == 0? s.length()/count: s.length()/count + 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if (index + count > s.length()) {
                arr[i] = s.substring(index);
            } else {
                arr[i] = s.substring(index,(index = index + count));
            }
        }

        // String newString = "";
        // for (int i = 0; i < arr.length; i++) {
        //     newString += arr[i].substring(0,1);
        //     arr[i] = arr[i].substring(1);
        // }
        // int z = count - 1;
        // for (int x = 0; x < count-1; x++) {     
        //     newString.concat(arr[x].substring(x,x+1)).concat(arr[x].substring(z-1,z));
        //     z--;
        // }
        // int m = (count-1)/2;
        // for (int a = 0; a < arr.length; a++) {
        //     newString.concat(arr[a].substring(m, m+1));
        // }
        return arr;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String oldString = new Solution().convert(s, 4);
        System.out.println("oldString = " + oldString);
    //     // for (int i = 0; i < oldString.length; i++) {
    //     //     System.out.println("i = " + i + "   oldString =  " + oldString[i]);
    //     // }
    // }
}