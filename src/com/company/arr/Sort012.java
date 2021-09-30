package com.company.arr;

import java.util.Arrays;

/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 0, 1, 0, 1, 2};
        sort012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] arr, int length) {
        int lo=0, mid=0, temp = 0;
        int hi = length - 1;
        while(mid <= hi){
            switch (arr[mid]){
                case 0:
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
            }
        }

    }


}

