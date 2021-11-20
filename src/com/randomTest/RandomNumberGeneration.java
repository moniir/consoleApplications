package com.randomTest;

import java.util.Random;

public class RandomNumberGeneration {

    public static void main(String[] args){
        Random ra = new Random();
        int randomNumber = ra.nextInt(5-1)+1;
        System.out.println(randomNumber);
    }
}
