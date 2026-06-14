package com.projeto_motorista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Comparator;

class GestaoMotoristas {

    private List<Motorista> motoristasDaEmpresa = new ArrayList<>();

    List<Motorista> getMotoristasDaEmpresa() {
        return motoristasDaEmpresa;
    }

    void setMotoristasDaEmpresa(String nome, Integer anoAdmissao, Boolean cnhAtiva) {
        Motorista motorista = new Motorista();
        motorista.setNome(nome);
        motorista.setAnoAdmissao(anoAdmissao);
        motorista.setStatusCNH(cnhAtiva);
        motoristasDaEmpresa.add(motorista);

    }

    List<String> getMotoristasCnhAtiva() {

        List<Motorista> motoristas = getMotoristasDaEmpresa();
        List<String> habilitados;

        Stream<Motorista> motStream = motoristas.stream();

        // Filtrando motoristas com CHN ativa e ordenando por tempo de casa (anos)
        // usando Comparator anônimo
        habilitados = motStream.filter(Motorista::isChnAtiva)
                .sorted(Comparator.comparingInt(Motorista::getAnosEmpresa))
                .map(Motorista::getNome)
                .toList();

        return habilitados;
    }
}
