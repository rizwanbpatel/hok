package com.company.arr;

import java.util.Arrays;
import java.util.List;

final class MaxSumSubArray {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-2, 1, -3, 4, -1, 2, 1, 6, -5, 4};
        System.out.println(solution(arr));
}

    static int solution(Integer[] arr) {
        List<Integer> a = Arrays.asList(arr);
        int max = a.get(0);
        int current_max = a.get(0);

        for (int i = 1; i < a.size(); i++) {
            System.out.print("ce :"+ a.get(i) +" cm : "+current_max);
            current_max = Math.max(a.get(i), current_max + a.get(i));
            System.out.print(" [new cm] "+ current_max);

            max = Math.max(max, current_max);
            System.out.print(" max :"+ max);
            System.out.println();

        }

        return max;
    }
}
