package com.company;


public class HeapPriorityQueue<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N = 0;

    public HeapPriorityQueue(){
        pq = (Key[])new Comparable[1];
    }

    public boolean isEmpty(){
        return pq.length == 0;
    }

    public int size(){
        return pq.length;
    }

    public void insert(Key k){
        N++;
        if(N==pq.length){
            resize(N*2);
        }
        pq[N] = k;
        swim(N);
    }

    public Key delMax(){
        Key max_key = pq[1];
        swap(pq,1,N);
        pq[N] = null;
        N--;
        sink(1);
        return max_key;
    }

    public void showPQ(){
        for(Key k:pq){
            if(k!=null){System.out.println(k);}
        }
    }

    private void resize(int new_size){
        Key[] newArr = (Key[])new Comparable[new_size];
        for(int i=0; i<pq.length; i++){
            newArr[i] = pq[i];
        }
        pq = newArr;
    }

    private boolean less(Comparable w,Comparable v){
        return w.compareTo(v)<0;
    }

    private void swap(Key[] a,int i,int j){
        Key temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void swim(int index){
        while(index>1 && less(pq[index/2],pq[index])){
            swap(pq,index/2,index);
            index = index/2;
        }
    }

    private void sink(int index){
        while(pq[2*index]!=null){
            int larger_child = 2*index;
            if(larger_child<N && less(pq[larger_child],pq[larger_child+1])){
                larger_child = larger_child + 1;
            }
            if(less(pq[larger_child],pq[index])){
                break;
            }
            swap(pq,index,larger_child);
            index = larger_child;
        }
    }

    public static void main(String[] args) {
        HeapPriorityQueue<String> pq = new HeapPriorityQueue<>();
        String[] arr = new String[]{"T","G","S","H","R","I","P","E","N","A","O"};
        for(String i:arr){
            pq.insert(i);
        }
        pq.showPQ();
        String max = pq.delMax();
        System.out.printf("The max is %s \n",max);
        pq.showPQ();

    }
}


