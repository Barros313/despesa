package com.avenida.boleto.exception;

public class BoletoWrongFormatException extends RuntimeException {
    public BoletoWrongFormatException(String message) {
        super(message);
    }

    public BoletoWrongFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
