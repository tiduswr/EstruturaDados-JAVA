package com.tiduswr.tad.lists.linked_list;

public class LinkedListImpl<T> implements LinkedList<T> {

    protected long size;
    protected Node<T> rootNode;

    public LinkedListImpl(){
        this.size = 0;
    }

    @Override
    public long size() {
        return size;
    }

    @Override
    public Node<T> getRootNode() {
        return rootNode;
    }

    @Override
    public void insertLast(T value) {
        Node<T> node = new NodeImpl<>(value);

        if(size == 0){
            rootNode = node;
        }else{
            Node<T> cur = rootNode;
            while(cur.hasNext()){
                cur = cur.getNext();
            }

            cur.setNext(node);
        }
        this.size++;
    }

    @Override
    public void insertFirst(T value) {
        Node<T> node = new NodeImpl<>(value);
        if(size == 0){
            rootNode = node;
        }else{
            node.setNext(this.rootNode);
            this.rootNode = node;
        }
        this.size++;
    }

    @Override
    public T get(long index) {
        long indexSum = 0;

        if(index >= size) return null;

        Node<T> cur = rootNode;
        while(cur.hasNext()){
            if(index == indexSum) break;
            cur = cur.getNext();
            indexSum++;
        }

        return cur != null ? cur.getValue() : null;
    }
    
}
