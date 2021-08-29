package com.prashArray;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] arr= new int[3][3];//defining row is compulsory, columns not so important

        for(int i= 0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){ // if we use these and columns are not defined then null pointer exception will occur
                arr[i][j]= sc.nextInt();
            }
        }

        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
