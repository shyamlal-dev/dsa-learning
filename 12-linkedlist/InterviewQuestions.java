public class InterviewQuestions {  
    ListNode head;
    ListNode tail;

    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
    public boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(s == f) {
                return true;
            }
        }
        
        return false;
    }
    
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void removeDuplicates() {
        if(head == null) {
            return;
        }
        
        ListNode current = head;
        
        while(current.next != null) {
            if(current.val == current.next.val) {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        
        tail = current;
        tail.next = null;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    //approach 1:
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        ListNode node = new ListNode();
        ListNode head = ListNode;
        
        while(list1 != null && list2 != null) {
            if(list2.val > list1.val) {
                node.val = list1.val;
                node.next = new ListNode();
                node = node.next;
                list1 = list1.next;
            }else{
                node.val = list2.val;
                node.next = new ListNode();
                node = node.next;
                list2 = list2.next;
            }
        }

        if(list1 != null) {
            node.val = list1.val;
            node.next = list1.next;
        }
        if(list2 != null) {
            node.val = list2.val;
            node.next = list2.next;
        }
        return head;
    }
     //approach 2: (preferred)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if(size < 2) {
            return;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        
        while(current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    //reverse the LinkedList using recursion
    public void reverseRec() {
        if (head == null || head.next == null) {
            return;
        }
        reverseRec(head);
    }
    private void reverseRec(ListNode current) {
        if(current == tail) {
            head = current;
            return;
        }
        reverseRec(current.next);
        tail.next = current;
        tail = current;
        tail.next = null;
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(){ 
    }
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
