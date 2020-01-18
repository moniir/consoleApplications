package com.sortingAlgorithm;

public class MergeSortSimplified {

    static void printArray(int[] arr){
        for (int i: arr) {
            System.out.printf(i+" ");
        }
    }
    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer=rightPointer=resultPointer=0;
        while(leftPointer<left.length || rightPointer<right.length) {
            if(leftPointer<left.length && rightPointer<right.length) {
                if(left[leftPointer]< right[resultPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else{
                  result[resultPointer++] = right[rightPointer++];
                }
            } else if(leftPointer<left.length){
                result[resultPointer++] = left[leftPointer++];
            } else if(rightPointer< right.length){
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    static int[] mergeSort(int []arr){

        int midPoint;
        int[] left,right;
        if(arr.length<2)
            return arr;

        midPoint = arr.length/2;
        left = new int[midPoint];
        if(arr.length%2 == 0)
            right = new int[midPoint];
        else
            right = new int[midPoint + 1];

        for (int i=0;i<midPoint;i++)
            left[i] = arr[i];
        for (int j =0;j<right.length;j++)
            right[j] = arr[midPoint+j];

        int []result = new int[arr.length];

        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);

        return result;
    }

    public static void main(String []args) {
        int []array = {5,4,3,2,1};
        System.out.println("Initial Array: ");
        printArray(array);

        array = mergeSort(array);
        System.out.println("Merged Array: ");
        printArray(array);
    }
}
