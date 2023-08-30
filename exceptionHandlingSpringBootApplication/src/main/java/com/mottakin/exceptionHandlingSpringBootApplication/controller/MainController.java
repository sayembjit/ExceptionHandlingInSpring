package com.mottakin.exceptionHandlingSpringBootApplication.controller;

import com.mottakin.exceptionHandlingSpringBootApplication.exception.*;
import com.mottakin.exceptionHandlingSpringBootApplication.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private CalculationService calculationService;

    @GetMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam Integer a, @RequestParam Integer b) throws ArithmeticException {
        return new ResponseEntity<>(calculationService.divide(a, b), HttpStatus.OK);
    }
    @GetMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam Integer a, @RequestParam Integer b) throws CustomExceptionTwo {
        return new ResponseEntity<>(calculationService.subtract(a,b), HttpStatus.OK);
    }
    @GetMapping("/odd")
    public ResponseEntity<?> odd(@RequestParam Integer a, @RequestParam Integer b) throws OddNumberCustomException {
        return new ResponseEntity<>(calculationService.oddNumber(a,b), HttpStatus.OK);
    }
    @GetMapping("/widrow")
    public ResponseEntity<?> widrow(@RequestParam Integer a, @RequestParam Integer b) throws sortageOfMoneyCustomException {
        return new ResponseEntity<>(calculationService.enoughMoney(a,b), HttpStatus.OK);
    }
    @GetMapping("/array")
    public ResponseEntity<?> array(@RequestParam Integer[] a, @RequestParam Integer b) throws arrayCustomException {
        return new ResponseEntity<>(calculationService.canNotAddInArray(a,b), HttpStatus.OK);
    }

}