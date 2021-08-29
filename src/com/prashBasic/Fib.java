package com.prashBasic;
import java.util.Scanner;

// Computing fibonacci series
// Time Complexity: O(n)

public class Fib {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n= sc.nextInt();

        int t1=0, t2=1, new_term=0;

        if(n==1){
            System.out.println("\nThe "+n+" term in the Fibonacci Series is: "+ t1);
            System.exit(0);
        }

        System.out.print("Series is: "+t1+" "+t2);

        for(int i=2; i<n; i++){
            new_term= t1+t2;
            t1=t2;
            t2=new_term;
            System.out.print(" "+t2);
        }

        System.out.println("\nThe "+n+"th term in the Fibonacci Series is: "+ t2);

    }
}
