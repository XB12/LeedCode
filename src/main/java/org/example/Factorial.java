package org.example;

/**
 * 阶乘（递归）
 */
public class Factorial {

    public int factorial (int n) {

        if(n==1){
            return 1;
        }else {
            return n * factorial(n-1);
        }

    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(3));
    }


}
