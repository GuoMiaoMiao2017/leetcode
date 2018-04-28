/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

//Definition for singly-linked list.

class Solution2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
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

    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int sign = 0;
        int total = 0;
        while (true) {
            //创建节点预备工作：算出和、进位
            if (l1 != null && l2 != null) {
                total = (l1.val + l2.val + sign) % 10;
                sign = (l1.val + l2.val + sign) / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                total = (l1.val + sign) % 10;
                sign = (l1.val + sign) / 10;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                total = (l2.val + sign) % 10;
                sign = (l2.val + sign) / 10;
                l2 = l2.next;
            } else {
                if (sign != 0) {
                    total = sign;
                    sign = 0;
                } else 
                    break;
            } 
            //创建对象
            ListNode newNode = new ListNode(total);
            //新增节点范式
            if (head == null) {
                head = newNode;
                current = newNode;
            }
            else {
                current.next = newNode;//先把newNode链接上去
                current = current.next;//current右移一位指向最新的
            }
            //收尾
        }
        return head;
    }
 
    public static void main(String args[]) {
        ListNode ln1 = new Solution2().intToListNode(243);
        ListNode ln2 = new Solution2().intToListNode(564);
        ListNode ln3 = new Solution2().addTwoNumbers(ln1, ln2);
        System.out.println(new Solution2().listNodeToInt(ln3));
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