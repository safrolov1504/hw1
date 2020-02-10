package com.company;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

    public static void main(String[] args) {
        int [] arrayFir = new int [20];
        addDate(arrayFir);
        printArray(arrayFir);
        //удаление
        delItime(arrayFir,5);

        //добавление элемента
        int [] arrayIs = addItime(arrayFir,13,4);

        //сортировки
        bubbleSort(arrayIs);
        selectedSort(arrayIs);
        insertionSort(arrayIs);
        mergeSort(arrayIs);
        //printArray(arrayIs);

        boolean flag = searchArray(arrayIs,13);
        if(flag) System.out.println("есть число");
            else System.out.println("Нет числа");

        printArray(arrayIs);
    }

    private static int [] addItime(int[] arrayIs, int i, int number) {
        int [] returnArray = new int[arrayIs.length+1];
        for (int j = 0; j < number; j++) {
            returnArray[j] = arrayIs[j];
        }
        returnArray[number] = i;

        for (int j = number+1; j < returnArray.length; j++) {
            returnArray[j] = arrayIs[j-1];
        }
        return returnArray;
    }

    private static void delItime(int[] arrayIs, int number) {
        for (int i = number; i < arrayIs.length-1; i++) {
            arrayIs[i] = arrayIs[i+1];
        }
        arrayIs[arrayIs.length-1] = 0;
    }

    private static boolean searchArray(int[] arrayIs, int number) {
        for (int j = 0; j < arrayIs.length; j++) {
            if(arrayIs[j] == number){
                return true;
            }
        }
        return false;
    }



    private static void mergeSort(int[] arrayTm) {
        int [] tmp = new int [arrayTm.length];
        int [] array = Arrays.copyOf(arrayTm,arrayTm.length);
        long startTime = System.currentTimeMillis();
        mergeInt(arrayTm,tmp,0,array.length-1);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("MergeSort sort = " + timeSpent);
        printArray(arrayTm);
    }


    private static void mergeInt(int[] array, int[] tmp, int lo, int hi) {
        if(hi<=lo){
            return;
        }
        int mid = lo + (hi -lo)/2;
        mergeInt(array,tmp,lo,mid);
        //printArray(array);
        mergeInt(array,tmp,mid+1,hi);
        //printArray(array);
        merge(array, tmp, lo, mid, hi);
        //printArray(tmp);
    }

    private static void merge(int[] array, int[] tmp, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            tmp[k] = array[k];
        }

        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if(i>mid) array[k] = tmp[j++];
            else if(j > hi) array[k] = tmp[i++];
            else if (tmp[i]>tmp[j]) array[k] = tmp[j++];
            else array[k] = tmp[i++];
        }
        //printArray(tmp);
    }


    private static void insertionSort(int[] arrayTm) {
        int [] array = Arrays.copyOf(arrayTm,arrayTm.length);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while (j>0 && array[j-1] > tmp){
                array[j] = array [j-1];
                j--;
            }
            array[j] = tmp;
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("insertion sort = " + timeSpent);
        //printArray(array);
    }

    private static void selectedSort(int[] arrayTm) {
        int [] array = Arrays.copyOf(arrayTm,arrayTm.length);
        int minIn;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
           minIn=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[minIn]){
                    minIn = j;
                }
            }
            swap(array,i,minIn);
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Selected sort = "+timeSpent);
        //printArray(array);
    }

    private static void bubbleSort(int[] arrayTm) {
        int [] array = Arrays.copyOf(arrayTm,arrayTm.length);
        long startTime = System.currentTimeMillis();
        for (int i = array.length; i >= 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Bubble sort = "+timeSpent);
        //printArray(array);
    }



    private static void swap(int[] array, int i, int i1) {
        int tmp = array[i];
        array[i] = array [i1];
        array[i1] = tmp;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void addDate(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }


}
