public class MergeSort {
    public Node sortList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        
        return merge(left, right);
    }
    
    public Node merge(Node h1, Node h2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while(h1 != null && h2 != null) {
            if(h1.value <= h2.value) {
                tail.next = h1;
                h1 = h1.next;
            } else {
                tail.next = h2;
                h2 = h2.next;
            }
            tail = tail.next;
        }
        tail.next = (h1 != null) ? h1 : h2;
        
        return dummyHead.next;
    }
    
    public Node getMid(Node head) {
        Node prevMid = null;
        while(head != null && head.next != null) {
            prevMid = (prevMid == null) ? head : prevMid.next;
            head = head.next.next;
        }
        Node mid = prevMid.next;
        prevMid.next = null;
        
        return mid;
    }
}

class Node {
    int value;
    Node next;
    
    public Node() {
        
    }
    
    public Node(int value) {
        this.value = value;
    }
    
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
