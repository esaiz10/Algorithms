public class Q4 {
    record Node(int value, Node left, Node right) {}

    // Pre-order Traversal: Root → Left → Right
    public static void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // In-order Traversal: Left → Root → Right
    public static void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    // Post-order Traversal: Left → Right → Root
    public static void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        // Constructing the BST:
        Node n5 = new Node(5, null, null);
        Node n15 = new Node(15, null, null);
        Node n10 = new Node(10, n5, n15);
        Node n30 = new Node(30, null, null);
        Node root = new Node(20, n10, n30);

        System.out.print("Pre-order Traversal: ");
        preOrderTraversal(root);
        System.out.println();

        System.out.print("In-order Traversal: ");
        inOrderTraversal(root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        postOrderTraversal(root);
        System.out.println();
    }

}
