package com.tiduswr.sort;

import java.util.Arrays;

public class Sorter {
    
    public static int[] bubbleSort(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);

        for(int i = 0; i < copy.length - 1; i++){
            for(int j = 0; j < copy.length - (i + 1); j++){
                if(copy[j] > copy[j+1]){
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j+1] = temp;
                }
            }
        }

        return copy;
    }

    public static int[] selectionSort(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);

        var n = copy.length;
        for(int i = 0; i < n-1; i++){
            
            //Procura menor valor
            var minIndex = i;
            for(int j = i; j < n; j++){
                if(copy[j] < copy[minIndex]){
                    minIndex = j;
                }
            }

            //Faz o swap dos valores caso necessário
            if(copy[i] > copy[minIndex]){
                var aux = copy[i];
                copy[i] = copy[minIndex];
                copy[minIndex] = aux;
            }

        }

        return copy;
    }

    public static int[] insertionSort(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);

        var n = copy.length;
        for(int i = 1; i < n; i++){
            var key = copy[i];

            var j = i-1;

            //Faz a troca enquanto o elemento atual for menor que o ultimo elemento da sublista a esquerda
            while(j >= 0 && copy[j] > key){
                copy[j+1] = copy[j];
                j--;
            }

            //insere o elemento na posição correta, que é a que a condição copy[j] > key deixou de ser verdade
            copy[j+1] = key;
        }

        return copy;
    }

    public static int[] mergeSort(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);
        var n = copy.length;
        mergeSortRecursive(copy, 0, n);
        return copy;
    }

    private static void mergeSortRecursive(int[] arr, int start, int end){
        if((end - start) > 1){
            int middle = (end + start) / 2;
            mergeSortRecursive(arr, start, middle);
            mergeSortRecursive(arr, middle, end);
            merge(arr, start, middle, end);
        }
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        var left = Arrays.copyOfRange(arr, start, middle);
        var right = Arrays.copyOfRange(arr, middle, end);
        int topLeft = 0;
        int topRight = 0;

        for(int k = start; k < end; k++){
            if(topLeft >= left.length){
                arr[k] = right[topRight];
                topRight++;
            }else if(topRight >= right.length){
                arr[k] = left[topLeft];
                topLeft++;
            }else if(left[topLeft] < right[topRight]){
                arr[k] = left[topLeft];
                topLeft++;
            }else{
                arr[k] = right[topRight];
                topRight++;
            }
        }
    }

}
