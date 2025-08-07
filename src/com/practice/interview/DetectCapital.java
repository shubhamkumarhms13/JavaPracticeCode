package com.practice.interview;

public class DetectCapital {
    public static boolean capitalizeTitle(String str) {
        int caps = 0, low = 0, first = 0;
        for(char c: str.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                caps++;
                if(first == 0){
                    first=1;
                }
            }else {
                low++;
                if(first == 0){
                    first = 2;
                }
            }
        }
        if(caps == 0 || low == 0 || caps == 1 && first == 1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("HELLO"));
        System.out.println(capitalizeTitle("leetcode"));
        System.out.println(capitalizeTitle("fLag"));
    }
}
