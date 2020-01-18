package com.arrayTest;

import java.util.Arrays;

public class MaximumToys {

    static int maximumToys(int[] prices, int k) {
        int maxToyCount =0;
        int len = prices.length;
        Arrays.sort(prices);
        int sum =0;
        //worst solution
       /* for(int i =0; i<len;i++) {
            if(k>(sum+=prices[i])){
                maxToyCount++;
            }
        }*/
       //Best Solution
        int toynumber=0;
        for (int i = 0; i < prices.length; i++) {
            if (k - prices[i] >= 0) {
                k -= prices[i];
                toynumber++;
            } // could add a break statement to improve the time of execution
        }
        return maxToyCount;
    }
    public static void main(String []args) {

        int[] arr = {1, 12, 5, 111, 200, 1000, 10};
        maximumToys(arr,50);

    }
}
