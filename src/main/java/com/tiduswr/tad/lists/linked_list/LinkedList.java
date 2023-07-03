package com.tiduswr.tad.lists.linked_list;

public interface LinkedList<T> {
    
    long size();
    Node<T> getRootNode();
    void insertLast(T value);
    void insertFirst(T value);
    T get(long index);
    
}
