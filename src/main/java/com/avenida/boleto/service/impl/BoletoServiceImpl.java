package com.avenida.boleto.service.impl;

import com.avenida.boleto.model.Boleto;
import com.avenida.boleto.repository.BoletoRepository;
import com.avenida.boleto.service.BoletoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletoServiceImpl implements BoletoService {
    BoletoRepository boletoRepository;

    public BoletoServiceImpl(BoletoRepository boletoRepository) {
        this.boletoRepository = boletoRepository;
    }

    @Override
    public String createBoleto(Boleto boleto) {
        boletoRepository.save(boleto);

        return "Successfully saved boleto";
    }

    @Override
    public String updateBoleto(Boleto boleto) {
        boletoRepository.save(boleto);

        return "Successfully updated boleto";
    }

    @Override
    public String deleteBoleto(Integer id) {
        boletoRepository.deleteById(id);

        return "Successfully deleted boleto";
    }

    @Override
    public Boleto getBoleto(Integer id) {
        Optional<Boleto> boleto = boletoRepository.findById(id);

        return boleto.orElse(null);
    }

    @Override
    public List<Boleto> getAllBoletos() {
        List<Boleto> boletos = boletoRepository.findAll();

        if (!boletos.isEmpty()) {
            return boletos;
        }

        return null;
    }
}
