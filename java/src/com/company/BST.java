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

    }

    public Value get(Key key){

    }

    public void delete(Key key){

    }

    public Iterable<Key> iterator(){
        
    }
}
