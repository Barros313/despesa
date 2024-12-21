package com.avenida.boleto.exception;

public class BoletoNotFoundException extends RuntimeException {
    public BoletoNotFoundException(String message) {
        super(message);
    }

    public BoletoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
