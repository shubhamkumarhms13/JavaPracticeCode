package com.practice.interview;

import java.util.Arrays;

public class CapitaliseEachWordInString {
    public static String CapitaliseEachWord(String str){
        String[] strArray = str.trim().toLowerCase().split("\\s+");
        int l = strArray.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < l; i++){
            char[] ch = strArray[i].toCharArray();
            int len = ch.length;
            for(int j = 0; j < len; j++){
                if((j == 0) && (ch[j] >= 'a' && ch[j] <= 'z')){
                    char c = (char) (ch[j] - 32);
                    sb.append(c);
                }else{
                    sb.append(ch[j]);
                }
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "this is an   elephant";
        System.out.println(CapitaliseEachWord(str));
    }
}
