package com.company;

public class LinkedStack<T> {
    // implement stack using linkedlist
    private Node dummyHead = null;
    private class Node{
        T data;
        Node next;
    }

    public boolean isEmpty(){
        return dummyHead == null;
    }

    public void push(T data){
        Node old_head = dummyHead;
        dummyHead = new Node();
        dummyHead.data = data;
        dummyHead.next = old_head;
    }

    public T pop(){
        T data = dummyHead.data;
        dummyHead = dummyHead.next;
        return data;
    }

    public void deleteList(){
        Node head = dummyHead;
        while(head!=null){
            Node temp = head;
            head = null;
            head = temp.next;
        }
        dummyHead = null;
    }

    public void printList(){
        if (isEmpty()){
            System.out.println("deleted");
        }
        Node currentNode = dummyHead;
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
