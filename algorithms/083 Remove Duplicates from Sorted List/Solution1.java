/**
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 class Solution {
   public ListNode deleteDuplicates(ListNode head) {
        ListNode headNode = head;
        ListNode currentNode = head;
        if (headNode != null) {
            if (headNode.next != null) {
                while (currentNode.next != null) {
                    if (pugeequals(currentNode, currentNode.next)) {
                        currentNode = currentNode.next;
                    } else {
                        ListNode listNode = currentNode.next;
                        currentNode.next = listNode.next;
                        listNode.next = null;
                    }
                }
                
            } else 
                return headNode;
        } else 
            return null;
        return headNode;
    }

    public boolean pugeequals(ListNode l1, ListNode l2) {
        if (l1.val == l2.val)
            return false;
        else 
            return true;
    }
}