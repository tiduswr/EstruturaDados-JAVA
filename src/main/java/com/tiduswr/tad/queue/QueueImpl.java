package com.tiduswr.tad.queue;

import com.tiduswr.tad.lists.linked_list.LinkedList;
import com.tiduswr.tad.lists.linked_list.LinkedListImpl;

public class QueueImpl<T> implements Queue<T> {

    protected LinkedList<T> linkedList;

    public QueueImpl(){
        this.linkedList = new LinkedListImpl<>();
    }

    @Override
    public long size() {
        return this.linkedList.size();
    }

    @Override
    public void enqueue(T value) {
        linkedList.insertLast(value);
    }

    @Override
    public T dequeue() {
        var value = peek();

        if(value != null) linkedList.remove(0);

        return value;
    }

    @Override
    public T peek() {
        if(linkedList.size() > 0){
            var value = linkedList.get(0);
            return value;
        }else{  
            return null;
        }
    }
    
}
