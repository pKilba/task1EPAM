package com.epam.task1.cabCompany.exception;

public class NegativeValueException extends Exception {

    @Override
    public String toString() {
        return "Ошибка. Введите число побольше";
    }
}


