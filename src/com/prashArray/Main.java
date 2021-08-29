package com.prashArray;

// Notes:
// Array objects in Java may not be continuous ---> Depends on JVM
// Reasons:
// 1) Array objects are in a heap
// 2) Heap objects are not continuous
// 3) Dynamic memory allocation

import java.util.Arrays;
import java.util.Scanner;

//primitives are always stored in stack memory whereas everything except that are stored in heap memory
public class Main {
    public static void main(String[] args) {
        int [] arr; // declaration of array arr, it is defined in the stack
        arr= new int[5]; // initialisation, object is created in the heap memory
        // declaration at compile time and object creation at runtime

        Scanner sc = new Scanner(System.in);

        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Using for loop");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nUsing for each loop");
        for (int num:arr) {
            System.out.print(num+" ");
        }

        System.out.println("\nUsing toString method");
        System.out.println(Arrays.toString(arr));
    }
}
