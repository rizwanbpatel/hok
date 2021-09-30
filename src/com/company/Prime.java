package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Prime {

    public static void main(String[] args) {
      /*  int x = 5, y =10;
        x = x ^ y ^ ( y =x);
        System.out.println(String.format("x = %s, y = %s", x, y));
*/

        Set<Integer> aSet = new HashSet<>(Arrays.asList(1,1,2,2,3,3,3,4,5,6,7,7,8,9,0));
        System.out.println(aSet);


        int i = 010;
        int j = 07;
        System.out.println(i+" "+j);


    }
}
