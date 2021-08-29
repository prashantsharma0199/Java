package com.prashBasic;
import java.util.Scanner;

// Check whether a number is Armstrong or not
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int original= sc.nextInt();
        Arm(original);
    }

    static void Arm(int nums){
        int num= nums;
        int res_num=0,count=0;

        while (num>0){
            int res= num%10;
            res_num= res_num + (res*res*res);
            num=num/10;
            // System.out.println(res_num);
            count++;
        }
        if(count!=3){
            System.out.println("Invalid number input");
        }
        else if(nums==res_num){
            System.out.println("It is an Armstrong number");
        }
        else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
