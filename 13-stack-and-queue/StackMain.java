public class StackMain {
    
    public static void main(String[] args) throws StackException {
        
        CustomStack stack = new CustomStack(5);
        stack.push(14);
        stack.push(99);
        stack.push(21);
        stack.push(45);
        stack.push(6);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        CustomStack stack = new DynamicStack(5);
        stack.push(14);
        stack.push(99);
        stack.push(21);
        stack.push(45);
        stack.push(6);
        stack.push(18);
        stack.push(1);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
    
}
