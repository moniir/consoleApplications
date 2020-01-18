package com.arrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int weight[] = new int[n];
        int weight[] = {1 ,2 ,3 ,21, 7, 12 ,14, 21};
//        for(int i = 0;i<n;i++)
//            weight[i]=sc.nextInt();
        Arrays.sort(weight);
        int result=0;
        int range=-1;
        for(int i = 0;i<weight.length;i++){
            if(weight[i]>range){
                result++;
                range = weight[i]+4;
            }

        }
        System.out.println(result);

    }
}
