package com.company.date;

import java.util.Date;

final class ExpiryDateNonNegative {
    private final static long EXP_TIME = new Date().getTime() + 2 * 24 * 60 * 60 * 1000;
    private final static Date EXP_DATE = new Date(EXP_TIME);


    public static void main(String[] args) {
        System.out.println(EXP_DATE);

    }
}
