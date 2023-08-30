package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class arrayCustomException extends Exception{
    private static final String MESSAGE = "Arithmetic Exception";

    public arrayCustomException() {
        super(MESSAGE);
    }

}
