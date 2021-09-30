package com.company.graph;

public class UniquePath {

    public static void main(String[] args) {

    }

    /*public static int numberOfPaths(List<List<Integer>> a) {
        int row = a.size();
        int col = a.get(0).size();


        if (a.get(0).get(0) == 0) {
            return 0;
        }
        for (int i = 0; i < row; i++) {
            Integer lms = a.get(i).get(0);
            if (lms == 1) {
                a.get(i).get(0) = 1;
            } else
                break;
        }
        for (int i = 1; i < col; i++) {
            Integer rms = a.get(0).get(i);
            if (rms == 1) {
                rms = 1;
            } else
                break;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (a.get(i).get(j) == 0) {
                    continue;
                }
                final Integer rbsc = a.get(i - 1).get(j);
                Integer srsc = a.get(i).get(j);
                if (rbsc == 1) {

                    srsc = srsc + rbsc;
                }

                Integer srbc = a.get(i).get(j - 1);

                if (srbc == 1) {
                    srsc = srsc + srbc;
                }
                return (a.get(row - 1).get(col - 1) == 1) ? a.get(row - 1).get(col - 1) : 0;
            }
        }

        return 0;
    }*/
}
