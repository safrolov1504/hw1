package com.company.trees;

public class BinarySearchTree <T extends Comparable<T>> {

    private Node root;

    //add items
    private Node addValueRecurs(Node current, T value){
        if(current == null){
            return new Node(value);
        }
        if(less(value,current.value)) {
            current.left = addValueRecurs(current.left,value);
        } else if(more(value,current.value)) {
            current.right = addValueRecurs(current.right,value);
        } else {
            return current;
        }
        return current;
    }

    public void addValue(T value){
        root = addValueRecurs(root,value);
    }

    //delete items
    private Node delValueRecurs(Node current, T value){
        if(current == null){
            return null;
        }
        if (value == current.value) {
            // Node to delete found
            //if there is no child
            if(current.right == null && current.left == null){
                current = null;
            }
            //if there is one child
            if (current.right == null){
                current = current.left;
            }
            if (current.left == null){
                current = current.right;
            }
            //it there are two children
            T smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = delValueRecurs(current.right, smallestValue);
            return current;

        }
        if (less(value,current.value)) {
            current.left = delValueRecurs(current.left, value);
            return current;
        }
        current.right = delValueRecurs(current.right, value);
        return current;
    }

    private T findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(T value) {
        root = delValueRecurs(root, value);
    }



    //search items
    private boolean searchValueRecur(Node current, T value){
        if(current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        return less(value,current.value) ? searchValueRecur(current.left,value):searchValueRecur(current.right,value);
    }

    public boolean searchValue(T value){
        return searchValueRecur(root,value);
    }

    //Compare
    private static boolean less(Comparable a, Comparable b){
        if(a == b){
            return false;
        }
        return a.compareTo(b) < 0;
    }

    private static boolean more(Comparable a, Comparable b){
        if(a == b){
            return false;
        }
        return a.compareTo(b) > 0;
    }

    //check balanced tree or not
    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node)
    {
        int lh; /* for height of left subtree */
        int rh; /* for height of right subtree */
        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }

    public int height(){
        return height(root);
    }

    private int height(Node node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of left
         height and right heights */
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private class Node{
        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
