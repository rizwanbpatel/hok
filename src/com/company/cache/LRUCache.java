package com.company.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private LinkedHashMap<Integer, Integer> map;
    private final int CAP;
    public LRUCache(int capacity){
        this.CAP = capacity;
        map = new LinkedHashMap<Integer, Integer>(this.CAP, 0.7f, true){
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > CAP;
            }
        };
    }

    public int get(int key){
        return map.getOrDefault(key, -1);
    }

    public void set(int key, int val){
        map.put(key, val);
    }
}
