package com.company.arr;

import java.util.ArrayList;

public class StockBuySell {

    public static void main(String[] args) {
        int[] sp = {100, 180, 400, 310, 340, 80, 695 };
        stockBuySell(sp, sp.length);
    }

    private static void stockBuySell(int[] sp, int n) {
        if (n == 1) {
            return;
        }
        int count = 0;
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();

        int i = 0;
        while (i < n - 1) {
            //find local minima
            while ((i < n - 1) && (sp[i + 1] <= sp[i])) {
                i++;
            }
            if (i == n - 1) {
                break;
            }
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(i++);

            //Find local maxima
            while ((i < n) && (sp[i] >= sp[i - 1])) {
                i++;
            }
            pair.add(i - 1);
            sol.add(pair);
            count++;
        }

        sol.forEach(System.out::println);
    }
}
