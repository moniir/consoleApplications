package com.faang;

import java.util.Stack;

public class MinimumBracketToClose {

    public static void main(String[] args) {
        String str = "a)bc(d)";
        System.out.println(validString(str));
    }

    public static String validString(String str){
        if(str == null || str == "")
            return str;
        else {
            Stack<Integer> stack = new Stack<>();
            char strCharArray[] = str.toCharArray();
            Integer index = 0;
            for (int i=0;i<strCharArray.length;i++){
                if(strCharArray[i] == '('){
                    stack.push(i);
                } else if(strCharArray[i] == ')' && !stack.empty()){
                    stack.pop();
                } else if(strCharArray[i] == ')' && stack.empty()){
                    strCharArray[i] = '\0';
                }
            }

            while (stack.size()>0){
                int currentIndx = stack.pop();
                strCharArray[currentIndx] = '\0';
            }

            return String.valueOf(strCharArray);
        }
    }
}
