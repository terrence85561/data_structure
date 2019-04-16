package com.company;

import java.util.Arrays;

public class Queue<T> {
    private Node first = null;
    private Node last = null;
    private int size = 0;
    private class Node{
        T data;
        Node next;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void enQueue(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(isEmpty()){
            first = newNode;
            last = first;
        }else{
            last.next = newNode;
            last = newNode;
        }
        size++;

    }

    public T deQueue(){
        T result = first.data;
        Node temp = first;
        first = first.next;
        temp = null;
        if(isEmpty()){
            last = null;
        }
        size--;
        return result;


    }

    public void printQueue(){
        Node temp = first;
        if (isEmpty()){
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enQueue("1");
        queue.enQueue("2");
        queue.enQueue("3");
        queue.printQueue();
        queue.deQueue();
        queue.printQueue();
    }
}
