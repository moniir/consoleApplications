package com.algorithmTest;

public class BubbleSort {

    public static void BubbleSortTest(int[] array){

        for(int i =0;i<array.length;i++){
            for(int j = 0; j<array.length - i -1;j++){
                if(array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }

        for (int i: array) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int [] array = {5,2,6,3,4};
        BubbleSortTest(array);
    }
}
