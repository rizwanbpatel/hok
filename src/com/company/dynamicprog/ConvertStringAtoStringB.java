package com.company.dynamicprog;

public class ConvertStringAtoStringB {
    public static void main(String[] args) {
        String A = "rizwan";
        String B = "nisar";


        System.out.println(getMinStepsToConvertAToB(A, B, A.length(), B.length()));
    }

    private static int getMinStepsToConvertAToB(String a, String b, int m, int n) {
        if (m == 0) return n;
        if (n == 0) return m;
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return getMinStepsToConvertAToB(a, b, m - 1, n - 1);
        }
        return 1 + min(
                getMinStepsToConvertAToB(a, b, m, n - 1), // Insert
                getMinStepsToConvertAToB(a, b, m - 1, n), // remove
                getMinStepsToConvertAToB(a, b, m - 1, n - 1) //replace
        );
    }

    static int min(int x, int y, int z) {
        if (x <= y && x <= z) {
            return x;
        }
        if (y <= x && y <= z) {
            return y;
        }
        return z;
    }
}
