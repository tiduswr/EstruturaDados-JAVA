package com.tiduswr;

import com.tiduswr.tad.exceptions.ValueAlreadyExists;
import com.tiduswr.tad.trees.Tree;
import com.tiduswr.tad.trees.binary.BinaryTree;

public class Main 
{
    public static void main( String[] args ) throws ValueAlreadyExists{
        binaryTreeTest();
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
