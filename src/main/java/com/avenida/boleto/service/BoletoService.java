package com.avenida.boleto.service;

import com.avenida.boleto.model.Boleto;

import java.util.Date;
import java.util.List;

public interface BoletoService {
    public String createBoleto(Boleto boleto);
    public String updateBoleto(Boleto boleto);
    public String deleteBoleto(Integer id);
    public Boleto getBoleto(Integer id);
    public List<Boleto> getAllBoletos();
    public List<Boleto> getBoletoByVencimento(Date vencimento);
}
