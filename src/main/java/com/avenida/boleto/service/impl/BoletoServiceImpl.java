package com.avenida.boleto.service.impl;

import com.avenida.boleto.exception.BoletoNotFoundException;
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
        // FIXME: Handle the case where the boleto is not saved in the database
        Boleto savedBoleto = boletoRepository.save(boleto);

        if (savedBoleto == null) {
            throw new BoletoNotFoundException("Failed to save: boleto not saved");
        }

        return "Successfully saved boleto\n\n Boleto: " + savedBoleto.toString();
    }

    @Override
    public String updateBoleto(Boleto boleto) {
        Optional<Boleto> boletoToUpdate = boletoRepository.findById(boleto.getId());

        if (boletoToUpdate.isEmpty()) {
            throw new BoletoNotFoundException("Failed to update: boleto not found");
        }

        boletoRepository.save(boleto);

        return "Successfully updated boleto";
    }

    @Override
    public String deleteBoleto(Integer id) {
        Optional<Boleto> boleto = boletoRepository.findById(id);

        if (boleto.isEmpty()) {
            throw new BoletoNotFoundException("Failed to delete: boleto not found");
        }

        boletoRepository.deleteById(id);

        return "Successfully deleted boleto";
    }

    @Override
    public Boleto getBoleto(Integer id) {
        Optional<Boleto> boleto = boletoRepository.findById(id);

        if (boleto.isEmpty()) {
            throw new BoletoNotFoundException("Boleto not found");
        }

        return boleto.get();
    }

    @Override
    public List<Boleto> getAllBoletos() {
        return boletoRepository.findAll();
    }
}
