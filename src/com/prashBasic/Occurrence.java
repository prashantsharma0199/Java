package com.prashBasic;
import java.util.Scanner;

// Counting occurrences of a number

public class Occurrence{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n= sc.nextLong();
        System.out.print("\nEnter the number you want to find occurrences of: ");
        int val= sc.nextInt();

        long num= n, count=0, res;

        while(num>0){
            res= num%10;
            if(res==val){
                count++;
            }
            num=num/10;
        }

        System.out.println("\n"+val+" is occurring "+count+" times.");

    }
}
