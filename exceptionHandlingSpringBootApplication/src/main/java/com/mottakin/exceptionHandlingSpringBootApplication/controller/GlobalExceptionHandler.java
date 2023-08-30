package com.mottakin.exceptionHandlingSpringBootApplication.controller;

import com.mottakin.exceptionHandlingSpringBootApplication.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
   /* @ExceptionHandler({Exception.class})
    public String handleException() {
        return "Exception";
    }*/
    @ExceptionHandler({CustomExceptionTwo.class})
    public ResponseEntity<?> handleException() {
        return new ResponseEntity<>(new CustomExceptionTwo().getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({sortageOfMoneyCustomException.class})
    public ResponseEntity<?> handleExceptionTwo() {
        return new ResponseEntity<>(new sortageOfMoneyCustomException().getMessage(),HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({OddNumberCustomException.class})
    public ResponseEntity<?> handleExceptionOne() {
        return new ResponseEntity<>(new OddNumberCustomException().getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> handleArithmeticException() {
        return new ResponseEntity<>(new CustomException().getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({arrayCustomException.class})
    public ResponseEntity<?> handleArrayException() {
        return new ResponseEntity<>(new arrayCustomException().getMessage(), HttpStatus.BAD_REQUEST);
    }
}
