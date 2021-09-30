package com.company;

/**
 * @author patelri
 */
public class Coll {
    static int MAX_CAP =  1 << 30;
    public static void main(String[] args) {


        System.out.println(MAX_CAP);

        tableSizeFor((int)(16/0.75f) + 1);

        System.out.println(118 & 15);

    }

    static final int tableSizeFor(int cap) {
        System.out.println(cap);
        int n = cap - 1;
        int k = n;
        k = k >>> 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n);
        return (n < 0) ? 1 : (n >= MAX_CAP) ? MAX_CAP : n + 1;
    }

}
