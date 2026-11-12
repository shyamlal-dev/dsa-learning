import java.util.*;

public class InBuiltExample {
    
    public static void main(String[] args) {
        //Stack Example
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(21);
        stack.push(31);
        stack.push(1);
        stack.push(91);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        
        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(11);
        queue.add(12);
        queue.add(18);
        queue.add(16);
        queue.add(10);
        
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        
        //Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(11);
        deque.addLast(12);
        //System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        
    }
}
