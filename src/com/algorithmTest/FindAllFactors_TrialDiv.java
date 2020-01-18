package com.algorithmTest;

// 25 = 1 5 25
//50 = 1 2 5 10 25 50

import java.util.ArrayList;
import java.util.List;

public class FindAllFactors_TrialDiv {

    public static void findAllFactors(int n) {
        List list =new ArrayList();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                double sqrt = Math.sqrt(n);
                if(i!=sqrt){
//                if(i!=Math.sqrt(n)){
                    int p =n/i;
                    list.add(p);
                }

            }
            }
        list.forEach(i->System.out.printf(i+" "));

        }


    public static void main(String[] args) {
        findAllFactors(50);
    }
}
