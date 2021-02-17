package com.java.test;

public class Stack {
    int top;
    int[] arr;
    int capacity;

    public Stack(int size) {
        this.top = -1;
        arr = new int[size];
        this.capacity = size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private int size() {
        return top + 1;
    }

    public boolean isFull() {
        return capacity == size();
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Overflow");
            System.exit(1);
        }
        arr[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            System.exit(1);
        }
        System.out.println("Removing value " + peek());
       return arr[top--];
    }

    private int peek() {
        if(isEmpty()){
            System.out.println("no value to remove");
            System.exit(1);
        }
        return arr[top];
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
