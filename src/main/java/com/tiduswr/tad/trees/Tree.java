package com.tiduswr.tad.trees;

import com.tiduswr.tad.exceptions.ValueAlreadyExists;

public interface Tree<T> {
    
    void add(T value) throws ValueAlreadyExists;
    void remove(T value);
    void preOrderPrint();
    void inOrderPrint();
    void posOrderPrint();
}
