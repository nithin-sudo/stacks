package com.bridgelabz.stacks;

public class Runner {
        /**
         * calling respective methods from main
         * @param args
         */
        public static void main(String[] args){
            MyStack <Integer>myStack = new MyStack<Integer>();
            myStack.push(70);
            myStack.push(30);
            myStack.push(56);
            myStack.show();
            MyStack <Integer>myStack1 = new MyStack<Integer>();
            myStack1.push(70);
            myStack1.push(30);
            myStack1.push(56);
            myStack1.pop();
            myStack1.show();
            myStack1.peek();
        }
}
