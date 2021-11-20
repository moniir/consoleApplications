package com.algorithmTest;

public class InsertionSort {

    public static void InsertionSortTest(int[] array){

        int item,j,temp;

        for(int i = 1; i<array.length;i++){
            item = array[i];
            j = i - 1;
            while (j>=0 && array[j]>item){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = item;
        }

        for (int i: array) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int [] array = {5,2,6,3,4};
        InsertionSortTest(array);
    }
}
