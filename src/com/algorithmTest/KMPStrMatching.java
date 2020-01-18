package com.algorithmTest;

public class KMPStrMatching {

    void KMPSearch(String pat, String text){
        boolean found = false;
        int lps[] = createTempArray(pat);
        int i=0,j=0;  //i-> text;j-> pattern
        while(i<text.length()){
            if(text.charAt(i)==pat.charAt(j)){
                ++i;++j;
            } else {
                if(j!=0){
                    j=lps[j-1];
                } else {
                    ++i;
                }
            }
        }
        if(j==pat.length()){
            found=true;
            System.out.println("index: "+(i-pat.length()));
            j=lps[j-1];
        }
        if(!found)
            System.out.printf("Not Found");
       /* for (int s: lps) {
            System.out.printf(s+" ");
        }*/
    }

    public int[] createTempArray(String pat) {
        int lps[] = new int[pat.length()];
        int index =0;
        for(int i=1;i<pat.length();){
            if(pat.charAt(index)== pat.charAt(i)){
                lps[i]=index+1;
                ++i;++index;
            } else {
                if(index!=0){
                    index = lps[index-1];
                }
                else {
                    lps[i]= index;
                    ++i;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        new KMPStrMatching().KMPSearch(pat, txt);
    }
}
