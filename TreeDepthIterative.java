import java.util.*;

public class TreeDepthIterative {

    private static class Node {
        int val;
        Node leftChild, rightChild;

        Node(int val) {
            this.val = val;
        }
    }

    public static int calculateHeight(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int height = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                if (current != null) {
                    if (current.leftChild != null) queue.offer(current.leftChild);
                    if (current.rightChild != null) queue.offer(current.rightChild);
                }
            }
            height++;
        }

        return height;
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.leftChild = new Node(2);
        rootNode.rightChild = new Node(3);
        rootNode.leftChild.leftChild = new Node(4);
        rootNode.leftChild.rightChild = new Node(5);

        int treeHeight = calculateHeight(rootNode);
        System.out.println("Tree height (iterative): " + treeHeight);
    }
}
