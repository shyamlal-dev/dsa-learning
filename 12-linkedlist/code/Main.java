public class Main {
    public static void main(String[] args) {
    
        LinkedList ll = new LinkedList();
    
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
    
        ll.display();
    
        ll.insert(15, 1);
        ll.display();
    
        ll.insert(5, 0);
        ll.display();
    
        ll.insert(40, 5);
        ll.display();
    }
}    
