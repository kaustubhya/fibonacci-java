package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the nth position ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
//        as we already know a and b
        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count ++;
        }
        System.out.println("Hence, te fibonacci number at " + n + " position is " + b);

//         the fibonacci series for confirmation is :- 0,1,1,2,3,5,8,13,21,34,55,89,.......
//        also, the counting here starts from 0;
    }
}
