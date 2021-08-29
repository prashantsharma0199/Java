package com.prashBasic;
import java.util.Scanner;

// Check whether a number is Prime or not
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c= 2;
        while(c*c<= n){
            if (n%c== 0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        else {
            return false;
        }
    }
}
