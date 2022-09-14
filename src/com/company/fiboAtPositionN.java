package com.company;

public class fiboAtPositionN {

    public static void main(String [] args){

//        for(int i = 1; i < 11; i++){
//            System.out.println(fiboFormula(i));
//        }
        System.out.println(fiboFormula(50));

    }

    static long fiboFormula(long n){
        // just for demo, use long instead
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2) , n) / Math.sqrt(5));
    }

    static int fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }

        // this is not tail recursion, as it involves the additional steps of adding and returning
        return fibo(n - 1) + fibo(n - 2);
    }
}
