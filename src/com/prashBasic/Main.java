package com.prashBasic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //Taking a char input
        char ch= sc.next().trim().charAt(0);
        System.out.println(ch);
    }
}
