package com.java.test;

public class SingleLinkedList {
    Node head;
    Node tail;
    int length;
    public SingleLinkedList(){
        Node head=null;
        Node tail=null;
        this.length=0;
    }
    private class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
       return  length==0;
    }
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            newNode.next=head;
        }
        head=newNode;
        length++;
    }
    public void deleteNode(int position){
        Node current=head;
        if(position>length){
            System.out.println("invalid");
        }
        else{
            int counter = 1;
            while((position-1)!=counter){
                current=current.next;
                counter++;
            }
            current.next=current.next.next;
        }
    }
    public void display(){
        Node current = head;
        if(head==null){
            System.out.println("invalid input");
        }
        else{

            while(current!=null){
                System.out.println("value "+current.data);
                current=current.next;
            }
        }
    }
    public static void main(String args[]){
        SingleLinkedList list = new SingleLinkedList();
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.insertAtFirst(8);
        list.display();
        list.deleteNode(7);
        System.out.println("after delete");
        list.display();

    }

}
