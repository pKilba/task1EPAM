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
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private MessagePrinter messagePrinter = new MessagePrinter();


    public int getIntegerNumber(String message) throws NegativeValueException, InputStreamConsoleException, InputDataTypeException {
        DataValidator dataValidator = new DataValidator();
        messagePrinter.printInputAnIntegerNumber(message);
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

        return getIntegerNumber(INPUT_PRICE_MESSAGE);
    }


    public void ensureClosingResources() {
        try {
            bufferedReader.close();
            messagePrinter.printInfoAboutClose(true);
        } catch (IOException e) {
            messagePrinter.printInfoAboutClose(false);
            e.printStackTrace();
        }
    }

}
