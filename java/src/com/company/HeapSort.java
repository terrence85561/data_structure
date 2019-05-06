package com.company;

public class HeapSort {

    private static void heapify(Comparable[] a){
        int size = a.length;
        for(int i=(size/2)-1; i>=1; i--){
            sink(a,i);
        }
    }

    private static void sink(Comparable[] a,int index){

    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    private static void show(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    private static boolean isSort(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

    private static void swap(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(Comparable[] a){

    }
}
