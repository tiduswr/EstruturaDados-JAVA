package com.tiduswr.tad.stack;

public interface Stack<T> {
    
    void push(T value);
    T pop();
    T peek();
    long size();
    
}
