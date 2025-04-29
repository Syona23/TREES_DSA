package TREES;

import java.util.*;

public class nodeSearch {

    static class Node {
        int value;
        Node leftChild, rightChild;

        Node(int val) {
            value = val;
            leftChild = null;
            rightChild = null;
        }
    }

    public static boolean findValue(Node root, int target) {
        if (root == null) return false;
        if (root.value == target) return true;

        return findValue(root.leftChild, target) || findValue(root.rightChild, target);
    }

    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.leftChild = new Node(2);
        rootNode.rightChild = new Node(3);
        rootNode.leftChild.leftChild = new Node(4);
        rootNode.leftChild.rightChild = new Node(5);

        int toFind = 4;
        System.out.println("Is " + toFind + " in the tree? " + findValue(rootNode, toFind));
    }
}
