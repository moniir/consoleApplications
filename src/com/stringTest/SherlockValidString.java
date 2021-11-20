package com.stringTest;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {

    public static String isValid(String s){
        /*Map<Character,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Character c: s.toCharArray()){
            int freq = map.getOrDefault(c,0);
            int newFreq = freq+1;
            map.put(c,newFreq);
            max = Math.max(max,newFreq);
        }
        int countMax = 0, count = 0;
        for(int value: map.values()){
            min = Math.min(value,min);
            if(value == max)
                countMax++;
        }

        if (max - min > 1 || (max != min && countMax > 1))
            return "NO";
        return "YES";*/

        /*
         ***************************************************************
         */
/*
        int prev = Integer.MAX_VALUE;
        boolean flag = true;
        int count=0;

        HashMap<Character ,Integer> map  =new HashMap();
        for(char c:s.toCharArray())
            map.put(c, map.getOrDefault(c,0) + 1);

        prev = map.get(s.charAt(0));
        for(Integer i:map.values()){
            if(i==prev){
                count++;
                continue;

            }else if((Math.abs(i - prev)==1 || (i-1)==0) && flag){
                flag =false;
                count++;
            }
        }
        if(count==map.size())
            return "YES";
        else
            return "NO";*/

        /*
         ***************************************************************
         */
        //count the character frequency and store in map
        Map<Character,Integer> myData = new HashMap<>();
        for(Character c : s.toCharArray())
        {
            int cnt = myData.containsKey(c) ?  myData.get(c): 0;
            myData.put(c,cnt+1);
        }

        //find the minimum and maximum character frequency value
        int min_val = Integer.MAX_VALUE;
        int max_val = 0;
        for (int c : myData.values())
        {
            min_val = Math.min(min_val,c);
            max_val = Math.max(max_val,c);
        }

        int cntMin = 0;
        int cntMax = 0;

        for (int c : myData.values())
        {
            if (c > 0) {
                cntMin += Math.abs(min_val - c);
            }
            if (c < max_val) {
                cntMax += c;
            }
        }
        return (cntMin <= 1 || cntMax <= 1) ? "YES" : "NO";
    }

    public static void main(String[] args){
        String s ="bbddcca";
//        String s ="ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        String result = isValid(s);
        System.out.println(result);
    }
}
