package com.company.arr;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] candidates = new String[]{"leets", "leetcode", "leet", "leeds"};
        String lcp = longestCommeonPrefix(candidates);
    }

    // HOrizontal Scanning O(S) - S sum of all characters in all string Space : O(1)
    private static String longestCommeonPrefix(String[] candidates) {
        if (candidates.length == 0) return "";
        String prefix = candidates[0];
        for (int i = 1; i < candidates.length; i++) {
            while (candidates[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    //Vertical Scanning
    //Compare characters from tom to bottom on the same column before move to next

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public String longestCommonPref(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
