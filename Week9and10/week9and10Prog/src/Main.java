public class Main {
    public static void main(String[] args) {

        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();

        Position<Integer> root = tree.addRoot(1);
        Position<Integer> left = tree.addLeft(root, 2);
        Position<Integer> right = tree.addRight(root, 3);
        Position<Integer> leftLeft = tree.addLeft(left, 4);
        Position<Integer> leftRight = tree.addRight(left, 5);

        // Test preorderNext
        System.out.println("Testing preorderNext:");
        System.out.println("Next after 1 (root): " + tree.preorderNext(root).getElement());
        System.out.println("Next after 2 (left): " + tree.preorderNext(left).getElement());

        // Test inorderNext
        System.out.println("\nTesting inorderNext:");
        System.out.println("Next after 4 (left-left): " + tree.inorderNext(leftLeft).getElement());
        System.out.println("Next after 2 (left): " + tree.inorderNext(left).getElement());

        // Test postorderNext
        System.out.println("\nTesting postorderNext:");
        System.out.println("Next after 4 (left-left): " + tree.postorderNext(leftLeft).getElement());
        System.out.println("Next after 5 (left-right): " + tree.postorderNext(leftRight).getElement());

        // Answering the question about worst-case running times
        System.out.println("\nWorst-case running times for each algorithm:");
        System.out.println("preorderNext: O(h), where h is the height of the tree.");
        System.out.println("inorderNext: O(h), where h is the height of the tree.");
        System.out.println("postorderNext: O(h), where h is the height of the tree.");

        // Perform non-recursive inorder traversal
        System.out.println("\nNon-recursive inorder traversal result:");
        System.out.println(tree.inorderTraversal());
    }
}
