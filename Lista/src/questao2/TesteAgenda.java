package questao2;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        String nome1 = "Mingau";
        String nome2 = "Bolinho";
        String nome3 = "Sushi";

        int idade1 = 9;
        int idade2 = 5;
        int idade3 = 2;


        float altura1 = 0.45f;
        float altura2 = 0.40f;
        float altura3 = 0.50f;


        agenda.armazenaPessoa(nome1, idade1, altura1);
        agenda.armazenaPessoa(nome2, idade2, altura2);
        agenda.armazenaPessoa(nome3, idade3, altura3);


        agenda.removePessoa(nome3);

        agenda.buscaPessoa(nome2);

        agenda.imprimeAgenda();

        agenda.imprimePessoa(0);

    }
}
