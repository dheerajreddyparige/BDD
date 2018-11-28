package com.capg.trg.exception;

@SuppressWarnings("serial")
public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String msg) {
        super(msg);
    }

}