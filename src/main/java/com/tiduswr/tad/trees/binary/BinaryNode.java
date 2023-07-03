package com.tiduswr.tad.trees.binary;

public interface BinaryNode<T> {
    T getValue();
    void setValue(T value);
    BinaryNode<T> getLeft();
    BinaryNode<T> getRight();
    void setLeft(BinaryNode<T> value);
    void setRight(BinaryNode<T> value);
}
