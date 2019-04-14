package com.company;

public class Stack {

    private int[] stackArr;

    public Stack() {
        stackArr = new int[1];
    }

    public void resizeArr(int size){
        int[] newArr = new int[size];
        for (int i = 0; i < stackArr.length;i++){
            newArr[i] = stackArr[i];
        }

    }
}
