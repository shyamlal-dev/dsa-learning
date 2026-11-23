public class AVL {
    
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;
        
        public Node(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }
    
    private Node root;
    
    public AVL() {
        
    }
    
    public int height() {
        return height(root);
    }
    
    private int height(Node node) {
        if(node == null) {
            return -1;
        }
        
        return node.height;
    }
    
    public boolean isEmpty() {
        /*if(root == null) {
            return true;
        }
        return false;*/
        
        return root == null;
    }
    
    public void insert(int value) {
        root = insert(value, root);
    }
    
    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        
        if(value < node.value) {
            node.left = insert(value, node.left);
        }
        
        if(value > node.value) {
            node.right = insert(value, node.right);
        }
        
        node.height = Math.max(height(node.left), height(node.right) + 1);
        
        return rotate(node);
    }
    
    private Node rotate(Node node) {
        
        //Left heavy
        if(height(node.left) - height(node.right) > 1) {
            
            //left-left case
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            
            //left right case
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        
        //Right heavy
        if(height(node.left) - height(node.right) < -1 {
            
            //right-right case
            if(height(node.right.right) - height(node.right.left) > 0) {
                return leftRotate(node);
            }
            
            //right-left case
            if(height(node.right.right) - height(node.right.left) < 0) {
                node.right = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        
        return node;
    }
    
    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        
        c.right = p;
        p.left = t;
        
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        
        return c;
    }
    
    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        
        p.left = c;
        c.right = t;
        
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        
        return p;
    }
    
    public void populate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
    
    public void populateSorted(int[] arr) {
        populateSorted(arr, 0, arr.length);
    }
    
    private void populateSorted(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        
        int mid = (start + end) /2;
        
        insert(arr[mid]);
        
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }
    
    public boolean isBalanced() {
        return isBalanced(root);
    }
    
    private boolean isBalanced(Node node) {
        if(node == null) {
            return true;
        }
        
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
    
    public void display() {
        display(root, "root node: ");
    }
    
    private void display(Node node, String details) {
        if(node == null) {
            return;
        }
        System.out.println(details + node.value);
        
        display(node.left, " left child of " + node.value + " : ");
        display(node.right, " right child of " + node.value + " : ");
    }
}
