package com.ClassRoom.String;

public class PalindromeOfString {
    public static void main(String[] args) {
        String str="abb";
       // str=str.toLowerCase();
        boolean res=palindrome1(str);
        System.out.println("Result1:"+res);

        String res2=palindrome2(str);
        System.out.println("Result2:"+res2);

    }

    public static boolean palindrome1(String str){
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            rev=rev+ch;
        }
        if (str.equals(rev)){
            return true;
        }
        else
            return false;

    }

    public static String palindrome2(String str){
        int i=0;
        int j=str.length()-1;
        for (;i<=j;i++){
            if (str.charAt(i)!=str.charAt(j)){
                return "Not Palindrome";
            }
            j--;
        }

        return "Palindrome";
    }
}
