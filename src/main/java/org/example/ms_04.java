package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ms_04 {
    public static boolean canPermutePalindrome(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(String.valueOf(s.charAt(i)))){
                map.put(String.valueOf(s.charAt(i)),map.get(String.valueOf(s.charAt(i))) + 1) ;
            }else {
                map.put(String.valueOf(s.charAt(i)),1);
            }
        }
        List<Integer> collect = map.values().stream().collect(Collectors.toList());
        for (int j = 0; j < collect.size(); j++) {
            if(collect.get(j)%2 != 0){
                count++;
            }
        }
        return count<=1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("aabc"));
    }
}
