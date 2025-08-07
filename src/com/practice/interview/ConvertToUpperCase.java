package com.practice.interview;

public class ConvertToUpperCase {
    public static String toLowerCase(String s) {
        if (s == null) return "";
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : charArray) {
            if (ch >= 'a' && ch <= 'z') {
                char c = (char) (ch - 32);
                sb.append(c);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "HELLO4FDGbvcbc";
        System.out.println(toLowerCase(str));
    }

}
