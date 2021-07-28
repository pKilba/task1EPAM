package com.epam.task1.cabCompany.data.impl;

import com.epam.task1.cabCompany.data.DataAcquirer;
import com.epam.task1.cabCompany.exception.InputStreamConsoleException;
import com.epam.task1.cabCompany.exception.NegativeValueException;
import com.epam.task1.cabCompany.exception.InputDataTypeException;
import com.epam.task1.cabCompany.validator.DataValidator;
import com.epam.task1.cabCompany.view.impl.ConsoleMessagePrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private final ConsoleMessagePrinter consoleMessagePrinter = new ConsoleMessagePrinter();


    public int getIntegerNumber(String message) throws NegativeValueException, InputStreamConsoleException, InputDataTypeException {
        DataValidator dataValidator = new DataValidator();
        consoleMessagePrinter.printInputAnIntegerNumber(message);
        int number;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            throw new InputDataTypeException();
        } catch (IOException e) {
            throw new InputStreamConsoleException();
        }
        if (dataValidator.checkNegative(number)) {
            throw new NegativeValueException();
        }

        return number;
    }

    public int getPrice() throws NegativeValueException, InputStreamConsoleException, InputDataTypeException {
        String priceMessage = "Введите цену автомобиля";
        return getIntegerNumber(priceMessage);
    }


    public void ensureClosingResources() {
        try {
            bufferedReader.close();
            consoleMessagePrinter.printInfoAboutClose(true);
        } catch (IOException e) {
            consoleMessagePrinter.printInfoAboutClose(false);
            e.printStackTrace();
        }
    }

}
