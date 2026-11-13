public class QueueMain {
    
    public static void main(String[] args) throws Exception {
        
        CustomQueue queue = new CustomQueue(5);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        
        queue.display();
        
        queue.remove();
        
        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        
        queue.display();
        
        queue.remove();
        
        queue.display();

        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.insert(17);
        
        queue.display();
        
        queue.remove();
        
        queue.display();
    }
    
}
