package com.company.arr;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int d = 2;
        rotateArray(arr, d, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int d, int n) {

        d = d % n;
        int g_c_d = gcd(d, n);
        int i, j, k, temp;
        for (i = 0; i < g_c_d; i++) {
            temp = arr[i];
            j = i;
            while(true){
                k = j +d;
                if( k >= n){
                    k = k - n;
                }
                if(k == i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    private static int gcd(int d, int n) {
        if (n == 0) {
            return d;
        } else {
            return gcd(n, d % n);
        }

    }

}
