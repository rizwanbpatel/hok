package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

public class MaxSumRectangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m ; i++){
            for (int j=0; j<n ;j++){
                mat[i][j] = s.nextInt();
            }
        }

        System.out.println("Loaded matrix is : ");
        System.out.println();
        for (int i = 0; i < m ; i++){
            for (int j=0; j<n ;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println(maxSumSubMatrix(mat, 2));

    }
    public static int maxSumSubMatrix(int[][] matrix, int k){
        int result = 0;

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        result = Integer.MIN_VALUE;

        for(int c1 = 0; c1 < n; c1++){
            int[] each = new int[m];
            for(int c2 = c1; c2 >= 0 ; c2--){

                for(int r = 0; r<m; r++){
                    each[r] += matrix[r][c2];
                }

                result = Math.max(result, getLargestSumCloseToK(each, k));
            }
        }
        return result;
    }

    private static int getLargestSumCloseToK(int[] each, int k) {
        int sum = 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        int result = Integer.MIN_VALUE;
        set.add(0);

        for(int i=0; i <each.length; i++){
            sum = sum + each[i];
            Integer ceiling = set.ceiling(sum - k);
            if(ceiling != null){
                result = Math.max(result, sum - ceiling);
            }
            set.add(sum);
        }

        return result;
    }
}
