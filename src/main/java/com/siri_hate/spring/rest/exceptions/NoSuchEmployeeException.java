package com.siri_hate.spring.rest.exceptions;

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException(String message) {
        super(message);
    }

}
