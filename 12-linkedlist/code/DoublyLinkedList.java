public class DoublyLinkedList {

    Node head;

    public void display() {
        Node current = head;
        Node last = null;
        while (current != null) {
            System.out.print(current.value + " -> ");
            last = current;
            current = current.next;
        }
        System.out.println("STOP");
        
        System.out.println("print in reverse: ");
        
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
    
        newNode.next = head;
    
        if (head != null) {
            head.prev = newNode;
        }
    
        head = newNode;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
            return;
        }
    
        Node current = head;
    
        while (current.next != null) {
            current = current.next;
        }
    
        Node newNode = new Node(value);
        current.next = newNode;
        newNode.prev = current;
    }
    
    public Node find(int value){
        Node current = head;
        while(current != null) {
            if(current.value == value){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    public void insertAfter(int targetValue, int value) {
        Node current = find(targetValue);
    
        if (current == null) {
            throw new IllegalArgumentException(
                "Value not found: " + targetValue
            );
        }
    
        Node newNode = new Node(value);
    
        newNode.next = current.next;
        newNode.prev = current;
    
        if (current.next != null) {
            current.next.prev = newNode;
        }
    
        current.next = newNode;
    }
}

class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
