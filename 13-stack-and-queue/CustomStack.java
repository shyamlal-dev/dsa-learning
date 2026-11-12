
public class CustomStack {
    
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;
    
    int pointer = -1;
    
    CustomStack() {
        this(DEFAULT_SIZE);
    }
    
    CustomStack(int size) {
        this.data = new int[size];
    }
    
    public boolean push(int item) {
        if(isFull()) {
            System.out.println("stack is full!!");
            return false;
        }
        
        pointer++;
        data[pointer] = item;
        
        return true;
    }
    
    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("can not pop from an empty stack");
        }
      
        //int removed = data[ptr];
        //ptr--;
        //return removed;
        
        return data[pointer--];
    }
    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("can not peek from an empty stack");
        }
        
        return data[pointer];
    }
    
    private boolean isFull() {
        return pointer == data.length - 1;
    }
    
    private boolean isEmpty() {
        return pointer == -1;
    }
}
