package com.company;

public class LoopTest {

    public static void main(String []args){
         int i = 1, j = 10;
        int k =1;
        do
            {
                System.out.println("Iteration "+k+": i=" + i + " j=" + j);
                k++;
                if (i++ > --j) continue;
                }
                while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}
