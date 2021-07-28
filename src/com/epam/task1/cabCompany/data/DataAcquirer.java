package com.epam.task1.cabCompany.data;

import com.epam.task1.cabCompany.exception.InputDataTypeException;
import com.epam.task1.cabCompany.exception.InputStreamConsoleException;
import com.epam.task1.cabCompany.exception.NegativeValueException;

public interface DataAcquirer {

    int getIntegerNumber(String message) throws NegativeValueException, InputStreamConsoleException, InputDataTypeException;

    int getPrice() throws NegativeValueException, InputStreamConsoleException, InputDataTypeException;
}
