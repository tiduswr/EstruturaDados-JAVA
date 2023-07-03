package com.tiduswr.tad.trees.binary;

public class BinaryNodeImpl<T> implements BinaryNode<T> {
    
    protected T value;
    protected BinaryNode<T> rightNode, leftNode;

    public BinaryNodeImpl(T value){
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public BinaryNode<T> getLeft() {
        return leftNode;
    }

    @Override
    public BinaryNode<T> getRight() {
        return rightNode;
    }

    @Override
    public void setLeft(BinaryNode<T> node) {
        leftNode = node;
    }

    @Override
    public void setRight(BinaryNode<T> node) {
        rightNode = node;
    }

}
