/**
 *
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Example 1:
 *
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 *
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 *
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 104
 * */

package com.faang;

public class ValidMountainArraySolution {

    public static boolean validMountainArray(int[] A) {
        // if we have less than 3 integers, it will always be false
        if (A.length<3) return false;

        // set our counter variables
        int len = A.length;
        int i = 0;

        // walk up the array until it decreases
        while (i+1 < len && A[i]<A[i+1])
            // increment our counter
            i++;

        // if the start or end characters are the same as our counter
        // then the mountain didn't decrease
        if (i==0 || i==len-1)
            return false;

        // walk the array while it decreases
        // starting at the last counter index
        while (i+1 < len && A[i]>A[i+1])
            i++;

        // return a boolean if the counter is the same as the length
        return i == len-1;

    }

    public static void main (String[] args) {
        int valindMountainInput[] = {2,3,4,5,3,1};
//        int valindMountainInput[] = {0,3,2,1};
        int limit = 3;
        System.out.println(validMountainArray(valindMountainInput));
    }
}
