package com.prashBasic;
import java.util.Arrays;

// Variable length arguments
public class VarArgs {
    public static void main(String[] args) {
        // it can have 0 parameters or 100+ parameters
        func(10,20,30,40,50,60,70);
    }

    // var is implicitly declared as an array of int
    // variable length arguments should always be at the end
    // eg: func(int a, int ...var, int b) results in an error
    static void func(int ...var){
        System.out.println(Arrays.toString(var));
    }
}
