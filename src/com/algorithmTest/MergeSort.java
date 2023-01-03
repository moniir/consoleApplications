package com.algorithmTest;

public class MergeSort {

    public static void merge(int[] array,int[] arrayLeft, int[] arrayRight, int left, int right){
        int i = 0,j = 0,k = 0;
        while (i < left && j < right){
            if(arrayLeft[i] <= arrayRight[j])
                array[k++] = arrayLeft[i++];
            else
                array[k++] = arrayRight[j++];
        }

        while (i < left) {
            array[k++] = arrayLeft[i++];
        }
        while (j < right) {
            array[k++] = arrayRight[j++];
        }
    }

    public static void mergeSort(int[] array, int len){

        if (len < 2) {
            return;
        }

        int mid = len/2;
        int arrayLeft[] = new int[mid];
        int arrayRight[] = new int[len - mid];

        for(int i = 0; i< mid; i++){
            arrayLeft[i] = array[i];
        }
        for(int i = mid; i< len; i++){
            arrayRight[i - mid] = array[i];
        }
        mergeSort(arrayLeft,mid);
        mergeSort(arrayRight,len - mid);
        merge(array,arrayLeft,arrayRight,mid, len-mid);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        mergeSort(arr, arr.length);
        for (int i : arr) {
            System.out.printf(i+ " ");
        }
    }
}
