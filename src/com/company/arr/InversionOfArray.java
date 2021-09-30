package com.company.arr;

import java.util.Arrays;

/**
 * Given an array of integers. Find the Inversion Count in the array.
 * <p>
 * Inversion Count: For an array, inversion count indicates how far (or close) the array is
 * from being sorted. If array is already sorted then the inversion count is 0.
 * If an array is sorted in the reverse order then the inversion count is the maximum.
 * Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 */
public class InversionOfArray {
    public static void main(String[] args) {
        long[] arr = new long[]{1, 20, 6, 4, 5};
        long n = inversionCount(arr, arr.length);
        System.out.println(n);
        long count = mergeSortAndCount(arr, 0, arr.length - 1);
        System.out.println(count);
    }

    private static long inversionCount(long[] arr, int length) {
        int i, j;
        int count = 0;
        for (i = 0; i < length - 1; i++) {
            for (j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static long mergeSortAndCount(long[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;

            count += mergeSortAndCount(arr, l, m);

            count += mergeSortAndCount(arr, m + 1, r);

            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    private static int mergeAndCount(long[] arr, int l, int m, int r) {
        long[] left = Arrays.copyOfRange(arr, l, m + 1);
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                swaps += (m+1) - (l+i);
            }
        }

        return swaps;
    }
}
