package questao4;

public class TesteControle {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        controle.ligar();
        controle.aumentarVolume();
        controle.selecionarCanal(33);
        controle.aumentarCanal();
        controle.abrirMenu();
        controle.fecharMenu();

    }
}