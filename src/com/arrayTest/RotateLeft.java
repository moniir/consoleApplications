package com.arrayTest;

public class RotateLeft {

    static int[] rotLeft(int[] a, int d) {
        int len, new_index;
        len = a.length;
        int []new_arr = new int[len];

        for(int i = 0; i < a.length; i++) {
            new_index = (i + d) % len;
            new_arr[i] = a[new_index];
        }
        return new_arr;
    }

    public static void main(String []args) {
        int[] a = {1,2,3,4,5};
        int[] result = rotLeft(a,4);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
