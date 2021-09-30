package com.company.dynamicprog;

import java.util.ArrayList;
import java.util.List;

final class MinCostPath {

    public static void main(String[] args) {
        int[][] costMat = new int[3][3];
        initCostMatrix(costMat);
        List<Object> ob =new ArrayList<>();

        System.out.println(minCostPath(costMat, 0, 0));
    }

    private static long minCostPath(int[][] costMat, int row, int col) {

        if (row >= costMat.length || col >= costMat[0].length) {
            return Integer.MAX_VALUE;
        } else if (row == costMat.length - 1 && col == costMat[0].length - 1) {
            return costMat[row][col];
        }
        long down = minCostPath(costMat, row + 1, col) + costMat[row][col];
        long right = minCostPath(costMat, row, col + 1) + costMat[row][col];
        long diagonal = minCostPath(costMat, row + 1, col + 1) + costMat[row][col];
        return Math.min(Math.min(right, diagonal), down);
    }

    private static void initCostMatrix(int[][] costMat) {
        costMat[0] = new int[]{1, 2, 3};
        costMat[1] = new int[]{4, 8, 2};
        costMat[2] = new int[]{1, 5, 3};
    }
}
