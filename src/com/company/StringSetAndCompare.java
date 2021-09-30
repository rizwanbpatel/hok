package com.company;

import java.util.Scanner;

/**
 * Two string A & B of equal length only 0 and 1
 * Q queries to follow set bit to 1 for given index i in query
 * Compare B with A lexicographically print Yes if it bigger or equal else print NO
 */
public class StringSetAndCompare {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();
        String A = sc.nextLine();
        String B = sc.nextLine();
        sb.append(B);

        for (int i = 0; i < Q; i++) {
            int index = sc.nextInt();
            System.out.println(isLexicographicallyGreater(A, index));
        }

    }

    private static String isLexicographicallyGreater(String A, int index) {

        setCharInBStringAt(index);

        if (sb.toString().compareTo(A) >= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static void setCharInBStringAt(int index) {
        char c = sb.charAt(index - 1);
        c |= 1;
        sb.setCharAt(index - 1, c);
    }
}
