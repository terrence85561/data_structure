package com.company;

import java.util.Arrays;

public class Queue<T> {
    private Node dummyHead = null;
    private Node currentNode = null;
    private Node pastNode = null;
    private int size = 0;
    private class Node{
        T data;
        Node next;
    }

    public boolean isEmpty(){
        return dummyHead==null;
    }

    public int getSize(){
        return size;
    }

    public void enQueue(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(isEmpty()){
            dummyHead = newNode;
        }else{
            currentNode = dummyHead;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            size++;
        }
    }

    public T deQueue(){
        T result = dummyHead.data;
        pastNode = dummyHead;
        dummyHead = dummyHead.next;
        pastNode = null;
        size--;
        return result;


    }

    public void printQueue(){
        Node temp = dummyHead;
        if (isEmpty()){
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.enQueue("1");
        queue.enQueue("2");
        queue.enQueue("3");
        queue.printQueue();
        queue.deQueue();
        queue.printQueue();
    }
}
