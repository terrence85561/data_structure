package com.company;

import java.util.Random;

public class QuickSort {
    // java use tuned quicksort for primitive types. Since the performance will be the
    // first thing to consider when sorting primitive types.

    private static void shuffle(Comparable[] a){
        // need shuffle the array first to get better performance
        Random rand = new Random();
        for (int i = 1; i < a.length; i++){
            int j = rand.nextInt(i);
            swap(a,i,j);
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("Shuffled array shown above.");

    }

    private static int partition(Comparable[] a,int lo, int hi){
        // find the pivot that no smaller on its right and no larger entry on its left
        int pivot = lo;
        int i = pivot;
        int j = hi+1;
        while (true) {
            while(less(a[++i],a[pivot])){
                if(i==hi){
                    break;
                }
            }
            while(less(a[pivot],a[--j])){
                if(j==lo){
                    break;
                }
            }
            if(i>=j){
                swap(a,pivot,j);
                pivot = j;
                return pivot;
            }
            swap(a,j,i);
        }

    }

    private static void sort(Comparable[] a,int lo,int hi){
        if (hi <= lo){return;}

        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);

    }

    private static void swap(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean less(Comparable w, Comparable v){
        return w.compareTo(v)<0;
    }

    private static boolean isSort(Comparable[] a){
        for (int i = 1; i < a.length; i++){
            if(less(a[i],a[i-1])){
                return false;
            }
        }
        return true;
    }

    private static void show(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(Comparable[] a){
        shuffle(a);
        int size = a.length;
        sort(a,0,size-1);
        if(isSort(a)){
            show(a);
        }else{
            System.out.println("array unsorted.");
        }
    }



    public static void main(String[] args) {
        Integer[] input = new Integer[]{31, 18, 20, 17, 18, 36, 44, 35, 22, 14,19090,19090};
        sort(input);
    }

}
