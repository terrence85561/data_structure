package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class Stack implements Iterable {

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




    @Override
    public Iterator iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator{
        private int i = index;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Integer next() {
            return stackArr[--i];
        }
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
        Iterator<Integer> i = stack.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println(Arrays.toString(stack.getStack()));

    }
}
