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
        if(index == stackArr.length){
            resizeArr(stackArr.length*2);
        }
        stackArr[index] = data;
        index++;
    }


    public int pop(){
        index--;
        int result = stackArr[index];
        stackArr[index] = 0;
        if(index>0 && index == stackArr.length/4){
            resizeArr(stackArr.length/2);
        }
        return result;
    }


    public void resizeArr(int size){
        int[] newArr = new int[size];
        for (int i = 0; i < stackArr.length;i++){
            newArr[i] = stackArr[i];
        }
        stackArr = newArr;

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        int data = stack.pop();
        System.out.println(Arrays.toString(stack.getStack()));

    }
}
