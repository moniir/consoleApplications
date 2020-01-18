package com.sortingAlgorithm;

public class InsertionSort {
    public static void main(String []args) {
        int arr[] = {7,2,4,1,5,3};
        for(int i =1; i<arr.length;i++) {
            int value = arr[i];
            int hole = i;
            while(hole>0 && arr[hole-1]>value){
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole]=value;
        }
        for (int i =0;i<arr.length;i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
