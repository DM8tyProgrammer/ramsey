package com.ps.ramsey.exception;

/**
 * ParseException
 * Raised when there is error in understanding input token
 */
public class ParseException extends RuntimeException {

    public ParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
