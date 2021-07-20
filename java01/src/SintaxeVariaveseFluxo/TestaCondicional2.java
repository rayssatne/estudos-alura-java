package SintaxeVariaveseFluxo;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhando = quantidadePessoas >= 2;

        System.out.println("valor de acompanhando= " + acompanhando);

        if (idade >= 18 && acompanhando){
            System.out.println("seja bem vindo");
        }
        else {
            System.out.println("infelizmente você não pode entrar");
        }
    }

}
