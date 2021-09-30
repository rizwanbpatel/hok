package com.company.arr;

import java.util.Arrays;

public class LargestUniqueSubString {

    public static final int NO_OF_CHARS = 256;

    static int longestUniqueSubSting(String str) {
        int n = str.length();
        int res = 0;
        int[] lastIndex = new int[NO_OF_CHARS];
        Arrays.fill(lastIndex, -1);

        //Initialize start of current window
        int i = 0;


        System.out.println("Pass  | res | i |  j | c | lastIndex[c]" );
        //Move end of current window
        for (int j = 0; j < n; j++) {
            //find the last index of str[j] Update i (starting index of crrent window)
            // as max of current value of i and last index plus 1
            char c = str.charAt(j);
            i = Math.max(i, lastIndex[str.charAt(j)] + 1);

            //Update result if we get a larger window
            res = Math.max(res, j-i +1 );

            //update last index of j
            lastIndex[str.charAt(j)] = j;

            System.out.println(""+ (j+1) +" | "+ res +" | "+ i +" | "+ j +" | "+ c +" | "+ lastIndex[c] );

        }
        return res;

        }

    public static void main(String[] args) {
        String str  = "abcdbacba";
        int len = longestUniqueSubSting(str);
        System.out.println("lenth of longest not repeating substring  : "+ len);

    }
}
