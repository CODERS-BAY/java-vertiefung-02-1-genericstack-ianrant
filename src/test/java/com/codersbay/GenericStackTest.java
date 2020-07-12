package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GenericStackTest {

    @Test
    @DisplayName("Assert that a stack throws an exception when stack has been emptied and pop is run")
    public void testForExceptionThrownOnTooManyPops() throws StackTooSmallException {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Test #1");
        stringStack.push("Test #2");
        stringStack.push("Test #3");

        // Why does try/catch work in this case but adding to the method declaration does not?

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        assertThrows(StackTooSmallException.class, () -> {
            stringStack.pop();
        });
    }

    @Test
    @DisplayName("Assert that a newly intialized stack throws an exception when pop is run")
    public void testForExceptionThrownOnEmptyStack() {
        GenericStack<Integer> integerStack = new GenericStack<>();
        assertThrows(StackTooSmallException.class, () -> {
            integerStack.pop();
        });
    }

    @Test
    @DisplayName("Assert that number of sequential pushes equals the length")
    public void testForLengthAfterNumerousPushes() {
        GenericStack<Boolean> booleanStack = new GenericStack<>();
        booleanStack.push(true);
        booleanStack.push(true);
        booleanStack.push(true);
        booleanStack.push(false);
        assertEquals(booleanStack.length(), 4);
    }

    @Test
    @DisplayName("Assert that the right bool is uppermost on the stack")
    public void testForRightBoolOnPeek() throws StackTooSmallException {
        GenericStack<Boolean> booleanStack = new GenericStack<>();
        booleanStack.push(false);
        booleanStack.push(true);
        booleanStack.push(true);
        booleanStack.push(false);
        booleanStack.push(false);
        booleanStack.push(true);
        assertEquals(booleanStack.length(), 6);
        assertEquals(booleanStack.peek(), true);
        booleanStack.pop();
        assertEquals(booleanStack.length(), 5);
        assertEquals(booleanStack.peek(), false);

    }


}