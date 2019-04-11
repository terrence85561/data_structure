package com.company;

public class SinglyLinkedList {

    private ListNode head; // head node to hold whole linkedlist


    private static class ListNode{
        private int data;
        private ListNode next;

        // constructor
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // create linked list
        // 10 --> 8 --> 1 --> 11 --> null
        // 10 as head node of linked list

        ListNode head = new ListNode(10);

    }
}
