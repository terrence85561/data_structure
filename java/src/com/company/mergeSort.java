package com.company;

public class mergeSort {

    private static void merge(Comparable[] a,Comparable[] aux,int lo,int mid,int hi){
        for(int i = lo; i<=hi; i++){
            aux[i] = a[i];
        }
        int aux_k = lo;
        int aux_j = mid+1;
        for(int i = lo; i<=hi; i++){
            if(aux_k > mid){
                a[i] = aux[aux_j];
                aux_j++;
            }
            else if(aux_j > hi){
                a[i] = aux[aux_k];
                aux_k++;
            }
            else if(less(aux[aux_j],aux[aux_k])){
                a[i] = aux[aux_j];
                aux_j++;
            }
            else{
                a[i] = aux[aux_k];
                aux_k++;
            }
        }
    }

    private static void sort(Comparable[] a,Comparable[] aux,int lo,int hi){
        if(hi<=lo){
            return;
        }
        int mid = lo + (hi - lo)/2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }

    private static void show(Comparable[] a){
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] input = new Integer[]{31, 18, 20, 17, 18, 36, 44, 35, 22, 14,19090,19090};
        sort(input);
        show(input);
    }
}
