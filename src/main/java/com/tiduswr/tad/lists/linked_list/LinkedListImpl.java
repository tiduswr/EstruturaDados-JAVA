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

        if(index >= size || index < 0) return null;

        Node<T> cur = rootNode;
        while(cur.hasNext()){
            if(index == indexSum) break;
            cur = cur.getNext();
            indexSum++;
        }

        return cur != null ? cur.getValue() : null;
    }

    @Override
    public boolean remove(long index) {
        if(size > 0 && index < size){
            long indexSum = 0;
            Node<T> prev = null;
            Node<T> cur = rootNode;

            while(cur.hasNext()){
                if(index == indexSum) 
                    break;
                prev = cur;
                cur = cur.getNext();
                indexSum++;
            }

            if(prev == null){
                System.out.println("entrei");
                this.rootNode = cur.getNext();
            }else{
                prev.setNext(cur.getNext());
            }
            
            cur.setNext(null);
            this.size--;

            return true;
        }else{
            return false;
        }
        
    }
    
}
