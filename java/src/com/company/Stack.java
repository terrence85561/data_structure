package com.company;

import java.util.Arrays;

public class Stack {

    private int[] stackArr;
    int index = 0;


    public Stack() {
        stackArr = new int[1];
    }
    public int[] getStack(){
        return this.stackArr;
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public void push(int data){
        if(index==stackArr.length){
            resize(stackArr.length*2);
        }
        stackArr[index] = data;
        index++;
    }

    public int pop(){
        index--;
        if(index>0 && index==stackArr.length/4){
            resize(stackArr.length/2);
        }
        int result = stackArr[index];

        return result;

    }

    public void resize(int size){
        int[] newArr = new int[size];
        for(int i=0; i<index; i++){
            newArr[i] = stackArr[i];
        }
        stackArr = newArr;

    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(Arrays.toString(stack.getStack()));
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(Arrays.toString(stack.getStack()));

    }
}
