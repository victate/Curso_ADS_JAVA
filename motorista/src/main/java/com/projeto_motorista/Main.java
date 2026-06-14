package com.projeto_motorista;

public class Main {

    public static void main(String[] args) {

        GestaoMotoristas gestaoMotoristas = new GestaoMotoristas();

        gestaoMotoristas.setMotoristasDaEmpresa("Anesio", 2010, true);
        gestaoMotoristas.setMotoristasDaEmpresa("Maria das Flores", 2020, true);
        gestaoMotoristas.setMotoristasDaEmpresa("Luís", 2022, false);
        gestaoMotoristas.setMotoristasDaEmpresa("Antônio", 2005, false);
        gestaoMotoristas.setMotoristasDaEmpresa("Gertrude", 2015, true);

        System.out.println(
                "Motoristas com CNH Ativa por tempo de casa: " + gestaoMotoristas.getMotoristasCnhAtiva());
    }
}