package com.tiduswr.tad.lists.linked_list;

public interface Node<T> {
    
    void setNext(Node<T> node);
    Node<T> getNext();
    boolean hasNext();
    T getValue();

}
