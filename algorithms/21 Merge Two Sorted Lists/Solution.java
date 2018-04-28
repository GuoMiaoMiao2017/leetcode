/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

//�����ڵ�Ԥ������
//...
//�����½ڵ�
ListNode newNode = new ListNode();


//�����ڵ㷶ʽ����ʱcurrentָ��������ڵ������µĽڵ�
if (head == null) {
    head = newNode;
    current = newNode;
}
else {
    current.next = newNode;//�Ȱ�newNode������ȥ
    current = current.next;//current����һλָ�����µ�
}

 */
class Solution {

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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int value = 0;
        while (true) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {   
                    value = l1.val;
                    l1 = l1.next;
                } else {
                    value = l2.val;
                    l2 = l2.next;
                }
            } else if (l1 != null && l2 == null) {
                value = l1.val;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                value = l2.val;
                l2 = l2.next;
            } else {
                break;
            }
            //��������
            ListNode newNode = new ListNode(value);
            //�����ڵ㷶ʽ
            if (head == null) {
                head = newNode;
                current = newNode;
            }
            else {
                current.next = newNode;//�Ȱ�newNode������ȥ
                current = current.next;//current����һλָ�����µ�
            }
        }
        return head;
    }

    public static void main(String args[]) {
        ListNode ln1 = new Solution().intToListNode(321);
        ListNode ln2 = new Solution().intToListNode(542);
        ListNode ln3 = new Solution().mergeTwoLists(ln1, ln2);
        System.out.println(new Solution().listNodeToInt(ln3));
    }
}