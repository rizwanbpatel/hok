package com.company.dynamicprog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abhijeet Gulve
 */
public class PowerSet {
    public static void main(String[] args) {

        String[] input = {"a", "b", "c"};
        /**
         * Expected output
         * {
         *   {}
         *   {a}
         *   {b}
         *   {c}
         *   {a,b}
         *   {a,c}
         *   {b,c}
         *   {a,b,c}
         * }
         */
        List<List<String>> res = new ArrayList<>();
        getSubsets(input, res, 0, new ArrayList<>());
        res.forEach(System.out::println);
    }

    private static void getSubsets(String[] input, List<List<String>> res, int level, List<String> currentList) {
        if(level == input.length) {
            res.add(currentList);
        } else {
            List<String> tempList = new ArrayList<>(currentList);
            currentList.add(input[level]);
            getSubsets(input,res,level+1,currentList);
            getSubsets(input,res,level+1,tempList);
        }
       }
}