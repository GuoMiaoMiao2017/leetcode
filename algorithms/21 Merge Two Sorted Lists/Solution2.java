public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        ListNode newNode = null;
        while (true) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {   
                    newNode = l1;
                    l1 = l1.next;
                } else {
                    newNode = l2;
                    l2 = l2.next;
                }
            } else if (l1 != null && l2 == null) {
                newNode = l1;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                newNode = l2;
                l2 = l2.next;
            } else {
                break;
            }
            //��������
            // ListNode newNode = new ListNode(value);
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