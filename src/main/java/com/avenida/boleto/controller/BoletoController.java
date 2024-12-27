package com.avenida.boleto.controller;

import com.avenida.boleto.model.Boleto;
import com.avenida.boleto.response.ResponseHandler;
import com.avenida.boleto.service.BoletoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/boleto")
public class BoletoController {
    BoletoService boletoService;

    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getBoleto(@PathVariable("id") Integer id) {
        return ResponseHandler.responseBuilder(
                "Boleto encontrado",
                HttpStatus.OK,
                boletoService.getBoleto(id)
        );

    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllBoletos() {
        return ResponseHandler.responseBuilder(
                "Lista de boletos",
                HttpStatus.OK,
                boletoService.getAllBoletos()
        );
    }

    @PostMapping
    public ResponseEntity<Object> insertBoleto(@RequestBody Boleto boleto) {
        return ResponseHandler.responseBuilder(
                "Boleto criado",
                HttpStatus.CREATED,
                boletoService.createBoleto(boleto)
        );
    }

    @PutMapping
    public ResponseEntity<Object> updateBoleto(@RequestBody Boleto boleto) {
        return ResponseHandler.responseBuilder(
                "Boleto atualizado",
                HttpStatus.OK,
                boletoService.updateBoleto(boleto)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteBoleto(@PathVariable("id") Integer id) {
        return ResponseHandler.responseBuilder(
                "Boleto deletado",
                HttpStatus.OK,
                boletoService.deleteBoleto(id)
        );
    }

    @GetMapping("/date")
    public ResponseEntity<Object> getBoletosByDate(@RequestBody Date vencimento) {
        System.out.println(vencimento);
        return ResponseHandler.responseBuilder(
                "Boletos encontrados",
                HttpStatus.OK,
                boletoService.getBoletoByVencimento(vencimento)
        );
    }
}
