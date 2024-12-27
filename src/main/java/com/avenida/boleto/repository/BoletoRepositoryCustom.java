package com.avenida.boleto.repository;

import com.avenida.boleto.model.Boleto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BoletoRepositoryCustom {
    @Query("SELECT b FROM Boleto b WHERE b.vencimento = :vencimento")
    public List<Boleto> findBoletosByDate(@RequestBody String vencimento);
}
