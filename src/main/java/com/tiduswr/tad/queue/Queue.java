package com.tiduswr.tad.queue;

public interface Queue<T> {
    
    long size();
    void enqueue(T value);
    T dequeue();
    T peek();

}
