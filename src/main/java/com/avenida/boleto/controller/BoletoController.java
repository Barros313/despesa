package com.avenida.boleto.controller;

import com.avenida.boleto.model.Boleto;
import com.avenida.boleto.service.BoletoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleto")
public class BoletoController {
    BoletoService boletoService;

    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    @GetMapping("/{id}")
    public Boleto getBoleto(@PathVariable("id") Integer id) {
        return boletoService.getBoleto(id);
    }

    @GetMapping("/all")
    public List<Boleto> getAllBoletos() {
        return boletoService.getAllBoletos();
    }

    @PostMapping
    public String insertBoleto(@RequestBody Boleto boleto) {
        boletoService.createBoleto(boleto);

        return "Boleto inserted successfully";
    }

    @PutMapping
    public String updateBoleto(@RequestBody Boleto boleto) {
        boletoService.updateBoleto(boleto);

        return "Boleto updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteBoleto(@PathVariable("id") Integer id) {
        boletoService.deleteBoleto(id);

        return "Boleto deleted successfully";
    }
}
