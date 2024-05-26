package com.knapsack;

public class KnapsackTopDown {

    static int knapSack(int wt[], int profit[], int bagCapacity, int profitArrSize){
        int mat[][]= new int[profitArrSize+1][bagCapacity+1];
        for (int i = 0; i < profitArrSize+1; i++) {
            for (int j = 0; j < bagCapacity+1; j++) {
                if(i == 0 || j == 0){
                    mat[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < profitArrSize+1; i++) {
            for (int j = 1; j < bagCapacity+1; j++) {
                if(wt[i-1]> j){
                    mat[i][j] = mat[i-1][j];
                } else {
                    mat[i][j] = Math.max(profit[i-1]+mat[i-1][j-wt[i-1]],mat[i-1][j]);
                }
            }
        }
        return mat[profitArrSize][bagCapacity];
    }

    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(weight, profit, W, n));
    }
}
