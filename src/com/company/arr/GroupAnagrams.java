package com.company.arr;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strings){

        Map<String, List<String>> mp = new HashMap<>();

        for(String s: strings){
            String key = sortString(s);
            List<String> tmp = mp.getOrDefault(key, new ArrayList<>());
            tmp.add(s);
            mp.put(key, tmp);
        }
        return new ArrayList<>(mp.values());
    }

    private static String sortString(String s) {
        char[] tempArr = s.toCharArray();
        Arrays.sort(tempArr);
        return new String(tempArr);
    }
}
