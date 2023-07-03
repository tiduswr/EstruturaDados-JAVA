package com.tiduswr.tad.stack;

import com.tiduswr.tad.lists.linked_list.LinkedList;
import com.tiduswr.tad.lists.linked_list.LinkedListImpl;

public class StackImpl<T> implements Stack<T> {

    protected LinkedList<T> linkedList;

    public StackImpl(){
        this.linkedList = new LinkedListImpl<>();
    }

    @Override
    public void push(T value) {
        linkedList.insertFirst(value);
    }

    @Override
    public T pop() {
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

    @Override
    public long size() {
        return linkedList.size();
    }
    
}
