package com.arrayTest;

public class CountingInversions {

    static long cnt;
    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
         cnt = 0;
        mergeSort(arr, 0, arr.length - 1, new int[arr.length]);
        return cnt;

    }
    private static void mergeSort(int[] arr, int left, int right, int[] helper) {
        if (left == right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid, helper);
        mergeSort(arr, mid + 1, right, helper);
        merge(arr, left, right, mid, helper);
    }

    private static void merge(int[] arr, int left, int right, int mid, int[] helper) {
        for (int i = left; i <= right; i++) {
            helper[i] = arr[i];
        }
        int l = left, r = mid + 1, idx = left;
        while (l <= mid && r <= right) {
            if (helper[l] <= helper[r]) {
                arr[idx++] = helper[l++];
            }else {
                cnt += (long)(mid - l + 1);
                arr[idx++] = helper[r++];
            }
        }

        while (l <= mid) {
            arr[idx++] = helper[l++];
        }
    }
    public static void main(String[] args){
        int arr[]={2, 1, 3, 1, 2};
        long result = countInversions(arr);
        System.out.println(result);
    }
}
