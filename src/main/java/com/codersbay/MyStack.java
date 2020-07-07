package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private final List<T> content = new ArrayList<T>();

    public int length() {
        return content.size();
    }

    public T push(T element) {
        content.add(element);
        return element;
    }

    public T pop() throws StackTooSmallException {
        // return and remove the uppermost element

        if (content.isEmpty()) {
            throw new StackTooSmallException("Stack Too Small - Cannot perform POP");
        } else {
            return content.remove(content.size() - 1);
        }
    }

    public T peek() throws StackTooSmallException {
        // return the uppermost element
        if (content.isEmpty()) {
            throw new StackTooSmallException("Stack Too Small - Cannot perform PEEK");
        } else {
            return content.get(content.size() - 1);
        }
    }


    public List<T> getContent() {
        return content;
    }


}
