package com.arrayTest;

public class GFG
{
    // Method to find the maximum for each and every contiguous subarray of size k.
    static void printKMax(int arr[], int n, int k)
    {
        int j, max;

        for (int i = 0; i <= n - k; i++) {

            max = arr[i];

            for (j = 1; j < k; j++)
            {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 2,1,2,-1,3 };
        int k = 2;
        printKMax(arr, arr.length, k);
    }
}
