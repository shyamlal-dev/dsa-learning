import java.util.Scanner;

public class BinaryTree {
    
    private Node root;
    
    Scanner sc = new Scanner(System.in);
    
    public void insert() {
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();
        root = new Node(val);
        insert(root);
    }
    
    private void insert(Node node) {
        
        System.out.println("Do you want to enter the left of " + node.val + " ? (true/false): ");
        boolean hasLeft = sc.nextBoolean();
        
        if(hasLeft) {
            System.out.println("enter the value of the left of " + node.val);
            int val = sc.nextInt();
            
            node.left = new Node(val);
            insert(node.left);
        }
        
        System.out.println("Do you want to enter the right of " + node.val + " ? (true/false): ");
        boolean hasRight = sc.nextBoolean();
        
        if(hasRight) {
            System.out.println("enter the value of the right of " + node.val);
            int val = sc.nextInt();
            
            node.right = new Node(val);
            insert(node.right);
        }
        
    }
    
    public void display() {
        display(root, "");
    }
    
    private void display(Node node, String indent) {
        
        if(node == null) {
            return;
        }
        
        System.out.println(indent + node.val);
        
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    
    private static class Node {
        int val;
        Node left;
        Node right;
    
        public Node(int val) {
            this.val = val;
        }
    }
}
