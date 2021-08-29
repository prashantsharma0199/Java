package com.prashBasic;

public class Shadowing {
    static int x= 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        // results in error if we try to access b/w initialisation and declaration
        // System.out.println(x);
        x=50;
        System.out.println(x);
        // Shadowing is using variables in overlapping scopes where low-level scope overrides the variable of high-level scope
        func();
    }
    static void func(){
        System.out.println(x);
    }
}
