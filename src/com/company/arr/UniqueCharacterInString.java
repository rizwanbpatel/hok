package com.company.arr;

import java.util.Scanner;

public class UniqueCharacterInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(isUniqueChars(word));
    }

    /**
     * The below solution fails on the aab bba kind of input the complexity of the metho is O(n^2)
     *
     * @param str
     * @return
     */
    private static boolean isUniqueCharsFailing(String str) {
        boolean containsUnique = false;

        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                containsUnique = true;
            } else {
                containsUnique = false;
            }
        }

        return containsUnique;
    }


    private static boolean isUniqueChars(String str) {
        if (str.length() > 256) {
            return false;
        }

        int holder = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((holder & (1 << val)) > 0)
                return false;
            holder |= 1 << val;
        }
        return true;
    }

}
