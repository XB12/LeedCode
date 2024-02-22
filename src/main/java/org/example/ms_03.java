package org.example;

public class ms_03 {
//    public String replaceSpaces(String S, int length) {
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            if(S.charAt(i) == ' ') {
//                sb.append("%20");
//            }else {
//                sb.append(S.charAt(i));
//            }
//        }
//        return sb.toString();
//    }

    /**
     * 法二
     */
    public static String replaceSpaces(String S, int length) {
        return S.substring(0, length).replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpaces("ad da   ", 6));
    }

}
