package com.tracks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    /*public static void main(String[] args) {
   //     for (int i = 0, l = args.length; i < l; i++) {
            try {
                String fileName = "C:\\Users\\monir\\Desktop\\input.in.txt";
                File file = new File(fileName);
                FileReader filereader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(filereader);

                String data;
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                }

                filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

          *//*  try {
                File file = new File(args[i]);
                FileReader filereader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(filereader);

                String data;
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                }

                filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*//*
       // }
    }*/




    public static void main(String[] args) {
        for (int i = 0, l = args.length; i < l; i++) {
          //  String output = String.format("argv[%s]: %s", i, args[i]);
            String output = String.format("%s",  args[i]);
            System.out.println("Hello "+retStr(output));
            //System.out.println(output);
        }
    }
    public static String retStr(String str){
        return str;
    }
}