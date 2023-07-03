package com.tiduswr.tad.lists.linked_list;

public class NodeImpl<T> implements Node<T> {

    protected T value;
    protected Node<T> next;

    public NodeImpl(T value){
        this.value = value;
        this.next = null;
    }

    @Override
    public Node<T> getNext() {
        return next;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setNext(Node<T> node) {
        this.next = node;
    }
    
}
