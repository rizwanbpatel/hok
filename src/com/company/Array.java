package com.company;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        int[][] A = new int[3][4];
        A[0] = new int[] {1,2,3,4};
        A[1] = new int[] {5,6,7,8};
        A[2] = new int[] {9,10,11,12};

        ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
        ArrayList a1 = new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        AL.add(a1);

        ArrayList a2 = new ArrayList();
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);

        AL.add(a2);

        ArrayList a3 = new ArrayList();
        a3.add(9);
        a3.add(10);
        a3.add(11);
        a3.add(12);

        AL.add(a3);



    ArrayList<ArrayList<Integer>> B = performOps(AL);
    for (int i = 0; i < B.size(); i++) {
        for (int j = 0; j < B.get(i).size(); j++) {
            System.out.print(B.get(i).get(j) + " ");
        }
    }
    }

   public static  ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }

}
