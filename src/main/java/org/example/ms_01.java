package org.example;

import java.util.HashMap;

public class ms_01 {
    public boolean isUnique(String astr) {
        HashMap map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < astr.length(); i++) {
            if(!map.containsKey(astr.charAt(i))) {
                map.put(astr.charAt(i),count);
            }else {
                return false;
            }
        }

        return true;

    }
}
