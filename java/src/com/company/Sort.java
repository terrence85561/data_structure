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

    public static void insertionSort(Comparable[] a){
        int size = a.length;
        for(int i=1; i<size; i++){
            for(int j=i; j>0 && less(a[j],a[j-1]); j--){
                swap(a,j,j-1);
            }
        }
    }

    public static void shellSort(Comparable[] a){
        int size = a .length;
        int h = 1; //using Knuth
        while(h<size/3){
            h = 3*h+1;
        }
        while(h>=1){
            for(int i = h;i<size;i++){
                for(int j = i; j>=h && less(a[j],a[j-h]);j-=h){
                    swap(a,j,j-h);
                }
            }
            h = h/3;
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
        shellSort(input);
        if(isSorted(input)){
            show(input);
        }else{
            System.out.println("is not sorted");
        }

    }


}
