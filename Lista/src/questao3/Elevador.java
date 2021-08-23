package questao3;

//3. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de
//um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio
//(desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A
//classe deve também disponibilizar os seguintes métodos: Inicializa : que deve receber como
//parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre
//começam no térreo e vazio); Entra : para acrescentar uma pessoa no elevador (só deve acrescentar
//se ainda houver espaço); Sai : para remover uma pessoa do elevador (só deve remover se houver
//alguém dentro dele); Sobe : para subir um andar (não deve subir se já estiver no último andar);
//Desce : para descer um andar (não deve descer se já estiver no térreo); Encapsular todos os
//atributos da classe (criar os métodos set e get).

public class Elevador {

    private int andarAtual;
    private int numeroAndares;
    private int capacidadeElevador;
    private int pessoasNoElevador;


    public void inicializa(int capacidadeElevador, int numeroAndares) {
        andarAtual = 0;
        pessoasNoElevador = 0;
        this.capacidadeElevador = capacidadeElevador;
        this.numeroAndares = numeroAndares;

        System.out.println("Inicializando o elevador com capacidade de " + capacidadeElevador + " pessoas em um prédio de "
                + numeroAndares + " andares.");
    }

    public void entra() {
        if (pessoasNoElevador < capacidadeElevador) {
            pessoasNoElevador++;
            System.out.println("Pessoa adicionada com sucesso");
        } else {
            System.out.println("Não há capacidade pra adicionar mais pessoas");
        }

    }

    public void sai() {
        if (pessoasNoElevador > 0) {
            pessoasNoElevador--;
            System.out.println("Pessoa saiu do elevador");
        } else {
            System.out.println("Não tem ninguém no elevador");
        }
    }

    public void sobe() {
        if (andarAtual < numeroAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual);
        } else {
            System.out.println("Impossivel subir");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            if (andarAtual == 0) {
                System.out.println("Desceu para o térreo");
            } else {
                System.out.println("Desceu para o  andar " + andarAtual);
            }
        } else {
            System.out.println("Impossivel descer");
        }
    }
}
