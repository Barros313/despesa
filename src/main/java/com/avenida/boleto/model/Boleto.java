package com.avenida.boleto.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name="boleto")
public class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date vencimento;
    private String numero;
    private String beneficiario;
    private Double valor;
    private int parcela;
    private int totalParcela;

    public Boleto() {}

    public Boleto(int id, Date vencimento, String numero, String beneficiario, Double valor, int parcela, int totalParcela) {
        this.id = id;
        this.vencimento = vencimento;
        this.numero = numero;
        this.beneficiario = beneficiario;
        this.valor = valor;
        this.parcela = parcela;
        this.totalParcela = totalParcela;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public int getTotalParcela() {
        return totalParcela;
    }

    public void setTotalParcela(int totalParcela) {
        this.totalParcela = totalParcela;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "id=" + id +
                ", vencimento=" + vencimento +
                ", numero='" + numero + '\'' +
                ", beneficiario='" + beneficiario + '\'' +
                ", valor=" + valor +
                ", parcela=" + parcela +
                ", totalParcela=" + totalParcela +
                '}';
    }
}
