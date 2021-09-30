package com.company.puzzle;

import java.util.Scanner;

public class Samurai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int n_sqr = n * n;

        int M = (n_sqr - 1) - n;

        int doubl_M = M * 2;


        final int standing = (n_sqr - 1) - doubl_M;
        System.out.println(standing);

    }
}
