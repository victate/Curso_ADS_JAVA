package com.projeto_motorista_chatgpt;

import java.time.LocalDate;
import java.util.Optional;

class Motorista {
    private Boolean cnhAtiva;
    private Integer anoAdmissao;
    private String nome;
    private Optional<Seguro> seguro;

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
    }

    void setSeguro(Optional<Seguro> seguroAtivo) {
        this.seguro = seguroAtivo;
    }

    Optional<Seguro> getSeguro() {
        return seguro;
    }

    void setAnoAdmissao(Integer anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    Integer getAnoAdmissao() {
        return anoAdmissao;
    }

    void setStatusCNH(Boolean cnhAtiva) {
        this.cnhAtiva = cnhAtiva;
    }

    Boolean isChnAtiva() {
        return cnhAtiva;
    }

    Boolean isSeguroPresente() {
        return seguro.isPresent();
    }

    Boolean isSeguroAtivo() {
        return seguro.get().getSeguroAtivo();
    }

    Integer getAnosEmpresa() {
        Integer todayYear = LocalDate.now().getYear();
        return todayYear - anoAdmissao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getNome();
    }
}
