package com.company;

class ObjectComparator{

    public boolean compare(int i1, int i2) {
        return i1 == i2;
    }

    public boolean compare(String a, String b) {
       return a.equals(b);
    }

    public boolean compare(int[] a, int[] b) {
        if(a.length != b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }



}
