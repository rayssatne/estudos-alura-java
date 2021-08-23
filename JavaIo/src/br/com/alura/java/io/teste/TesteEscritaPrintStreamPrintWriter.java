package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
//
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osr = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osr);

        PrintWriter ps = new PrintWriter("lorem2.txt","UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("ashuahaugsag assgudgag gagagausgÃÜ");

        ps.close();


    }
}
