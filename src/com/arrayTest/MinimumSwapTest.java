package com.arrayTest;

public class MinimumSwapTest {

    static int minimumSwaps(int[] a) {
        int swap=0;
        for(int i=0;i<a.length;i++){
            if(i+1!=a[i]){
                int t=i;
                while(a[t]!=i+1){
                    t++;
                }
                int temp=a[t];
                a[t]=a[i];
                a[i]=temp;
                swap++;
            }
        }
        return swap;

    }
    public static void main(String []args) {
//        int a[] = {1, 3, 5 ,2, 4, 6, 7};
        int a[] = {1, 3, 2 ,5, 4, 6, 7};
        minimumSwaps(a);
    }
}
