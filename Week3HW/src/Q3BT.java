public class Q3BT {
    public static void main(String[] args) {
        // Create nodes
        Node n5 = new Node(5, null, null);
        Node n4 = new Node(4, null, null);
        Node n3 = new Node(3, n4, n5);
        Node n2 = new Node(2, null, null);
        Node root = new Node(1, n2, n3);

        // Printing structure (just for verification)
        System.out.println("Root: " + root);
    }
}
