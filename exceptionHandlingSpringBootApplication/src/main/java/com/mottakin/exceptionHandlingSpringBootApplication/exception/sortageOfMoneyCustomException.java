package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class sortageOfMoneyCustomException extends Exception{
    private static final String MESSAGE = "You do not have enough money to widrow. ";

    public sortageOfMoneyCustomException() {
        super(MESSAGE);
    }

}
