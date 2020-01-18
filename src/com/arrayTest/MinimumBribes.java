package com.arrayTest;


public class MinimumBribes {

    static void minBribes(int[] q) {
        //check whether result is tooo chaotic
        for(int i = q.length-1;i>=0;i--){
            int l = q[i]-1-i;
            if(q[i]-1-i>2){
                System.out.println("Too Chaotic");
                return;
            }
        }
        //use bubble sort to track number of swaps needed
        int swaps =0;
        boolean swapped = false;
        for(int i=1;i<q.length;i++){
            for(int j=0;j<q.length-1;j++){
                if(q[j]>q[j+1]){
                    swaps++;
                    int temp = q[j+1];
                    q[j+1] = q[j];
                    q[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;

            swapped = false;
        }
        System.out.println(swaps);
        return;
    }

    public static void main(String []args) {
//        int []a = {2, 1, 5, 3, 4};
//        int []a = {5, 1, 2, 3, 7, 8, 6, 4};
        int []a = {11, 21, 51, 31, 71, 81, 61, 41};
//        int []a = {2, 5, 1, 3, 4};
        minBribes(a);
    }
}
