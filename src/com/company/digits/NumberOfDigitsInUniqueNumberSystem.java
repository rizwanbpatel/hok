package com.company.digits;

import java.util.Scanner;

/**
 * Unique number system consist of 1,2,3
 * Find digits in Nth term of the number formed as 1,2,3,11,12,13,21,22,23,31,32,33....
 * N -> Nth term -> Digits
 * 1 -> 1
 * 4 -> 11 -> 2
 * 14 ->112 -> 3
 */
public class NumberOfDigitsInUniqueNumberSystem {


    static int baseConversion(long arr[], long num, int base) {

        int i = 0;
        long rem;
        if(num == 0){
            return 0;
        }

        int noOfDigits = 0;
        while(num > 0){
            rem = num % base;
            arr[i++] = rem;
            num /=base;
            noOfDigits ++;
        }
        return noOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long arr[] = new long[100000];

            final int numberOfDigits = baseConversion(arr, N, 3);
            System.out.println(numberOfDigits);
        }
    }


}
