package com.projeto_personal_wallet;

import java.sql.Connection;
import java.util.List;
import java.time.LocalDate;

public class Transacao {
    private Integer identificador;
    private String origem;
    private String destino;
    private LocalDate dataCriacao;
    private Double valor;

    public Transacao(String origem, String destino, Double valor) {
        this.identificador = geradorIdentificador();
        this.origem = origem;
        this.destino = destino;
        this.dataCriacao = LocalDate.now();
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return ("Transação: " + this.identificador
                + " no valor de " + this.valor
                + " realizada em " + this.dataCriacao
                + " de " + this.origem
                + " para " + this.destino);
    }
}
