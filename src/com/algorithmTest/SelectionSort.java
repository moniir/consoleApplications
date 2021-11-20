package com.algorithmTest;

public class SelectionSort {

    public static void selectionSortTest(int[] array){

        int indexMin = 0;

        for(int i =0;i<array.length -1; i++){
            indexMin = i;
            for(int j = i+1; j<array.length;j++){
                if(array[j] < array[indexMin]){
                    indexMin = j;
                }
            }
            if(indexMin != i){
                int temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
            }
        }
        for (int i: array) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int [] array = {5,2,6,3,4};
        selectionSortTest(array);
    }
}
