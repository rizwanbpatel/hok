package com.company.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddSubtract {


    public static void main(String[] args) {
        int T, N, K;
        Scanner s = new Scanner(System.in);

        T = s.nextInt();

        while(T-- > 0){
            N = s.nextInt();
            K = s.nextInt();

            int[] num = new int[N];
            for(int i = 0;i < N; i++){
                num[i] = s.nextInt();
            }

            List<Integer> costList = new ArrayList<>();
            int minCost = Integer.MAX_VALUE;
            for(int i = 1; i<= 100 ; i++){
                int cost = 0;
                for(int j=0; j <N;j++){
                    if(i >= num[j]){
                        cost = (i - num[j]) * 3;
                    }else {
                        cost = (num[j] - i) * 5;
                    }
                    costList.add(cost);
                }
                Collections.sort(costList);
                cost = 0;

                for(int j=0; j<K;j++){
                    cost += costList.get(j);
                }

                minCost = Math.min(minCost,cost);
            }
            System.out.println(minCost);
        }

    }
}
