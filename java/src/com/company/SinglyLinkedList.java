package com.company;

public class SinglyLinkedList {

    private Node dummyHead;
    private int length;
    private static class Node{
        private int data;
        private int length;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return dummyHead == null;
    }

    public void push_back(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            dummyHead = newNode;
        }else{
            Node lastNode = dummyHead;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;

        }
        length++;
    }

    public void insertAfterNode(Node prevNode,int data){
        if (prevNode == null){
            System.out.println("preNode not in ll");
            return;
        }else{
            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    public void insertAtIndex(int index,int data){
        int count = 0;
//        int length = getLength();
//        if (index >= length){
//            System.out.println("index out of range");
//            return;
//        }
        Node prevNode = dummyHead;
        while(prevNode!=null && count < index){
            count++;
            prevNode = prevNode.next;
        }
        if (prevNode==null){
            System.out.println("index out of range");
            return;
        }
        Node newNode = new Node(data);
        if (prevNode.next == null){
            prevNode.next = newNode;
        }else{
            Node tempNode = prevNode.next;
            newNode.next = tempNode;
            prevNode.next = newNode;
        }
    }

    public void deleteFirstNode(){
        Node temp = dummyHead;
        dummyHead = dummyHead.next;
        temp.next = null;
    }

    public void deleteLastNode(){
        Node currentNode = dummyHead;
        Node prevNode = null;
        while(currentNode.next!=null){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = null;
    }

//    public void deleteAtIndex(int index){
//
//    }

    public Node find(int index){
        int count = 0;
        Node currentNode = dummyHead;
        while(currentNode!=null && count<index){
            count++;
            currentNode = currentNode.next;
        }
        if(currentNode==null){
            Node res = new Node(0);
            return res;
        }
        return currentNode;
    }

    public Node reverse(){
        Node currentNode = dummyHead;
        Node nextNode = null;
        Node prevNode = null;
        while(currentNode!=null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;

        }
        return prevNode;
    }
    public void printLinkedList(){
        if (isEmpty()){
            System.out.println("there is no ll to print");
        }else{
            Node currentNode = dummyHead;
            while(currentNode!=null){
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push_back(1);
        singlyLinkedList.push_back(2);
        singlyLinkedList.push_back(3);
        singlyLinkedList.insertAfterNode(singlyLinkedList.dummyHead.next,4);
        singlyLinkedList.insertAtIndex(3,5);
        singlyLinkedList.deleteFirstNode();
        singlyLinkedList.deleteLastNode();
        singlyLinkedList.printLinkedList();
        Node node = singlyLinkedList.find(2);
        System.out.printf("the node your want to find is %d\n",node.data);
        Node head = singlyLinkedList.reverse();
        System.out.println(head.next.data);


    }



}
