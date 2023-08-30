package com.mottakin.exceptionHandlingSpringBootApplication.service;

import com.mottakin.exceptionHandlingSpringBootApplication.exception.*;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public Integer divide(Integer a, Integer b) throws ArithmeticException {
        return a / b;
    }

    public Integer subtract(Integer a, Integer b) throws CustomExceptionTwo {
        int result = a - b;
        if (result <= 0) {
            throw new CustomExceptionTwo();
        }
        return result;
    }
    public Integer oddNumber(Integer a, Integer b) throws OddNumberCustomException {
        int result = a - b;
        if (result%2 ==0) {
            throw new OddNumberCustomException();
        }
        return result;
    }
    public Integer enoughMoney(Integer a, Integer b) throws sortageOfMoneyCustomException {
        boolean s = (a<b);
        if (s) {
            throw new sortageOfMoneyCustomException();
        }
        return a-b;
    }
    public Integer canNotAddInArray(Integer[] arr, Integer index) throws arrayCustomException {
        return throw new arrayCustomException();
    }
}

