package com.az;

public class HelloWorld {

    public static int showIndex(int []a,int n){
        int p=0;
        for(int i=0;i<a.length;i++){
            int k=1;
            while(k<a.length && (a[i]+a[k])!=(n-30)){
                k=k+1;
            }
            if(k<a.length &&a[i]+a[k]==n-30){
                 p=i+k;
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        System.out.println("Hello: "+showIndex(new int[]{20,70,90,30,60,110},110));
        System.out.println("Hi: "+showIndex(new int[]{1,10,25,35,60},90));
    }

}
