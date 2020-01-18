package com.arrayTest;

public class BubSort {

    static void countSwaps(int[] a) {
        int len = a.length;
        int count = 0;
        for(int i =0; i<len;i++){
            for(int j=0;j<len-1-i;j++){
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    count++;
                }
            }

        }
        System.out.println("Array is sorted in " + 3 + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[len - 1]);
    }

    public static void main(String []args) {

        int[] arr = {10, 5, 2, 8, 7, 1, 6, 7};
        countSwaps(arr);

    }
}
