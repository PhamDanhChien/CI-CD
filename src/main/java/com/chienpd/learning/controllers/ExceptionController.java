package com.chienpd.learning.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(NullPointerException.class)
    public String nullPointer(Exception ex) {
        ex.printStackTrace();

        return "Exception Handler";
    }
}
