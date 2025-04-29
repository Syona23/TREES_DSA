public class LeafCounter {

    // Node is defined as a private static inner class
    private static class Node {
        int val;
        Node leftChild, rightChild;

        Node(int val) {
            this.val = val;
        }
    }

    // Static method to count leaf nodes
    public static int getLeafCount(Node root) {
        if (root == null) return 0;
        if (root.leftChild == null && root.rightChild == null) return 1;

        return getLeafCount(root.leftChild) + getLeafCount(root.rightChild);
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.leftChild = new Node(2);
        rootNode.rightChild = new Node(3);
        rootNode.leftChild.leftChild = new Node(4);
        rootNode.leftChild.rightChild = new Node(5);

        int leafCount = getLeafCount(rootNode);
        System.out.println("Total leaf nodes: " + leafCount);
    }
}

