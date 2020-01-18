package com.arrayTest;

import java.util.*;

public class Solution {
    //fetching position containing zero
  /*  public static int[] getzeroposi(int[] game){
        int[] zeroarry=new int[game.length];
        for(int j=0,k=0;j<game.length;j++){
            if(game[j]==0){
                zeroarry[k]=j+1; //+1 to avoid 0
                k++;
            }
        }
        return zeroarry;
    }

    public static boolean findposarr(int[] zeropos,int pos){
        for(int j=0;j<zeropos.length;j++){
            if(zeropos[j]==pos){
                return true;
            }
        }
        return false;
    }*/

    public static boolean canWin(int jumpLength, int[] game,int currentPos,int lastJumpPos) {

        boolean didWin=false;

        int range=currentPos;
        while(range<game.length-1 && game[1+range]==0){
            range++;
        }
        if(range==game.length-1){
            return true;
        }

        int lowRange=range;
        while(lowRange>lastJumpPos && game[lowRange-1]==0 && (lowRange+jumpLength)>range+1){
            lowRange--;
        }
        currentPos=lowRange;
        for(int i=currentPos;i<=range;i++){
            if((i+jumpLength)<game.length && game[i+jumpLength]==0 && jumpLength!=0){
                didWin=canWin(jumpLength,game,i+jumpLength,i);
            }
            if(didWin || (i+jumpLength)>=game.length||(i+1)>=game.length){
                didWin=true;
                break;
            }
        }
        return didWin;
        // Return true if you can win the game; otherwise, return false.
        // return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,0,0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}