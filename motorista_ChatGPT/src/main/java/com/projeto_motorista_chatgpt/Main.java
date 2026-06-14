package com.projeto_motorista_chatgpt;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        GestaoMotoristas gestaoMotoristas = new GestaoMotoristas();

        gestaoMotoristas.setMotoristasDaEmpresa("Anesio", 2010, true, Optional.of(false));
        gestaoMotoristas.setMotoristasDaEmpresa("Maria das Flores", 2020, true, Optional.empty());
        gestaoMotoristas.setMotoristasDaEmpresa("Luís", 2022, false, Optional.of(true));
        gestaoMotoristas.setMotoristasDaEmpresa("Antônio", 2005, false, Optional.empty());
        gestaoMotoristas.setMotoristasDaEmpresa("Gertrude", 2015, true, Optional.of(true));
        gestaoMotoristas.setMotoristasDaEmpresa("João", 2016, true, Optional.of(true));

        System.out.println(
                "Motoristas com CNH Ativa por tempo de casa e com seguro ativo: "
                        + gestaoMotoristas.getMotoristasCnhAtiva().toString());
    }
}