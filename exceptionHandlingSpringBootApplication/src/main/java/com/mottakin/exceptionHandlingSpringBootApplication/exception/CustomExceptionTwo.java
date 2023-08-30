package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class CustomExceptionTwo extends Exception {
    private static final String MESSAGE = "Subtraction Exception";

    public CustomExceptionTwo() {
        super(MESSAGE);
    }
}
