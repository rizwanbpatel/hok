package com.company.tomtom;

public class LightBulb {

    public static void main(String[] args) {
        int[] LightOnSequece = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

        System.out.println(computeShiningMoment(LightOnSequece));
    }

    private static int computeShiningMoment(int[] lightOnSequece) {
        int finalCount = 0;
        int totalSum = 0;
        int maxElement = 0;

        for (int i = 0; i < lightOnSequece.length; i++) {
            totalSum = totalSum + lightOnSequece[i];
            maxElement = Math.max(lightOnSequece[i], maxElement);
            if(totalSum == (maxElement * (maxElement+1))/2){
                finalCount++;
            }
        }
        return finalCount;
    }
}
