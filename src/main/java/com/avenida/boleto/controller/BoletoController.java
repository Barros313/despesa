package com.avenida.boleto.controller;

import com.avenida.boleto.model.Boleto;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/boleto")
public class BoletoController {

    Boleto boleto;

    @GetMapping("/{id}")
    public Boleto fetchBoleto(Integer id) {
        return boleto;
    }

    @PostMapping
    public String insertBoleto(@RequestBody Boleto boleto) {
        this.boleto = boleto;

        return "Boleto inserted successfully";
    }

    @PutMapping
    public String updateBoleto(@RequestBody Boleto boleto) {
        this.boleto = boleto;

        return "Boleto updated successfully";
    }

    @DeleteMapping("{id}")
    public String deleteBoleto(Integer id) {
        this.boleto = null;

        return "Boleto deleted successfully";
    }

    private static Date buildDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        return calendar.getTime();
    }
}
