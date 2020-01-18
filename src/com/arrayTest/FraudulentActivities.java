package com.arrayTest;

import java.util.Arrays;

public class FraudulentActivities {

    static float getMedian(int[] arr){
        int n;
        n = arr.length;
        Arrays.sort(arr);
        if( n % 2 == 1){
            return (float)arr[n/2];
        }else{
            return (float)(arr[n/2]+arr[n/2-1])/2;
        }
    }
    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int n = expenditure.length,count = 0;
        int copy[] = new int[d];
        for(int i = 0 ; i < n - d; i++){
            copy = Arrays.copyOfRange(expenditure,i,d+i);
            if(expenditure[d+i] >= getMedian(copy)*2){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        int d = 5;
        activityNotifications(arr,d);
    }
}
