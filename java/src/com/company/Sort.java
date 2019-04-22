package com.company;

public class Sort {

    public static void selectionSort(Comparable[] a){
        int size = a.length;
        for(int i=0; i<size; i++){
            int minIdx = i;
            for(int j=minIdx+1;j<size;j++){
                if(less(a[j],a[minIdx])){
                    minIdx = j;
                }
            }
            swap(a,i,minIdx);
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void swap(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void show(Comparable[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1; i<a.length;i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Integer[] input = new Integer[]{31, 18, 20, 17, 18, 36, 44, 35, 22, 14};
        selectionSort(input);
        if(isSorted(input)){
            show(input);
        }else{
            System.out.println("is not sorted");
        }

    }


}
