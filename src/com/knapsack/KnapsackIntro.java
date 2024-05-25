package com.knapsack;

public class KnapsackIntro {

    static int knapSack(int[] wt, int[] profit, int capacity, int size){
        if(size == 0 || capacity == 0)
            return 0;
        if(wt[size-1] > capacity)
            return knapSack(wt,profit,capacity, size - 1);
        else
            return Math.max(profit[size - 1] + knapSack(wt,profit, capacity - wt[size - 1], size -1 ),
                    knapSack(wt,profit,capacity, size - 1));


    }
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(weight, profit, W, n));
    }
}
