package com.company.dynamicprog;

import java.util.Scanner;

public class CoinFlip {

    static long getWays(int amount, int[] coins) {
        long[] combinations = new long[amount + 1];

        combinations[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i < combinations.length; i++) {
                if (i >= coin) {
                    combinations[i] += combinations[i - coin];
                }
            }
        }
        return combinations[amount];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] c = new int[m];
        for (int c_i = 0; c_i < m; c_i++) {
            c[c_i] = in.nextInt();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
