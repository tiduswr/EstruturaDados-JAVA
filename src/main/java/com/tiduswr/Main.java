package com.tiduswr;

import com.tiduswr.tad.exceptions.ValueAlreadyExists;
import com.tiduswr.tad.lists.linked_list.LinkedList;
import com.tiduswr.tad.lists.linked_list.LinkedListImpl;
import com.tiduswr.tad.trees.Tree;
import com.tiduswr.tad.trees.binary.BinaryTree;

public class Main 
{
    public static void main( String[] args ) throws ValueAlreadyExists{
        linkedListTest();
        //binaryTreeTest();
    }

    public static void linkedListTest(){
        System.out.println("##### Linked List | INICIO\n");

        LinkedList<Integer> list = new LinkedListImpl<>();
        
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
    
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n##### Linked List | FIM");
    }

    public static void binaryTreeTest() throws ValueAlreadyExists{
        System.out.println("##### Binary Tree | INICIO\n");

        Tree<Integer> arvore = new BinaryTree<Integer>();

        arvore.add(10);
        arvore.add(8);
        arvore.add(5);
        arvore.add(9);
        arvore.add(7);
        arvore.add(18);
        arvore.add(13);
        arvore.add(20);
        arvore.inOrderPrint();
        
        arvore.remove(20);
        arvore.inOrderPrint();
        
        arvore.remove(5);
        arvore.inOrderPrint();
        
        arvore.remove(8);
        arvore.inOrderPrint();
        
        arvore.remove(9);
        arvore.inOrderPrint();
        
        arvore.remove(13);
        arvore.inOrderPrint();
        
        arvore.remove(7);
        arvore.inOrderPrint();

        arvore.remove(18);
        arvore.inOrderPrint();
        
        arvore.remove(10);
        arvore.inOrderPrint();

        System.out.println("\n##### Binary Tree | FIM");
    }
}