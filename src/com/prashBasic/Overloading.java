package com.prashBasic;
import java.util.Arrays;

// Method Overloading takes place when different functions have same names but different types or number of parameters
// At compile time it decides which function to run
// Demonstrates compile time polymorphism

public class Overloading {
    public static void main(String[] args) {
        func();
        func(100);
        func(10,20,30,40);
        func("Prashant Sharma");
    }

    static void func(int ...var){
        System.out.println(Arrays.toString(var));
    }

    static void func(){
        System.out.println("No parameters passed");
    }

    static void func(int a){
        System.out.println(a);
    }

    static void func(String str){
        System.out.println(str);
    }


}
