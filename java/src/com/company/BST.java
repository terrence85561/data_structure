package com.company;

public class BST <Key extends Comparable<Key>, Value> {
    private Node root;


    private class Node{
        private Key key;
        private Value value;
        private Node left,right;
        private int N;
        public Node(Key key, Value value, int N){
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    public int size(){return size(root);}
    private int size(Node x){
        if(x==null) return 0;
        else        return x.N;
    }

    public Value get(Key key){
        return get(root, key);
    }

    private Value get(Node x, Key key){
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp > 0){
            return get(x.right, key);
        } else if (cmp < 0) {
            return get(x.left, key);
        } else {
            return x.value;
        }
    }

    public void put(Key key, Value val){
        root = put(root, key ,val);
    }

    private Node put(Node x, Key key, Value val){
        if(x == null) return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            x.left = put(x.left, key, val);
        } else if(cmp > 0){
            x.right = put(x.right, key, val);
        } else{
            x.value = val;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Key min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x.left == null) return x;
        return min(x.left);
    }

    public Key max(){
        return max(root).key;
    }

    private Node max(Node x){
        if(x.right == null) return x;
        return max(x.right);
    }

    public Key floor(Key key){
        /*
            Case 1 : if a given key is less than the key at the root of BST, then the floor
            of key must be in the left subtree.
            Case 2 : If key is greater than the key at the root, then the floor of key could
            be in the right subtree, but only if there is a key smaller than or equal to key
            in the right subtree.
            Case 3: if not, or if key is equal to the key at the root, then the key at the root
            is the floor of key.
         */
        Node x = floor(root, key);
        if(x == null) return null;
        return x.key;
    }

    private Node floor(Node x, Key key){
        if(x==null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp==0) return x;
        if(cmp < 0){
            return floor(x.left, key);
        }
        Node right = floor(x.right, key);
        if(right!=null){
            return right;
        }else{
            return x;
        }

    }

    public Key ceiling(Key key){
        Node x = ceiling(root, key);
        if(x == null) return null;
        return x.key;
    }

    private Node ceiling(Node x, Key key){
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp==0) return x;
        if(cmp > 0){
            return ceiling(x.right, key);
        }
        Node left = ceiling(x.left, key);
        if(left!=null){
            return left;
        }else{
            return x;
        }
    }


}
