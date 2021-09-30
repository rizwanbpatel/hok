package com.company.arr;

public class MaxOccurranceOfCharcter {

    static final int CHARSETS = 256;

    public static void main(String[] args) {
        String s1 = "abcdabcdaba";
        String s2 = "aaa 111112222222222222";

        System.out.println(getMaximumTimeOccuringCharacter(s1));
        System.out.println(getMaximumTimeOccuringCharacter(s2));
    }

    private static char getMaximumTimeOccuringCharacter(String candidateString) {
        int[] count = new int[CHARSETS];
        int len = candidateString.length();
        for (int i = 0; i < len; i++) {
            count[candidateString.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if(max < count[candidateString.charAt(i)]){
                max = count[candidateString.charAt(i)];
                result = candidateString.charAt(i);
            }
        }
        return result;
    }
}
