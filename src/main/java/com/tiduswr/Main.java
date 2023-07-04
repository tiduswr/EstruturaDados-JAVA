package com.tiduswr;

import com.tiduswr.sort.Sorter;
import com.tiduswr.tad.exceptions.ValueAlreadyExists;
import com.tiduswr.tad.lists.linked_list.LinkedList;
import com.tiduswr.tad.lists.linked_list.LinkedListImpl;
import com.tiduswr.tad.queue.Queue;
import com.tiduswr.tad.queue.QueueImpl;
import com.tiduswr.tad.stack.Stack;
import com.tiduswr.tad.stack.StackImpl;
import com.tiduswr.tad.trees.Tree;
import com.tiduswr.tad.trees.binary.BinaryTree;

public class Main 
{
    public static void main( String[] args ) throws ValueAlreadyExists{
        mergeSortTest();
        //insertionSortTest();
        //selectionSortTest();
        //bubbleSortTest();
        //stackTest();
        //queueTest();
        //linkedListTest();
        //binaryTreeTest();
    }

    private static void mergeSortTest() {
        Sorter<Integer> sorter = new Sorter<>();
        Integer[] arr = new Integer[]{3,5,1,8,7};
        Integer[] sorted = sorter.mergeSort(arr);
        
        System.out.print("Original: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sorted: ");
        for(int i : sorted){
            System.out.print(i + " ");
        }
    }

    private static void insertionSortTest() {
        Sorter<Integer> sorter = new Sorter<>();
        Integer[] arr = new Integer[]{3,5,1,8,7};
        Integer[] sorted = sorter.insertionSort(arr);
        
        System.out.print("Original: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sorted: ");
        for(int i : sorted){
            System.out.print(i + " ");
        }
    }

    private static void selectionSortTest() {
        Sorter<Integer> sorter = new Sorter<>();
        Integer[] arr = new Integer[]{3,5,1,8,7};
        Integer[] sorted = sorter.selectionSort(arr);
        
        System.out.print("Original: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sorted: ");
        for(int i : sorted){
            System.out.print(i + " ");
        }
    }

    private static void bubbleSortTest() {
        Sorter<Integer> sorter = new Sorter<>();
        Integer[] arr = new Integer[]{3,5,1,8,7};
        Integer[] sorted = sorter.bubbleSort(arr);
        
        System.out.print("Original: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Sorted: ");
        for(int i : sorted){
            System.out.print(i + " ");
        }
    }

    private static void stackTest() {
        Stack<Integer> stack = new StackImpl<>();

        stack.push(1);
        stack.push(2);
        stack.pop();

        System.out.println(stack.peek());
    }

    private static void queueTest(){
        Queue<Integer> queue = new QueueImpl<>();
    
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();

        System.out.println(queue.peek());
    }

    private static void linkedListTest(){
        System.out.println("##### Linked List | INICIO\n");

        LinkedList<Integer> list = new LinkedListImpl<>();
        
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);

        list.remove(2);
        list.remove(5);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n##### Linked List | FIM");
    }

    private static void binaryTreeTest() throws ValueAlreadyExists{
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
