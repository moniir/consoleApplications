package com.knapsack;

public class KnapsackWithMemoization {

    static int knapSackRec(int dp[][], int wt[], int val[], int cap, int size){
        if(cap == 0 || size == 0)
            return 0;
        if(dp[size][cap] != -1)
            return dp[size][cap];
        if(wt[size-1]>cap){
            return dp[size][cap] = knapSackRec(dp,wt,val,cap,size - 1);
        } else {
            return dp[size][cap] = Math.max(val[size - 1] + knapSackRec(dp,wt,val,cap - wt[size - 1], size - 1),
                    knapSackRec(dp,wt,val, cap, size - 1));
        }
    }

    static int knapSack(int []wt, int []val, int cap, int size){
        int dp[][]=new int[size+1][cap+1];
        for (int i = 0; i < size+1 ; i++) {
            for (int j = 0; j < cap+1; j++) {
                dp[i][j]= -1;
            }
        }
        return knapSackRec(dp,wt,val,cap,size);
    }
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(weight, profit, W, n));
    }
}
