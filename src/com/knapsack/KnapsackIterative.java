package com.knapsack;

public class KnapsackIterative {

    static int [][] track_arr;

    static int max(int val, int val2){
        return (val>val2)?val:val2;
    }

    static int knapSack(int k, int[] wt, int []val, int length){

        int [][]new_arr = new int[length+1][k+1];
        track_arr = new int[length+1][k+1];
        for(int i=0;i<=length;i++){
            for(int j=0;j<=k;j++){
                if(i==0||j==0){
                    new_arr[i][j]=0;
                    track_arr[i][j]=0;
                } else if(wt[i-1]<=j){
//                    int p = j-wt[i-1];
//                    int vall = new_arr[i-1][j-wt[i-1]];
                    new_arr[i][j]= max(val[i-1] + new_arr[i-1][j-wt[i-1]],  new_arr[i-1][j]);

                } else {
                    new_arr[i][j] = new_arr[i-1][j];
                    track_arr[i][j]= i-1;
                }
            }
        }
        return new_arr[length][k];
    }





    // Driver program to test above function
    public static void main(String args[])
    {
//        int val[] = new int[]{60, 100, 120};
        int val[] = new int[]{15, 10, 9, 5};
        int wt[] = new int[]{1, 5, 3, 4};
        int  W = 8;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }


/*
        // A utility function that returns maximum of two integers
        static int max(int a, int b) { return (a > b)? a : b; }

        // Returns the maximum value that can be put in a knapsack of capacity W
        static int knapSack(int W, int wt[], int val[], int n)
        {
            int i, w;
            int K[][] = new int[n+1][W+1];

            // Build table K[][] in bottom up manner
            for (i = 0; i <= n; i++)
            {
                for (w = 0; w <= W; w++)
                {
                    if (i==0 || w==0)
                        K[i][w] = 0;
                    else if (wt[i-1] <= w)
                        K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                    else
                        K[i][w] = K[i-1][w];
                }
            }

            return K[n][W];
        }


        // Driver program to test above function
        public static void main(String args[])
        {
            int val[] = new int[]{60, 100, 120};
            int wt[] = new int[]{10, 20, 30};
            int  W = 50;
            int n = val.length;
            System.out.println(knapSack(W, wt, val, n));
        }*/
    }
