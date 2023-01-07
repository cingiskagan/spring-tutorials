package com.tutorial.spring.aio.error;

import com.tutorial.spring.aio.error.CustomError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ErrorAdvice {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomError handleException(IllegalArgumentException exp) {
        return CustomError.builder()
                .withDescription(exp.getMessage())
                .withCode(1606)
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CustomError handleException(MethodArgumentNotValidException exp) {
        return CustomError.builder()
                .withDescription("validation error")
                .withCode(1789)
                .withSubErrors(exp.getAllErrors()
                        .stream()
                        .map(se -> CustomError.builder()
                                .withDescription(se.toString())
                                .withCode(1088)
                                .build())
                        .collect(Collectors.toUnmodifiableList())
                )
                .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CustomError handleException(Exception exp) {
        if (exp instanceof NullPointerException) {
            return CustomError.builder()
                    .withDescription("error")
                    .withCode(5005)
                    .build();
        }
        exp.printStackTrace();
        return CustomError.builder()
                .withDescription(exp.getMessage())
                .withCode(5006)
                .build();
    }
}