package SintaxeVariaveseFluxo;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhando;
        //boolean acompanhando = quantidadePessoas >= 2;

        if(quantidadePessoas >= 2){
            acompanhando = true;
        } else {
            acompanhando = false;
        }

        System.out.println("valor de acompanhando= " + acompanhando);

        if (idade >= 18 && acompanhando){
            System.out.println("seja bem vindo");
        }
        else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}