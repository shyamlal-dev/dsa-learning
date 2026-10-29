public class Main {
    public static void main(String[] args) {
    
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
    }
}    
