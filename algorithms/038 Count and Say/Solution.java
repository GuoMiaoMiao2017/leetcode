/**
The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
*/
import java.util.*;

class Solution {
    public String countAndSay(int n) {
        String oldString = "1";
        for (int i = 1; i < n; i++) {

            oldString = count(oldString);
        }
        return oldString;
    }

    public String count(String oldString) {
        List<String> list = new ArrayList<>();
        String newString = "";
        String strList = "";
        list.add(oldString.substring(0,1));

        //这里oldString是1112331 

        for (int i = 1; i < oldString.length(); i++) {
            //每次来一个字符先判断下和上一个字符是否相等，相等append到当前最新节点，不相等list新开辟一个node 
            if (oldString.charAt(i) == oldString.charAt(i - 1)) {
                strList = list.get(list.size()-1);
                strList = strList.concat(oldString.substring(i,i+1));
                list.set(list.size()-1, strList);
            } else 
                list.add(oldString.substring(i,i+1));
        }

        //这里list是{111,2,33,1}

        for (int i = 0; i < list.size(); i++) {
            newString = newString.concat(String.valueOf(list.get(i).length())).concat(list.get(i).substring(0,1));
           
            // newString = newString.concat(list.get(i));
        }

        //这里newString是31122311
        
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(4));
    }
}