package com.company.dynamicprog;

/**
 * Given two sequences, find the length of longest subsequence present in both of them.
 * A subsequence is a sequence that appears in the same relative order,
 * but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc
 * are subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.
 * <p>
 * It is a classic computer science problem, the basis of diff
 * (a file comparison program that outputs the differences between two files),
 * and has applications in bioinformatics.
 * <p>
 * <p>
 * Examples:
 * LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */
final class LongestCommonSubsequence {
    public static void main(String[] args) {
        String left = "AGGTAB";
        String right = "GXTXAYB";

        int llen = left.length();
        int rlen = right.length();

        long cm = System.nanoTime();
        System.out.println("LCS Length LCM [" + left + "|" + right + "] - > " + lcsM(left.toCharArray(), right.toCharArray(), llen, rlen));
        System.out.println("Time : " + (System.nanoTime() - cm));

        long cm1 = System.nanoTime();
        System.out.println("LCS Length LC [" + left + "|" + right + "] - > " + lcs(left.toCharArray(), right.toCharArray(), llen, rlen));
        System.out.println("Time : " + (System.nanoTime() - cm1));
    }

    //483438, 479206, 579350, 472507, 423846

    //divide n conquor
    //450645 , 543030 , 345918, 447119, 598038
    private static int lcs(char[] left, char[] right, int llen, int rlen) {

        if (llen == 0 || rlen == 0) {
            System.out.println("0->"+llen+"|"+rlen);
            return 0;
        } else if (left[llen - 1] == right[rlen - 1]) {
            System.out.println("EQ|"+llen+"|"+rlen+"|"+left[llen-1]+"|"+right[rlen-1]);
            return 1 + lcs(left, right, llen - 1, rlen - 1);
        } else {
            System.out.println("NEQ|"+llen+"|"+rlen+"|"+left[llen-1]+"|"+right[rlen-1]);
            return Math.max(lcs(left, right, llen, rlen - 1), lcs(left, right, llen - 1, rlen));
        }

    }

    /**
     * With Memoization
     */
    private static int lcsM(char[] left, char[] right, int llen, int rlen) {
        int L[][] = new int[llen + 1][rlen + 1];
        for (int i = 0; i <= llen; i++) {
            for (int j = 0; j <= rlen; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (left[i - 1] == right[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                    System.out.print(left[i - 1] + "|" + right[j - 1] + "|" + i+ "|"+j+"|"+L[i][j]);
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
            System.out.println();
        }
        return L[llen][rlen];
    }

    private static int lcsubM(char[] left, char[] right, int llen, int rlen) {
        int L[][] = new int[llen + 1][rlen + 1];

        for (int i = 0; i < llen; i++) {
            for (int j = 0; j < rlen; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (left[i - 1] == right[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        return L[llen][rlen];
    }

}
