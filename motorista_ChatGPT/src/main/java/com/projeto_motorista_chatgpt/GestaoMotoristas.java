package com.projeto_motorista_chatgpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.util.Comparator;

class GestaoMotoristas {

    private List<Motorista> motoristasDaEmpresa = new ArrayList<>();

    List<Motorista> getMotoristasDaEmpresa() {
        return motoristasDaEmpresa;
    }

    void setMotoristasDaEmpresa(String nome, Integer anoAdmissao, Boolean cnhAtiva, Optional<Boolean> seguroAtivo) {
        Motorista motorista = new Motorista();

        motorista.setNome(nome);
        motorista.setAnoAdmissao(anoAdmissao);
        motorista.setStatusCNH(cnhAtiva);

        if (seguroAtivo.isPresent()) {
            Seguro seguro = new Seguro();
            seguro.setSeguroAtivo(seguroAtivo.get());
            motorista.setSeguro(Optional.of(seguro));
        } else {
            motorista.setSeguro(Optional.empty());
        }

        motoristasDaEmpresa.add(motorista);
    }

    List<Motorista> getMotoristasCnhAtiva() {

        List<Motorista> habilitados = getMotoristasDaEmpresa().stream()
                .filter(Motorista::isChnAtiva)
                .filter(Motorista::isSeguroPresente)
                .filter(Motorista::isSeguroAtivo)
                .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
                .toList();

        return habilitados;
    }
}
