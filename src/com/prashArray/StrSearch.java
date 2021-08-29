package com.prashArray;

public class StrSearch {
    public static void main(String[] args) {
        String str="Prashant Sharma";
        char target='s';

        boolean res= check(str, target);

        System.out.println(res);

    }

    static boolean check(String str, char target){
        if(str.length()==0){
            return false;
        }

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)== target){
//                return true;
//            }
//        }

        for (char ch: str.toCharArray()) {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
