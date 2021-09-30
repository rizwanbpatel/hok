package com.company;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Ramesh Dara
 */
public class EnumDemo {

    public static void main(String[] args) {
        System.out.println(getEnumFromString(Directions.class, "North"));
        System.out.println(getEnumFromString(Speed.class,"Slow"));
        //getEnumFromString(Directions.class, "North-East");
    }

    public static <T extends Enum<T>> T getEnumFromString(Class<T> enumClass, String value) {
        if (enumClass == null) {
            throw new IllegalArgumentException("EnumClass value can't be null.");
        }

        for (Enum<?> enumValue : enumClass.getEnumConstants()) {
            if (enumValue.toString().equalsIgnoreCase(value)) {
                return (T) enumValue;
            }
        }

        //Construct an error message that indicates all possible values for the enum.
        StringBuilder errorMessage = new StringBuilder();
        boolean bFirstTime = true;
        for (Enum<?> enumValue : enumClass.getEnumConstants()) {
            errorMessage.append(bFirstTime ? "" : ", ").append(enumValue);
            bFirstTime = false;
        }

        throw new IllegalArgumentException(value + " is invalid value. Supported values are " + errorMessage);
    }


    public enum Speed{
        SLOW(10),
        AVERAGE(40),
        FAST(80);
        int spd = 0;

        Speed(int i) {
            spd = i;
        }
    }
    public enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST;


        @JsonCreator
        public static Directions fromValue(String value) {
            return getEnumFromString(Directions.class, value);
        }

        @JsonValue
        public String toJson() {
            return name().toLowerCase();
        }
    }
}