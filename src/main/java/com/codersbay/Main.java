package com.codersbay;

public class Main {

    public static void main(String[] args) throws StackTooSmallException {

        GenericStack<Integer> integerGenericStack = new GenericStack<>();
        GenericStack<String> stringGenericStack = new GenericStack<>();
        GenericStack<Boolean> booleanGenericStack = new GenericStack<>();

        System.out.println(integerGenericStack.push(1) + " was added.");
        System.out.println(integerGenericStack.push(8) + " was added.");
        System.out.println(integerGenericStack.push(21) + " was added.");
        System.out.println(integerGenericStack.push(45) + " was added.");
        System.out.println();
        System.out.println(integerGenericStack.pop() + " was removed");
        System.out.println(integerGenericStack.pop() + " was removed");
        System.out.println(integerGenericStack.peek() + " is the current uppermost element");
        System.out.println(integerGenericStack.length() + " is the current length");
        System.out.println("------------------------");
        System.out.println();
        System.out.println(stringGenericStack.push("Word") + " was added.");
        System.out.println(stringGenericStack.push("Excel") + " was added.");
        System.out.println(stringGenericStack.push("Access") + " was added.");
        System.out.println(stringGenericStack.push("Publisher") + " was added.");
        System.out.println();
        System.out.println(stringGenericStack.length() + " is the current length");
        System.out.println(stringGenericStack.pop() + " was removed");
        System.out.println(stringGenericStack.pop() + " was removed");
        System.out.println(stringGenericStack.peek() + " is the current uppermost element");
        System.out.println(stringGenericStack.pop() + " was removed");
        System.out.println(stringGenericStack.pop() + " was removed");
        System.out.println(stringGenericStack.length() + " is the current length");
        System.out.println(stringGenericStack.pop() + " was removed");
        System.out.println("------------------------");
        System.out.println();
        System.out.println(booleanGenericStack.push(true) + " was added.");
        System.out.println(booleanGenericStack.push(false) + " was added.");
        System.out.println(booleanGenericStack.push(true) + " was added.");
        System.out.println(booleanGenericStack.push(false) + " was added.");
        System.out.println();
        System.out.println(booleanGenericStack.peek() + " is the current uppermost element");
        System.out.println(booleanGenericStack.pop() + " was added.");
        System.out.println(booleanGenericStack.push(true) + " was removed.");

    }

}
