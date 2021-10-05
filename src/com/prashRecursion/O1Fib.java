package com.prashRecursion;

public class O1Fib {
    public static void main(String[] args) {
        for (int i=0; i<11; i++){
            System.out.print(fib(i)+" ");
        }
    }

    // nth term of a fibonacci series
    // fib(n)= (1/root 5) [((1+root 5)/2)^n - ((1-root 5)/2)^n]

    public static int fib(int n){
        return (int) ((Math.pow(((1+ Math.sqrt(5))/2), n)-(Math.pow(((1- Math.sqrt(5))/2), n))) /Math.sqrt(5));
    }
}
