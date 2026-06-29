package com.projeto_personal_wallet;

import java.lang.foreign.Linker.Option;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Carteira {
    private Integer identificador;
    private Double saldo;
    private LocalDate dataCriacao;
    private List<Transacao> extrato = new ArrayList<>();
    private List<String> chaves = new ArrayList<>();

    public Carteira() {
        this.identificador = geradorIdentificador();
        this.saldo = 0.0;
        this.dataCriacao = LocalDate.now();
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Double getSaldo() {
        return saldo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public List<Transacao> getExtrato() {
        return extrato;
    }

    public List<String> getChavesPix() {
        return chaves;
    }

    public void addChavePix(String chave) {
        this.chaves.add(chave);
    }

    public void removeChavePix(String chave) {
        this.chaves.remove(chaves.indexOf(chave));
    }

    public Boolean validarPix(String origem, String destino) {
        return (chaves.stream().anyMatch(chave -> origem.matches(chave))
                ^ chaves.stream().anyMatch(chave -> destino.matches(chave)));
    }

    public Boolean validarFluxo(String origem) {
        return chaves.stream().anyMatch(chave -> origem.matches(chave));
    }

    public Boolean validarSaldo(Double valor) {
        return (this.saldo >= valor);
    }

    public void addTransacao(Transacao transacao) {
        this.extrato.add(transacao);
        this.saldo = this.saldo + transacao.getValor();
    }

    public String getTransacao(Integer identificador) {
        Optional<Transacao> transacaoOptional = this.extrato.stream()
                .filter(transacao -> (transacao.getIdentificador().equals(identificador))).findFirst();
        return (transacaoOptional.isPresent() ? transacaoOptional.get().toString() : "Transação não encontrada!");
    }
}
