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

    //Traversal methods in Binary Tree : pre-order(N-L-R), in-order(L-N-R) and post-order(L-R-N)
    //1.Pre-Order(Node-Left-Right)
    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    System.out.println();
    
    //2.In-Order(Left-Node-Right)
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    System.out.println();
    
    //3.Post-Order(Left-Right-Node)
    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val);
    }
    System.out.println();
    
    private static class Node {
        int val;
        Node left;
        Node right;
    
        public Node(int val) {
            this.val = val;
        }
    }
}
