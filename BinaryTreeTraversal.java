import java.util.*;

public class BinaryTreeTraversal {

    static class Node {
        int val;
        Node leftChild, rightChild;

        Node(int val) {
            this.val = val;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static void traversePostOrder(Node node) {
        if (node == null) return;
        traversePostOrder(node.leftChild);
        traversePostOrder(node.rightChild);
        System.out.print(node.val + " ");
    }

    public static void traverseInOrder(Node node) {
        if (node == null) return;
        traverseInOrder(node.leftChild);
        System.out.print(node.val + " ");
        traverseInOrder(node.rightChild);
    }

    public static void traversePreOrder(Node node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);
    }

    public static void traverseLevelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.val + " ");
            if (current.leftChild != null) queue.offer(current.leftChild);
            if (current.rightChild != null) queue.offer(current.rightChild);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.leftChild = new Node(20);
        root.rightChild = new Node(30);

        System.out.println("Post-order:");
        traversePostOrder(root);
        System.out.println();

        System.out.println("In-order:");
        traverseInOrder(root);
        System.out.println();

        System.out.println("Pre-order:");
        traversePreOrder(root);
        System.out.println();

        System.out.println("Level-order:");
        traverseLevelOrder(root);
    }
}

