package com.company.arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class NobleInteger {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, -9, 8, 5, -1, 7, 5, 3};
        //Integer[] arr = new Integer[]{ -4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5};

        List<Integer> a = Arrays.asList(arr);
        System.out.println(solveIndex(a));
    }

    public static int solve(List<Integer> A) {
        int p = -1;
        Collections.sort(A);
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > A.size()) {
                p = -1;
                break;
            }
            int currentElement = A.get(i);
            int counter = currentElement;
            for (int j = i + 1; j < A.size(); j++) {
                if (currentElement < A.get(j)) {
                    counter--;
                }
            }
            if (counter == 0) {
                p = 1;
                break;
            }
        }
        return p;
    }

    public static int solveIndex(List<Integer> A) {
        int p = -1;
        Collections.sort(A);
        int size = A.size();
        for (int i = 0; i < A.size() -1 ; i++) {
            if(A.get(i) == A.get(i+1)){
                continue;
            }
            if (A.get(i) == size - i - 1) {
                p = 1;
                break;
            }
        }
        return p;
    }
}
