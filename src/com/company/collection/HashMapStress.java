package com.company.collection;

import java.util.HashMap;
import java.util.Map;

final class HashMapStress {

    public static void main(String[] args) {
        Map<Headphone, Headphone> headphoneMap = new HashMap<>();

        populateMap(headphoneMap);

        final Headphone headphone = headphoneMap.get(1);

        System.out.println(headphone);

    }

    private static void populateMap(Map<Headphone, Headphone> headphoneMap) {
        for (int i = 0; i < 14; i++) {
            Headphone headphone = new Headphone(i,i+100d, "Brand "+i, "Cat "+i);
            if(i == 12){
                System.out.println("test");
            }
            headphoneMap.put(headphone, headphone);
        }
    }


}
