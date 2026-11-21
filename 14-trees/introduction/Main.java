public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
       
        tree.insert();

        System.out.println("\nTree Structure:");
        tree.display();

        System.out.println("Pre-Order traversal: ");
        tree.preOrder();
        
        System.out.println("In-Order traversal:");
        tree.inOrder();
        
        System.out.println("Post-Order traversal:");
        tree.postOrder();
    }
}
