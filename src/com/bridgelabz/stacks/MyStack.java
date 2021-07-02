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
