package com.prashArray;
import java.util.ArrayList;
import java.util.Scanner;

// 1D array list
public class AList {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>(5);
        Scanner sc= new Scanner(System.in);

//        for(int i=0; i<5; i++){
//            list.add(i, sc.nextInt());
//        }

        // adding an element into the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // checking whether and element is there in the list
        System.out.println(list.contains(10));

        // remove element from the list at a particular index
        list.remove(4);
        System.out.println(list);

        // update the value of a particular item in the list
        list.set(0, 100);
        System.out.println(list);

        // list[i] syntax does not work over here
        // System.out.println(list[1]);

        // getting the value at particular index
        System.out.println(list.get(1));
    }
}
