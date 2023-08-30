package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class CustomException extends Exception {
    private static final String MESSAGE = "Arithmetic Exception";

    public CustomException() {
        super(MESSAGE);
    }
}
