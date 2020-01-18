package com.arrayTest;

public class SubStrPalindrome {

    public static int longestPalSubstr(String str){

        int strLen = str.length();

        boolean truthTbl[][] = new boolean[strLen][strLen];

        //All substring of length 1 are palindrome
        //maxLength is 1
        int maxLength =1;
        for(int i=0;i<strLen;i++){
            truthTbl[i][i] = true;
        }
        //checking substring of length 2
        int start =0;
        for(int i=0;i<strLen-1;++i){
            if(str.charAt(i)==str.charAt(i+1)){
                truthTbl[i][i+1]=true;
                start =i;
                maxLength =2;
            }
        }
        //check for length grater than 2. grater than 2 is starts from k
        for(int k=3;k<=strLen;++k){

            //Fix the starting index
            for(int i=0; i<strLen-k+1;++i){
                //Get the ending index
                int j = i+k-1;
                char s11 = str.charAt(i);
                char s21 = str.charAt(j);
                boolean bool = truthTbl[i+1][j-1];
                if(truthTbl[i+1][j-1] && str.charAt(i)==str.charAt(j)) {
                    truthTbl[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }

        }
        System.out.print("Longest palindrome substring is; ");
        printSubStr(str, start, start + maxLength - 1);

        return maxLength; // return length of LPS
    }
    // A utility function to print a substring str[low..high]
    static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }

    public static void main(String[] args) {

//        String str = "forgeeksskeegfor";
        String str = "geekeg";
        System.out.println("Length is: " +
                longestPalSubstr(str));
    }
}
