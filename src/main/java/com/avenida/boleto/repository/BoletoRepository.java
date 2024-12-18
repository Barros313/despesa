package com.avenida.boleto.repository;

import com.avenida.boleto.model.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoRepository extends JpaRepository<Boleto, Integer> {
}
