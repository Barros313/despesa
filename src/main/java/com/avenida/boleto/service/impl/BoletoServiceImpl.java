package com.avenida.boleto.service.impl;

import com.avenida.boleto.model.Boleto;
import com.avenida.boleto.repository.BoletoRepository;
import com.avenida.boleto.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoletoServiceImpl implements BoletoService {
    BoletoRepository boletoRepository;

    public BoletoServiceImpl(BoletoRepository boletoRepository) {
        this.boletoRepository = boletoRepository;
    }

    @Override
    public String createBoleto(Boleto boleto) {
        return "";
    }

    @Override
    public String updateBoleto(Boleto boleto) {
        return "";
    }

    @Override
    public String deleteBoleto(Integer id) {
        return "";
    }

    @Override
    public Boleto getBoleto(Integer id) {
        return null;
    }

    @Override
    public List<Boleto> getAllBoletos() {
        return List.of();
    }
}
