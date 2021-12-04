package com.prashRecursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str="abcd";
//        Per("",str);
//        System.out.println(ListPer("",str).size());
        System.out.println(ListPer("",str));

    }

    public static void Per(String res, String str){
        if(str.isEmpty()){
            System.out.print(res+", ");
            return;
        }
        char ch=str.charAt(0);
        for(int i=0; i<=res.length(); i++){
            Per(res.substring(0,i)+ch+res.substring(i), str.substring(1));
        }

    }

    public static ArrayList<String> ListPer(String res, String str){
        if(str.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        char ch=str.charAt(0);
        for(int i=0; i<=res.length(); i++){
            ans.addAll(ListPer(res.substring(0,i)+ch+res.substring(i), str.substring(1)));
        }

        return ans;
    }
}
