public class Q3BST {
    public static void main(String[] args) {
        // Create nodes
        Node n5 = new Node(5, null, null);   // Leaf node
        Node n15 = new Node(15, null, null); // Leaf node
        Node n10 = new Node(10, n5, n15);    // Node 10: connects 5 (left) and 15 (right)
        Node n30 = new Node(30, null, null); // Leaf node
        Node root = new Node(20, n10, n30);  // Root connects 10 (left) and 30 (right)

        // Printing structure
        System.out.println("Root: " + root);
    }
}

