package com.company.dynamicprog;

public class LongestCommonSubSeq {
    static int[][] t;

    public static void main(String[] args) {
        String X = "ACBCF";
        String Y = "ABCDAF";

        int len = lengthOfLcsWithTopDown(X.toCharArray(), Y.toCharArray(), X.length(), Y.length());
        System.out.println("Length of Longest common Subsequence is : {" + len + "} For Strings {" + X + " | " + Y + "}");
    }

    private static int lengthOfLcsWithTopDown(char[] X, char[] Y, int m, int n) {

        t = new int[m + 1][n + 1];
        //Base - Initialization
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        //Choice Graph
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        //Print Graph version
        int i=m, j = n;
        StringBuilder sb = new StringBuilder();
        while(i > 0 && j > 0){
            if(X[i-1] == Y[j-1]){
                sb.append(X[i-1]);
                i--;
                j--;
            }else{
                if(t[i][j-1] > t[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }
        }
        System.out.println("Actual string : "+sb.reverse());

        return t[m][n];
    }
}
