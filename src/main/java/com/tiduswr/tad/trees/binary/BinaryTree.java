package com.tiduswr.tad.trees.binary;

import com.tiduswr.tad.exceptions.ValueAlreadyExists;
import com.tiduswr.tad.trees.Tree;

public class BinaryTree<T extends Comparable<T>> implements Tree<T>{

    protected BinaryNode<T> root;

    @Override
    public void add(T value) throws ValueAlreadyExists{
        if(root == null){
            root = new BinaryNodeImpl<T>(value);
        }else{
            insertRecursive(root, value);
        }
    }

    private void insertRecursive(BinaryNode<T> current, T value) throws ValueAlreadyExists{
        var compare = value.compareTo(current.getValue());

        if(compare == 0)
            throw new ValueAlreadyExists("O valor " + value + " ja existe na ávore!");

        if(compare < 0){
            
            BinaryNode<T> left = current.getLeft();
            if(left == null){
                current.setLeft(new BinaryNodeImpl<T>(value));
            }else{
                insertRecursive(left, value);
            }
        }else{
            BinaryNode<T> right = current.getRight();
            if(right == null){
                current.setRight(new BinaryNodeImpl<T>(value));
            }else{
                 insertRecursive(right, value);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private BinaryNode<T>[] findBinaryNodeByValue(T value){
        BinaryNode<T> father = null;
        BinaryNode<T> current = root;
        
        while(true){
            if(current == null) 
                return null;
            
            var compare = value.compareTo(current.getValue());
            if(compare == 0){
                break;
            }else if(compare < 0){
                father = current;
                current = current.getLeft();
            }else{
                father = current;
                current = current.getRight();
            }
        }

        return new BinaryNode[]{father, current};
    }

    private void deleteBinaryNode(BinaryNode<T> current, BinaryNode<T> father){
        if(current.getValue().compareTo(father.getValue()) < 0){
            father.setLeft(null);
        }else{
            father.setRight(null);
        }
    }

    private void swapBinaryNode(BinaryNode<T> current, BinaryNode<T> father, BinaryNode<T> replacement){
        if(current.getValue().compareTo(father.getValue()) < 0){
            father.setLeft(replacement);
        }else{
            father.setRight(replacement);
        }
    }

    @Override
    public void remove(T value) {
        BinaryNode<T>[] searchResult = findBinaryNodeByValue(value);

        if(searchResult != null){
            var father = searchResult[0];
            var current = searchResult[1];

            if(current.getRight() != null){ 
                //Elemento tem 2 filhos ou somente filho a direita
                var substitute = current.getRight();
                var substituteFather = current;

                while(substitute.getLeft() != null){
                    substituteFather = substitute;
                    substitute = substitute.getLeft();
                } 
                substitute.setLeft(current.getLeft());

                if(father != null){
                    swapBinaryNode(current, father, substitute);
                }else{
                    root = substitute;
                    substituteFather.setLeft(null);
                    root.setRight(substituteFather);
                    root.setLeft(current.getLeft());
                }

                deleteBinaryNode(substitute, substituteFather);
            }else if(current.getLeft() != null){ 
                //Elemento somente filho a esquerda
                var substitute = current.getLeft();
                var substituteFather = current;

                while(substitute.getRight() != null){
                    substituteFather = substitute;
                    substitute = substitute.getRight();
                } 

                if(father != null){
                    swapBinaryNode(current, father, substitute);
                }else{
                    root = substitute;
                }

                deleteBinaryNode(substitute, substituteFather);
            }else{ 
                //Elemento não tem filhos
                if(father != null){
                    deleteBinaryNode(current, father);
                }else{
                    root = null;
                }
            }

        }
    }

    @Override
    public void preOrderPrint() {
        System.out.print("Pre Order: ");
        preOrderPrintRecusive(root);
        System.out.println();
    }

    @Override
    public void inOrderPrint() {
        System.out.print("In Order: ");
        inOrderPrintRecusive(root);
        System.out.println();
    }

    @Override
    public void posOrderPrint() {
        System.out.print("Pos Order: ");
        posOrderPrintRecusive(root);
        System.out.println();
    }

    private void preOrderPrintRecusive(BinaryNode<T> current){
        if(current != null){
            System.out.print(current.getValue() + " ");
            preOrderPrintRecusive(current.getLeft());
            preOrderPrintRecusive(current.getRight());
        }
    }

    private void inOrderPrintRecusive(BinaryNode<T> current){
        if(current != null){
            inOrderPrintRecusive(current.getLeft());
            System.out.print(current.getValue() + " ");
            inOrderPrintRecusive(current.getRight());
        }
    }

    private void posOrderPrintRecusive(BinaryNode<T> current){
        if(current != null){
            posOrderPrintRecusive(current.getLeft());
            posOrderPrintRecusive(current.getRight());
            System.out.print(current.getValue() + " ");
        }
    }

}
