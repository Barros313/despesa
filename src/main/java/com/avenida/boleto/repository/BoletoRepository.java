package com.avenida.boleto.repository;

import com.avenida.boleto.model.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BoletoRepository extends JpaRepository<Boleto, Integer> {
    List<Boleto> getBoletoByVencimento(Date vencimento);
}
