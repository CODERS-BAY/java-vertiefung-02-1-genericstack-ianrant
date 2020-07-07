package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyStackTest {

    @Test
    @DisplayName("Assert that a stack throws an exception when stack has been emptied and pop is run")
    public void testForExceptionThrownOnTooManyPops() {
        MyStack<String> stringStack = new MyStack<>();
        stringStack.push("Test #1");
        stringStack.push("Test #2");
        stringStack.push("Test #3");

        // Why does try/catch work in this case but adding to the method declaration does not?
        try {
            stringStack.pop();
            stringStack.pop();
            stringStack.pop();
            stringStack.pop();
        } catch (StackTooSmallException exception) {
            exception.printStackTrace();
        }

        assertThrows(StackTooSmallException.class, () -> {
            stringStack.pop();
        });
    }

    @Test
    @DisplayName("Assert that a newly intialized stack throws an exception when pop is run")
    public void testForExceptionThrownOnEmptyStack() {
        MyStack<Integer> integerStack = new MyStack<>();
        assertThrows(StackTooSmallException.class, () -> {
            integerStack.pop();
        });
    }

    @Test
    @DisplayName("Assert that number of sequential pushes equals the length")
    public void testForLengthAfterNumerousPushes() {
        MyStack<Boolean> booleanStack = new MyStack<>();
        booleanStack.push(true);
        booleanStack.push(true);
        booleanStack.push(true);
        booleanStack.push(false);
        assertEquals(booleanStack.length(), 4);
    }

    @Test
    @DisplayName("Assert that the right bool is uppermost on the stack")
    public void testForRightBoolOnPeek() {
        MyStack<Boolean> booleanStack = new MyStack<>();
        booleanStack.push(false);
        booleanStack.push(true);
        booleanStack.push(true);
        booleanStack.push(false);
        booleanStack.push(false);
        booleanStack.push(true);

        try {
            booleanStack.pop();
        } catch (StackTooSmallException exception) {
            exception.printStackTrace();
        }

        try {
            assertEquals(booleanStack.peek(), false);
        } catch (StackTooSmallException exception) {
            exception.printStackTrace();
        }
    }


}