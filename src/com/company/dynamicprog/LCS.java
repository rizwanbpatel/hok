package com.company.dynamicprog;

import java.util.HashMap;
import java.util.Map;

public class LCS {
    int lcs(char[] X, char[] Y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X[m - 1] == Y[n - 1]) {
            return 1 + lcs(X, Y, m - 1, n - 1);
        } else {
            return Math.max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n));
        }

    }

    int lcsWithTabulization(char[] X, char[] Y, int m, int n) {
        int[][] L = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        return L[m][n];
    }

    public static void main(String[] args) {
//        LCS lcs = new LCS();
//        String s1 = "bebdeeedaddecebbbbbabebedc";
//        String s2 = "abaaddaabbedeedeacbcdcaaed";
//        char[] X = s1.toCharArray();
//        char[] Y = s2.toCharArray();
//        int m = X.length;
//        int n = Y.length;
//        long time = System.nanoTime();
//        System.out.println("Length of LCS is : " + lcs.lcsWithTabulization(X, Y, m, n));
//        System.out.println("Time taken : "+ (System.nanoTime() - time));

        Map<Customer, String> map = new HashMap<>();
        Customer c = new Customer();
        c.setId(1);
        c.setName("One");
        map.put(c,"One");
        c.setId(2);
        c.setName("two");
        map.put(c,"Two");
        System.out.println(map.get(c));

        Customer c1 = new Customer();
        c1.setId(1);
        c1.setName("One");
        //map.put(c1,"Three");
        System.out.println(map.get(c1));

        map.forEach((customer, s) -> System.out.println(customer.id +" | "+ s));
    }
}
