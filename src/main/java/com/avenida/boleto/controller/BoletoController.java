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
        return boletoService.createBoleto(boleto);;
    }

    @PutMapping
    public String updateBoleto(@RequestBody Boleto boleto) {
        return boletoService.updateBoleto(boleto);
    }

    @DeleteMapping("/{id}")
    public String deleteBoleto(@PathVariable("id") Integer id) {
        return boletoService.deleteBoleto(id);
    }
}
