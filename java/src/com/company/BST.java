package com.company;

public class BST <Key extends Comparable<Key>, Value> {
    private Node root;


    private class Node{
        private Key key;
        private Value value;
        private Node left,right;
        public Node(Key key, Value value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(Key key, Value value){
        root = put(root, key, value);
    }

    public Value get(Key key){
        Node current = root;
        while(current!=null) {
            if (key.compareTo(current.key) > 0) {
                current = current.right;
            }
            else if(key.compareTo(current.key) < 0){
                current = current.left;
            }
            else{
                return current.value;
            }
        }
        return null;
    }

    public void delete(Key key){

    }

    public Iterable<Key> iterator(){

    }

    private Node put(Node node, Key key, Value value){
        if(node == null){
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if(cmp < 0){
            node.left = put(node.left, key, value);
        }
        else if (cmp > 0){
            node.right = put(node.right, key, value);
        }
        else{
            node.value = value;
        }
        return node;
    }
}
