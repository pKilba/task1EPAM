package com.epam.task1.cabCompany.data;

import com.epam.task1.cabCompany.exception.InputStreamConsoleException;
import com.epam.task1.cabCompany.exception.NegativeValueException;
import com.epam.task1.cabCompany.exception.InputDataTypeException;
import com.epam.task1.cabCompany.validator.DataValidator;
import com.epam.task1.cabCompany.view.MessagePrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer {

    private final String INPUT_PRICE_MESSAGE = "Введите цену автомобиля";
    private final BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    private final MessagePrinter MESSAGE_PRINTER = new MessagePrinter();


    public int getIntegerNumber(String message) throws NegativeValueException, InputStreamConsoleException, InputDataTypeException {
        DataValidator dataValidator = new DataValidator();
        MESSAGE_PRINTER.printInputAnIntegerNumber(message);
        int number = 0;
        try {
            number = Integer.parseInt(BF.readLine());
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

        return getIntegerNumber(INPUT_PRICE_MESSAGE);
    }


    public void ensureClosingResources() {
        try {
            BF.close();
            MESSAGE_PRINTER.printInfoAboutClose(true);
        } catch (IOException e) {
            MESSAGE_PRINTER.printInfoAboutClose(false);
            e.printStackTrace();
        }
    }

}
