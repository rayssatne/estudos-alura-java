package br.com.alura.bytebank.teste;

import br.com.alura.bytebank.modelo.ContaCorrente;
import br.com.alura.bytebank.modelo.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        //Object cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        //println(cliente);
    }

    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}

    static void println(Object referencia) {
    }

}