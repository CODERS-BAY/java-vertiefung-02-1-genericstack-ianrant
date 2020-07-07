package com.codersbay;

public class Main {

    public static void main(String[] args) throws StackTooSmallException {

        MyStack<Integer> integerMyStack = new MyStack<>();
        MyStack<String> stringMyStack = new MyStack<>();
        MyStack<Boolean> booleanMyStack = new MyStack<>();

        System.out.println(integerMyStack.push(1) + " was added.");
        System.out.println(integerMyStack.push(8) + " was added.");
        System.out.println(integerMyStack.push(21) + " was added.");
        System.out.println(integerMyStack.push(45) + " was added.");
        System.out.println();
        System.out.println(integerMyStack.pop() + " was removed");
        System.out.println(integerMyStack.pop() + " was removed");
        System.out.println(integerMyStack.peek() + " is the current uppermost element");
        System.out.println(integerMyStack.length() + " is the current length");
        System.out.println("------------------------");
        System.out.println();
        System.out.println(stringMyStack.push("Word") + " was added.");
        System.out.println(stringMyStack.push("Excel") + " was added.");
        System.out.println(stringMyStack.push("Access") + " was added.");
        System.out.println(stringMyStack.push("Publisher") + " was added.");
        System.out.println();
        System.out.println(stringMyStack.length() + " is the current length");
        System.out.println(stringMyStack.pop() + " was removed");
        System.out.println(stringMyStack.pop() + " was removed");
        System.out.println(stringMyStack.peek() + " is the current uppermost element");
        System.out.println(stringMyStack.pop() + " was removed");
        System.out.println(stringMyStack.pop() + " was removed");
        System.out.println(stringMyStack.length() + " is the current length");
        System.out.println(stringMyStack.pop() + " was removed");
        System.out.println("------------------------");
        System.out.println();
        System.out.println(booleanMyStack.push(true) + " was added.");
        System.out.println(booleanMyStack.push(false) + " was added.");
        System.out.println(booleanMyStack.push(true) + " was added.");
        System.out.println(booleanMyStack.push(false) + " was added.");
        System.out.println();
        System.out.println(booleanMyStack.peek() + " is the current uppermost element");
        System.out.println(booleanMyStack.pop() + " was added.");
        System.out.println(booleanMyStack.push(true) + " was removed.");

    }

}
