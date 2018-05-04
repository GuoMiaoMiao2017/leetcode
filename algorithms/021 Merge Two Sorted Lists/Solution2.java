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
            //创建对象
            // ListNode newNode = new ListNode(value);
            //新增节点范式
            if (head == null) {
                head = newNode;
                current = newNode;
            }
            else {
                current.next = newNode;//先把newNode链接上去
                current = current.next;//current右移一位指向最新的
            }
        }
        return head;
    }