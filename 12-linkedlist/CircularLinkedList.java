public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.value + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("HEAD ->");
    }
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is Empty!!!");
            return;
        }

        // Single-node list
        if (head == tail) {
            if (head.value == value) {
                head = null;
                tail = null;
            }
            return;
        }

        // Delete head
        if (head.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node current = head;

        do {
            Node nodeToDelete = current.next;

            if (nodeToDelete.value == value) {

                current.next = nodeToDelete.next;

                // Update tail if the last node is deleted
                if (nodeToDelete == tail) {
                    tail = current;
                }

                return;
            }

            current = current.next;

        } while (current != head);
    }

}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

}
