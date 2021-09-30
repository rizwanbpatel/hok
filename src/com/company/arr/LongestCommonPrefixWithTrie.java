package com.company.arr;


public class LongestCommonPrefixWithTrie {

    static class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean isLeaf;

        public TrieNode() {
            isLeaf = false;
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

    static TrieNode root;
    static int indexs;

    static void insert(String key) {
        int length = key.length();
        int index;

        TrieNode pCrawl = root;
        for (int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (pCrawl.child[index] == null) {
                pCrawl.child[index] = new TrieNode();
            }
            pCrawl = pCrawl.child[index];
        }
        pCrawl.isLeaf = true;
    }

    static int countChild(TrieNode node) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (node.child[i] != null) {
                count++;
                indexs = i;
            }
        }
        return count;
    }

    static String walkTrie() {
        TrieNode pCrawl = root;
        indexs = 0;
        String prefix = "";
        while (countChild(pCrawl) == 1 && !pCrawl.isLeaf) {
            pCrawl = pCrawl.child[indexs];
            prefix += (char) ('a' + indexs);
        }
        return prefix;
    }

    static void constructTrie(String[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        return;
    }

    static String commonPrefix(String[] arr, int n){
        root = new TrieNode();
        constructTrie(arr, n);
        return walkTrie();
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks","geeks","geek","geezer"};
        int n = arr.length;
        String ans = commonPrefix(arr
        , n);
        if(ans.length() != 0){
            System.out.println(ans);
        }else
            System.out.println("No");
    }

}
