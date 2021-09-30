package com.company.arr;

public class Tuple
{

    public static void main(String[] args) {
        int a[]={1,2,-2,5,6,9};

        int max1=a[0];
        int max2=a[1];
        for (int i=2;i<a.length;i++){

            if(max2<a[i]){
                if(max1<max2){
                    max1=max2;
                }
                max2=a[i];
            }else if(max1<a[i]){
                max2=a[i];
            }
        }
        System.out.println(max1+" "+ max2);
    }
}
