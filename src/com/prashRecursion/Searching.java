package com.prashRecursion;

import java.util.ArrayList;

public class Searching {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 30};
        int target=30;
        System.out.println(LinearSearch(arr, 0, target));
        System.out.println();
        manySearch(arr, 0, target);
        System.out.println(findAll(arr, 0, target));
    }

    // for single occurence
    public static int LinearSearch(int[] arr, int index, int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return LinearSearch(arr, index+1, target);
    }

    // for multiple occurences
    public static void manySearch(int[] arr, int index, int target){
        if(index==arr.length){
            return;
        }
        if(arr[index]== target) {
            System.out.println(index);
        }
        manySearch(arr, index + 1, target);
    }

    public static ArrayList<Integer> findAll(int[] arr, int index, int target){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        ArrayList<Integer> calls = findAll(arr, index+1, target);
        if(arr[index]== target){
            calls.add(index);
        }
        return calls;
    }
}
