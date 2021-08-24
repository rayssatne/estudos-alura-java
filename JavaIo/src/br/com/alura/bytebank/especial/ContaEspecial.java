package br.com.alura.bytebank.especial;

import br.com.alura.bytebank.modelo.Conta;


public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

}
