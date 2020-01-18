package com.sortingAlgorithm;

public class SelectionSort {

    public static void main(String []args) {

        int []arr = {10,5,2,8,7,1,6,7};
        for(int i =0; i<arr.length-1;i++){
            int indexMin =i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[indexMin]){
                    indexMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin]=temp;
        }
        for (int i =0;i<arr.length;i++) {
            System.out.printf(arr[i]+" ");
        }
    }
}
