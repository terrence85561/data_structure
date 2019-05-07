package com.company;

public class HeapSort {

    private static void heapify(Comparable[] a){
        int size = a.length;
        for(int i=(size/2)-1; i>=0; i--){
            sink(a,i,size);
        }
    }

    private static void sink(Comparable[] a,int index,int size){
        while(2*index+1<=size-1){
            int larger_child = 2*index+1;
            if(larger_child<size && less(a[larger_child],a[larger_child+1])){
                larger_child++;
            }
            if(less(a[larger_child],a[index])){
                break;
            }
            swap(a,index,larger_child);
            index = larger_child;
        }
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
        heapify(a);
        int size = a.length;
        int idx = size - 1;
        while(idx>=0){
            swap(a,0,idx--);
            sink(a,0,size);
        }
        show(a);
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"T","G","S","H","R","I","P","E","N","A","O"};
        sort(arr);

    }
}
