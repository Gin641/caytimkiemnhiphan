public class Test {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Gin");
        tree.insert("Mon");
        System.out.println("Inorder (sorted): ");
        tree.inOrder();
        System.out.println("The number of nodes is: " + tree.getsize());
    }
}
