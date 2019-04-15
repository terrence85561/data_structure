package com.company;

public class LinkedStack<T> {
    // implement stack using linkedlist
    private Node first = null;
    private int size = 0;
    private class Node{
        T data;
        Node next;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(T data){
        Node old_first = first;
        first = new Node();
        first.data = data;
        first.next = old_first;
        size++;
    }

    public T pop(){
        T data = first.data;
        first = first.next;
        return data;
    }

    public void deleteList(){
        Node head = first;
        while(head!=null){
            Node temp = head;
            head = null;
            head = temp.next;
        }
        first = null;
    }

    public void printList(){
        if (isEmpty()){
            System.out.println("deleted");
        }
        Node currentNode = first;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedStack <Integer> linkedStack = new LinkedStack<Integer>();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        linkedStack.printList();
        int first = linkedStack.pop();
        System.out.println("first item is "+first);
        linkedStack.deleteList();
        linkedStack.printList();

    }
}
