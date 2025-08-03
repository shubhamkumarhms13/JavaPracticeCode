package stream;

import java.util.Arrays;

public class AnagramChecker {
    public static String cleanString(String str){
        if(str == null){
            return null;
        }
        return str.replaceAll("\\s+","").toLowerCase();
    }
    public static boolean areAnagrams(String str1, String str2) {
        str1 = cleanString(str1);
        str2 = cleanString(str2);
        if(str1 == null || str2 == null || str1.length() != str2.length()){
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static boolean areAnagramsUsingStream(String str1, String str2) {
        str1 = cleanString(str1);
        str2 = cleanString(str2);
        if(str1 == null || str2 == null || str1.length() != str2.length()){
            return false;
        }
        return str1.chars().sorted().mapToObj(ch -> (char) ch).toList()
                    .equals(str2.chars().sorted().mapToObj(ch -> (char) ch).toList());
    }

    public static void main(String[] args) {
        String str1 = "ab a";
        String str2 = "aba";
        boolean areAnagram = areAnagrams(str1, str2);
        boolean areAnagramStream = areAnagramsUsingStream(str1, str2);
        System.out.println("Are they anagrams: " + areAnagram);
        System.out.println("Are they anagrams: " + areAnagramStream);
    }
}
