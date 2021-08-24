package br.com.alura.bytebank.modelo;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}
