package com.practice.interview;

public class CheckAnagramWithoutSorting {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int k : count) {
            if (k != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "rac";
        System.out.println(isAnagram(str1, str2));
    }
}
