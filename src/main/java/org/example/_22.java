package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 示例 1：
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * 输入：n = 1
 * 输出：["()"]
 * 提示：
 * 1 <= n <= 8
 */

/**
 * 暴力解法
 * 递归
 */
public class _22 {
    public static List<String> generateParenthesis(int n) {

        //存放结果
        List<String> result = new ArrayList<String>();

        //递归生成全部组合 new char[2*n] 字符长度最多2n ,pos 字符数组下标 , result 符合筛选条件添加的集合
        generateAll(new char[2*n] , 0 , result);
        return result;
    }

    public static void generateAll(char [] temp , int pos , List<String> resultTemp  ){
        //符合最后一个字符
        if(pos == temp.length){
            //符合筛选条件
            if(sift(temp)){
                resultTemp.add(new String(temp));
            }
        }else {
            temp[pos] ='(';
            generateAll(temp, pos + 1, resultTemp);
            temp[pos] =')';
            generateAll(temp, pos + 1, resultTemp);
        }

    }

    public static boolean sift(char [] temp){
        int flag = 0;
        for (char c : temp) {
            if (c == '('){
                ++flag;
            }else {
                --flag;
            }
            if(flag<0){
                return false;
            }
        }
        return flag==0;
    }


    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }


}
