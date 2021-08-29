package com.prashBasic;
import java.util.Arrays;

// Java only has pass by value

public class Func {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        sum(a,b);
        System.out.println("A and B is: "+a+" and "+b);

        int[] arr={10,20,30,40};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    // For primitive data types it passes the value
    static void sum(int num1, int num2){
        int temp= num1;
        num1= num2;
        num2= temp;
    }


    // For non-primitive data types it passes the value of the reference variable
    // so changes in these results changes in object variable
    static void change(int[] nums){
//        System.out.println(nums);
        nums[0]=99;
    }
}
