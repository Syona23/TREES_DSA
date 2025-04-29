import java.util.*;

public class treeMaximum {

    static class Node {
        int val;
        Node leftChild, rightChild;

        Node(int val) {
            this.val = val;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public static int getMaxValue(Node node) {
        if (node == null) return Integer.MIN_VALUE;

        int leftMax = getMaxValue(node.leftChild);
        int rightMax = getMaxValue(node.rightChild);

        return Math.max(node.val, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.leftChild = new Node(2);
        rootNode.rightChild = new Node(3);
        rootNode.leftChild.leftChild = new Node(4);
        rootNode.leftChild.rightChild = new Node(5);

        int max = getMaxValue(rootNode);
        System.out.println("Maximum value in the tree: " + max);
    }
}

