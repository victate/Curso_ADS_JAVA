package com.projeto_personal_wallet;

import java.sql.Date;
import java.util.Optional;

class Usuario {

    private String nomeCompleto;
    private Integer cpf;
    private Date dataNascimento;
    private Carteira carteira;

    public Usuario(String nomeCompleto, Integer cpf, Date dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return this.nomeCompleto;
    }

    public Integer getCPF() {
        return this.cpf;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void atualizarNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void criarCarteira() {
        this.carteira = new Carteira();
    }

    public Boolean encerrarCarteira() {
        if (this.carteira.getSaldo() == 0.0) {
            this.carteira = null;
            return true;
        } else {
            return false;
        }
    }

    public Boolean criarTransacao(String origem, String destino, Double valor) {

        Transacao transacao;
        Optional<Transacao> transacaoOptional = Optional.of(null);

        if (this.carteira.validarPix(origem, destino).booleanValue()) {
            if (this.carteira.validarFluxo(origem).booleanValue()) {
                if (this.carteira.validarSaldo(valor).booleanValue()) {
                    transacao = new Transacao(origem, destino, valor * -1);
                    this.carteira.addTransacao(transacao);
                    transacaoOptional = Optional.of(transacao);
                }
            } else {
                transacao = new Transacao(origem, destino, valor);
                this.carteira.addTransacao(transacao);
                transacaoOptional = Optional.of(transacao);
            }
        }
        return transacaoOptional.isPresent();
    }
}
