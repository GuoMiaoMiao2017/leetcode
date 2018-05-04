/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

//Definition for singly-linked list.

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode intToListNode(int i) {
        ListNode first = null;
        ListNode last = null;
        if (i == 0) {
            first = new ListNode(0);
            last = first;
        } else {
            while (i > 0) {
                int x = i % 10;
                if (first == null) {
                    first = new ListNode(x);
                    last = first;
                } else {
                    last.next = new ListNode(x);
                    last = last.next;
                } 
                i = i / 10;
            }
        }
        return first;
    }

    public int listNodeToInt(ListNode first) {
        int value = 0;
        int index = 0;
        int num = 0;
        if (first == null) {
            System.out.println("empty");
        } else {
            ListNode cur = first;
            while (cur != null) {
                index = cur.val;
                cur = cur.next;
                index = (int)Math.pow(10, num++) * index;
                value = value + index;
            }
        }
        return value;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        int value = listNodeToInt(l1) + listNodeToInt(l2);
        return listNode = intToListNode(value);
    }

    public static void main(String args[]) {
        ListNode ln1 = new Solution().intToListNode(9);
        ListNode ln2 = new Solution().intToListNode(9999999991);
        ListNode ln3 = new Solution().addTwoNumbers(ln1, ln2);
        System.out.println(new Solution().listNodeToInt(ln3));
    }
}


 // l = new Node()
            // if (head == null) {
            //     head = l;
            //     current = l;
            // }
            // else {
            //     current.next = l;
            //     current = current.next;
            // }