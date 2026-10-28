class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        size = 0;
    }
    
    public getSize(){
      return size;
    }
  
    public void addFirst(int value) {

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        // First node is both head and tail
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void addLast(int value) {

        // Empty list
        if (tail == null) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insert(int value, int index) {

        // Invalid index
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Size: " + size
            );
        }
  
        // Insert at beginning
        if (index == 0) {
            addFirst(value);
            return;
        }
  
        // Insert at end
        if (index == size) {
            addLast(value);
            return;
        }

        Node current = head;
    
        // Reach the node before the given index
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
    
        Node newNode = new Node(value);
    
        newNode.next = current.next;
        current.next = newNode;
      
        //Node newNode = new Node(value, current.next);
        //current.next = newNode;
    
        size++;
    }

    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("END");
    }
}

class Node {

    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
