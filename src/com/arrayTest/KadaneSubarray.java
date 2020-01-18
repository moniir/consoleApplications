package com.arrayTest;

public class KadaneSubarray {

    public static void main(String[] args) {
//        int A[]={3, -4, 9, -8, 8, 7};
  //      int A[]={3, -4, 7, -9, 8, 7};
        int A[]={-2, 3, -7, 5, -9};
//        int A[]={2,4,6,8};
        int n = A.length;
        System.out.println(maxSubarraySum(A,n));
    }

    static int maxSubarraySum(int a[], int n) {
        int overall_sum = 0;  //overall maximum subarray sum
        int new_sum;

        for (int i = 0; i < n; i++) {

            //find the maximum subarray sum of the subarray starting from a[i]
            new_sum = 0;
            for (int j = i; j < n; j++) {
                new_sum += a[j];

                if (new_sum > overall_sum) {
                    overall_sum = new_sum;
                }

            }
        }
        return overall_sum;
    }
}