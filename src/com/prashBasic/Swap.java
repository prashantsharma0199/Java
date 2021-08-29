package com.prashBasic;

import java.util.Scanner;

public class Swap {
    int a, b;

    public static void main(String[] args) {
        Swap sw= new Swap();
        Scanner sc= new Scanner(System.in);

        sw.a= sc.nextInt();
        sw.b= sc.nextInt();

        System.out.println("Before: "+sw.a+" "+ sw.b);
        swap(sw);
        System.out.println("After:  "+sw.a+" "+ sw.b);

    }

    static void swap(Swap ref){
        // with 3 variables
        // int temp;
        // temp= ref.a;
        // ref.a= ref.b;
        // ref.b= temp;

        // without using third variable
        ref.a= ref.a +ref.b;
        ref.b= ref.a- ref.b;
        ref.a= ref.a- ref.b;
    }
}
