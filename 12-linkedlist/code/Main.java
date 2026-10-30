public class Main {
    public static void main(String[] args) {

        //Singly LinkedList
        LinkedList ll = new LinkedList();
        
        System.out.println("Size: " + ll.getSize());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.display();
        System.out.println("Size: " + ll.getSize());
        ll.addFirst(3);
        ll.display();
        System.out.println("Size: " + ll.getSize());
        ll.addLast(4);
        ll.display();
        System.out.println("Size: " + ll.getSize());
        ll.insert(5, 2);
        ll.display();
        System.out.println("Size: " + ll.getSize());
        System.out.println("Deleted first: " + ll.deleteFirst());
        ll.display();
        System.out.println("Size: " + ll.getSize());
        System.out.println("Deleted last: " + ll.deleteLast());
        ll.display();
        System.out.println("Size: " + ll.getSize());
        ll.delete(1);
        ll.display();
        System.out.println("Size: " + ll.getSize());

        //Doubly LinkedList
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.display();
        dll.addFirst(11);
        dll.display();
        dll.addFirst(12);
        dll.display();
        dll.addLast(13);
        dll.display();
        dll.addLast(16);
        dll.display();
        dll.insert(13, 14);
        dll.display();
        dll.insert(16, 17);
        dll.display();
    }
}    
