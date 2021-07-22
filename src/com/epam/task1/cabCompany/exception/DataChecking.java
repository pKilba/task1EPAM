package com.epam.task1.cabCompany.exception;

public class DataChecking {

    public static boolean negativeCheck(long number) {
        if (number < 0)
            return true;
        return false;
    }

}
