package com.bridgelabz.stacks;

public class MyStack<T> {
    Node <T>head;
    /**
     *inserting node into the stack.
     * @param data
     */
    public <T>void push(T data)
    {
        Node newNode = new Node();
        newNode.data=data;
        newNode.next= head;
        head=newNode;
    }
    /**
     * Deleting the last inserted value first according to LIFO
     */
    public void pop()
    {
        if (head==null)
        {
            System.out.println("Stack is Empty");
        }
        else{
            Node tempNode = head;
            head = head.next;
            System.out.println("Popped element is :"+tempNode.data);


            }
    }
    /**
     * printing the top most element in the Stack
     */
    public void peek(){
        if(head==null){
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("The top most Element is " + head.data);
        }
    }
    /**
     * printing the elements in the stack.
     */
    public void show(){
        Node tempNode;
        tempNode=head;
        System.out.println("The elements in the list are :");
        while (tempNode.next!=null)
        {
            System.out.println(tempNode.data);
            tempNode=tempNode.next;
        }
        System.out.println(tempNode.data);
    }
}
