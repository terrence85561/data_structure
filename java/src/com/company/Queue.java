package com.company;

import java.util.Arrays;

public class Queue {
    private int[] queue;
    private int index = 0;

    public int[] getQueue(){
        return this.queue;
    }

    public Queue(){
        queue = new int[1];
    }

    public void push(int data){
        if(index==queue.length){
            resize(queue.length*2);
        }
        queue[index] = data;
        index++;
    }

    public void resize(int size){
        int[] newQueue = new int[size];
        for (int i = 0; i<index; i++){
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(Arrays.toString(queue.getQueue()));

    }
}
