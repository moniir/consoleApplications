package com.knapsack;

public class SubsetSum {

    static boolean isSubsetSum(int arr[], int length, int sum){
        boolean matrix[][] = new boolean[length+1][sum+1];
        for (int i = 0; i < length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0)
                    matrix[i][j]= false;
                if(j==0)
                    matrix[i][j]=true;
            }
        }
        for (int i = 1; i < length+1; i++) {
            for (int j = 1; j < sum+1; j++) {
                if(arr[i-1]>j)
                    matrix[i][j]=matrix[i-1][j];
                else
                    matrix[i][j] = matrix[i][j-arr[i-1]]||matrix[i-1][j];
            }
        }
        return matrix[length][sum];
    }

    public static void main(String[] args) {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }
}
