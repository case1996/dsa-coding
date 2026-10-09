package org.dsa.Tree;

public class BST {

    private Node root;
    public Node getRoot() {
        return root;
    }
   public class Node {

        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if (temp.value == value) return false;
            if (temp.value < value){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            if (temp.value > value){
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    public void printTree() {

    }
}
