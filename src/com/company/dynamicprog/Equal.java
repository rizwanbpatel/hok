package com.company.dynamicprog;

import java.util.Arrays;

final class Equal {
    public static void main(String[] args) {
        int T = 1;
        int N = 4;
        int[] chocs = new int[]{2, 2, 3, 7};

        int[] array = new int[5];
        System.out.println(array);

        //System.out.println(minpass(chocs));
    }

    private static int minpass(int[] chocs) {


        Arrays.sort(chocs);
        int smallest = chocs[0];
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            int temp = 0;
            for (int j = 0; j < chocs.length; j++) {
                temp += numMinPass(chocs[j] - smallest + i);
            }
            if (temp < answer) {
                answer = temp;
            }
        }
        return answer;
    }

    private static int numMinPass(int n) {
        int result = 0;
        result += n / 5;
        n %= 5;
        result += n / 2;
        n %= 2;
        result += n;
        return result;
    }
}
