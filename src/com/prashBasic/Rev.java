package com.prashBasic;
import java.util.Scanner;

// Reverse of a number
public class Rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        int num=n, rev=0;

        while (num>0){
            int res= num%10;
            rev= rev*10+ res;
            num= num/10;
        }

        System.out.println("Reverse of "+n+" is "+rev);
    }
}
