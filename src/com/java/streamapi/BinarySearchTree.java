package com.java.streamapi;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }
    public Node insert(int key) {
        root = insertRec(root, key);
        return root;
    }

    private Node insertRec(Node root, int key) {

        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inOrder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public static  void main(String [] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(20);
        bst.insert(50);
        bst.insert(5);

        bst.inOrder();

    }
}
