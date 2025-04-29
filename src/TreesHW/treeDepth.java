import java.util.*;

public class treeDepth {

    static class Node {
        int val;
        Node leftChild, rightChild;

        Node(int val) {
            this.val = val;
            leftChild = null;
            rightChild = null;
        }
    }

    public static int calculateHeight(Node node) {
        if (node == null) return 0;

        int leftSubtree = calculateHeight(node.leftChild);
        int rightSubtree = calculateHeight(node.rightChild);

        return Math.max(leftSubtree, rightSubtree) + 1;
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.leftChild = new Node(2);
        rootNode.rightChild = new Node(3);
        rootNode.leftChild.leftChild = new Node(4);
        rootNode.leftChild.rightChild = new Node(5);

        int treeHeight = calculateHeight(rootNode);
        System.out.println("The tree's height is: " + treeHeight);
    }
}

