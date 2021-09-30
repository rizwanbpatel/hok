package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

final class VowelReversal {


    Scanner s;

    public VowelReversal(){
        s = new Scanner(new BufferedReader( new InputStreamReader(System.in)));
    }


    public String readString(){
        return s.nextLine();
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String reversVowel(String str){
        int l = 0;
        int r = str.length() - 1 ;
        while(l < r){

            while(l < r && !isVowel(str.charAt(l))){
                l++;
            }

            while(l < r && !isVowel(str.charAt(r))){
                r--;
            }
            if (l < r){
                str = swap(str, l, r);
                l++;
                r--;
            }
        }

        System.out.println(str);
        return str;
    }

    private String swap(String str, int l, int r) {
        System.out.println("Swapping : "+l+" "+r);
        char[] ca = str.toCharArray();
        char temp = ca[l];
        ca[l] = ca[r];
        ca[r] = temp;
        return new String(ca);
    }


}
