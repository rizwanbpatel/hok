package com.company.dynamicprog;

final class CoinFlipRecursion {
    public static void main(String[] args) {
        int[] coins = new int[]{1, 2 ,3};
        int amount = 4;
        System.out.println(getWays(amount, coins, 0));
    }

    private static int getWays(int amount, int[] coins, int level) {
        int sum = 0;
        if (level > coins.length) return 0;
        if (amount < 0) return 0;
        if (amount == 0) {
            return 1;
        }
        for (int i = level; i < coins.length; i++) {
           // System.out.println("call - " + amount + " | " + level + " | " + coins[i] + " | " + (amount - coins[i]) + " | " + i + " | " + sum);
            sum += getWays(amount - coins[i], coins, i);
        }
        return sum;
    }
}
