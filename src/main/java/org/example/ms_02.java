package org.example;

import java.util.Arrays;

import static java.lang.Math.min;

public class ms_02 {

    public static boolean CheckPermutation(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }
//        int [] str1 = new int[s1.length()];
//        int [] str2 = new int[s2.length()];
//        for (int i = 0; i < s1.length(); i++) {
//            str1[i] = s1.charAt(i);
//        }
        char[] str1 = s1.toCharArray();

//        for (int j = 0; j < s2.length(); j++) {
//            str2[j] = s2.charAt(j);
//        }

        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


    public static void main(String[] args) {
        System.out.println(CheckPermutation("sasds", "adsss"));
    }
}
