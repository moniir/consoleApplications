package com.arrayTest;

public class TwoDArrayDS {

    static int hourglassSum(int[][] a) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
                        + a[i + 2][j + 2];
                if (temp > sum) {
                    sum = temp;
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a = {{1 ,1, 1 ,0 ,0 ,0},{0, 1, 0 ,0 ,0 ,0},{1 ,1 ,1, 0 ,0 ,0},{0, 0 ,2 ,4 ,4 ,0},{0, 0 ,0, 2, 0 ,0},{0 ,0, 1, 2 ,4 ,0}};
       int sum = hourglassSum(a);
        System.out.println(sum);
    }
}
