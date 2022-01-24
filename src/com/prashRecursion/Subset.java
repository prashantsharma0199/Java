package com.prashRecursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String str="cca";
//        formSubset("", str);
        System.out.println(retSubset("", str));

//        int[] arr={3,2,2};
//        System.out.println(getmeSubset(arr));
//        System.out.println(DupSubset(arr));
    }

    //Get me all possible subsets
    //recursive approach
    public static void formSubset(String ans, String str){
        if(str.isEmpty()){
            if(ans.equals("")){
                return;
            }
            System.out.print(ans+", ");
            return;
        }

        char ch= str.charAt(0);
        formSubset(ans+ch, str.substring(1));
        formSubset(ans, str.substring(1));
    }

    public static ArrayList<String> retSubset(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            if(ans.equals("")){
                return list;
            }
            list.add(ans);
            return list;
        }

        char ch= str.charAt(0);
        ArrayList<String> list1=retSubset(ans+ch, str.substring(1));
        ArrayList<String> list2=retSubset(ans, str.substring(1));
        list1.addAll(list2);
        return list1;
    }

    //Iterative approach
    public static ArrayList<ArrayList<Integer>> getmeSubset(int[] arr){
        ArrayList<ArrayList<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i=0; i<arr.length; i++){
            int n= outer.size();
            for(int j=0; j< n; j++){
                ArrayList<Integer> inner= new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    //For removing duplicate cases
    public static ArrayList<ArrayList<Integer>> DupSubset(int[] arr){
        ArrayList<ArrayList<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0; i<arr.length; i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end= outer.size()-1;
            int n= outer.size();
            for(int j=start; j< n; j++){
                ArrayList<Integer> inner= new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

}
