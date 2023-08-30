package com.mottakin.exceptionHandlingSpringBootApplication.exception;

public class OddNumberCustomException extends Exception {
    private static final String MESSAGE = "Not a odd number";
    public OddNumberCustomException()
    {
        super(MESSAGE);
    }


}
