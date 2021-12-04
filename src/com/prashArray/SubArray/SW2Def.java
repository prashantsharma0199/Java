package com.prashArray.SubArray;

import java.util.*;

public class SW2Def {
    public static void main(String[] args) {
        int[] arr={12, -1, -7, 8, -16, 30, 16, 28};
        int windowSize= 3;
        SW(arr, windowSize);
    }


    public static void SW(int[] arr, int k){
        Queue<Integer> queue= new LinkedList<>();
        int i=0;
        int j=0;
        while(j< arr.length){
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }

            else if(j-i+1==k){
                if(queue.isEmpty()){
                    System.out.println(0);
                }
                else if(arr[i]== queue.peek()) {
                    System.out.println(arr[i]);
                    queue.remove();

                }
                else{
                    System.out.println(queue.peek());
                }
                i++;
                j++;
            }
//            System.out.println(queue);
        }
    }
}
