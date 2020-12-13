package com.java.streamapi;

public class Stack {

    int top;
    int [] arr;
    int capacity;

    public Stack(int size){
        this.top=-1;
        arr = new int[size];
        capacity=size;
    }

    public void push(int elelement){
        if(isFull()){
            System.out.println("stack will overflow");
            System.exit(1);
        }
        arr[++top]=elelement;
    }
    public int  pop(){
        if(isEmpty()){
            System.out.println("stack will underflow");
            System.exit(1);
        }
        System.out.println("Removing"+peek());
        return arr[top--];
    }

    private int peek() {
        if(!isEmpty()){
           return arr[top];
        }
        else
            System.exit(-1);
        return -1;
    }

    private boolean isEmpty() {
        return size()==0;
    }
    private boolean isFull() {
        return size()==capacity;
    }
    private int size() {
        return top+1;
    }

    public static void main (String[] args)
    {
        Stack stack = new Stack(3);

        stack.push(1);        // Inserting 1 in the stack
        stack.push(2);        // Inserting 2 in the stack

        stack.pop();        // removing the top 2
        stack.pop();        // removing the top 1

        stack.push(3);        // Inserting 3 in the stack

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());

        stack.pop();        // removing the top 3

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}
