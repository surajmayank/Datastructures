package com.java.streamapi;

public class DoubleLinkedList {

    ListNode head;
    ListNode tail;
    int length;

    class ListNode{
        private int data;
        private ListNode next ,prev;
        public ListNode(int data){
            this.data=data;
        }
    }

    public DoubleLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }

    public void insertAtBeginning(int data){
        ListNode newNode =  new ListNode(data);
        if(isEmpty()){
            tail = newNode;
        }
        else{
        head.prev= newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }

    public void insertAtEnd(int data){
        ListNode newNode =  new ListNode(data);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next= newNode;
        }
        newNode.prev=tail;
        tail=newNode;
        length++;
    }

    public void insertAfter(ListNode prenode,int data){
        ListNode newNode =  new ListNode(data);
        newNode.next=prenode.next ;
        prenode.next=newNode;
        newNode.prev=prenode;
       if(newNode.next!=null){
          newNode.next.prev=newNode;
       }
        length++;
    }


    public void printlist(ListNode node)
    {
        ListNode last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String [] args){
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(6);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtEnd(5);

        linkedList.insertAfter(linkedList.head.next.next, 8);

        linkedList.printlist(linkedList.head);

    }
}
