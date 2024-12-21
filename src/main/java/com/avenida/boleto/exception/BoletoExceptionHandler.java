package com.avenida.boleto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BoletoExceptionHandler {

    @ExceptionHandler(value = { BoletoNotFoundException.class })
    public ResponseEntity<Object> handleBoletoNotFoundException(BoletoNotFoundException boletoNotFoundException) {
        BoletoException boletoException = new BoletoException(
                boletoNotFoundException.getMessage(),
                boletoNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(boletoException, HttpStatus.NOT_FOUND);
    }
}
