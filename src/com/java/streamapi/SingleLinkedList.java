package com.java.streamapi;

import java.util.LinkedList;

public class SingleLinkedList {
    ListNode head;
    ListNode tail;
    int length;

    public SingleLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    class ListNode{
        int data;
        ListNode next;
        public ListNode(int data ){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }

    public void insert(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
        length++;
    }

    public void insertAtFirst(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public void display() {
        //Node current will point to head
        ListNode current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        SingleLinkedList ll = new SingleLinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insertAtFirst(7);
        ll.insertAtPosition(3,56);
        ll.display();
    }

    public void insertAtPosition(int position,int data) {
        ListNode newNode = new ListNode(data);
        if(position>length){
            System.out.println("not valid position");
        }
        int counter=1;
        ListNode current = head;
        while(counter!=position){
            current.next=head;
            counter++;
        }

        LinkedList list = new LinkedList();
        newNode.next=current.next;
        current.next=newNode;
    }

}
