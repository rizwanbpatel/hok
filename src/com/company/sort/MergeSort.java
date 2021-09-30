package com.company.sort;

import java.util.Arrays;

/**
 * Divide n conquer
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={3, 1, 5, 11, 2, 7};
       System.out.println(Arrays.toString(arr));
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int n) {
        if (n < 2)
            return;

        int mid = n / 2;
        int[] L = new int[mid];
        int[] R = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            L[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            R[i - mid] = arr[i];
        }
        mergeSort(L, mid);
        mergeSort(R, n - mid);

        merge(arr, L, R, mid, n - mid);
    }

    private static void merge(int[] arr, int[] L, int[] R, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        while(i < left){
            arr[k++] = L[i++];
        }
        while(j < right){
            arr[k++] = R[j++];
        }
    }



}
