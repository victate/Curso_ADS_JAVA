package com.projeto_motorista;

import java.time.LocalDate;

class Motorista {
    private Boolean cnhAtiva;
    private Integer anoAdmissao;
    private String nome;

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return nome;
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

    Integer getAnosEmpresa() {
        Integer todayYear = LocalDate.now().getYear();
        return todayYear - anoAdmissao;
    }
}
