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
    void preOrder(){preOrderRec(root);}

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.println("preOrder "+root.key);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("inorder "+root.key);
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
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
      //  bst.insert(5);
        bst.inOrder();
        bst.preOrder();
        bst.validation();

    }

    private void validation() {
        boolean check=getValidated(root,null,null);
        System.out.println(check);
    }

    private boolean getValidated(Node root, Integer min, Integer max) {
        if(root==null)
            return true;
        if((min!=null && root.key<=min)||(max!=null && root.key>=max))
            return false;

        return getValidated(root.left,min, root.key)&& getValidated(root.right, root.key,max);
    }
}
