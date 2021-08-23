package questao4;

//4. Crie uma classe Televisão e uma classe Controle Remoto que pode controlar o volume e trocar os
//        canais da televisão. O controle de volume permite:
//        - Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//        - Aumentar e diminuir o número do canal em uma unidade.
//        - Trocar para um canal indicado;
//        - Consultar o valor do volume de som e o canal selecionado.

public class ControleRemoto implements Televisao {

    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private int canal;

    //METODOS

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.canal = 1;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }

    private int getVolume (){
        return this.volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    public int getCanal() { return canal;  }

    public void setCanal(int canal) { this.canal = canal; }

    public void ligar() {
        this.setLigado(true);
    }

    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+ 1);
        }
        else{
            System.out.println("Impossivel aumentar o volume!");
        }
    }
    @Override
    public void diminuirVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Impossivel diminuir o volume!");
        }
    }
    @Override
    public void aumentarCanal(){
        if(this.getLigado()){
            this.setCanal(this.getCanal() + 1);
        }
        else{
            System.out.println("Impossivel trocar o canal!");
        }
    }
    @Override
    public void diminuirCanal(){
        if (this.getLigado()){
            this.setCanal(this.getCanal() - 1);
        }
        else{
            System.out.println("Impossivel trocar o canal!");
        }
    }

    @Override
    public void selecionarCanal(int canal) {
        if (this.getLigado()) {
            this.setCanal(canal);
        }
        else{
            System.out.println("Impossivel trocar o canal!");
        }

    }

    @Override
    public void abrirMenu() {
        System.out.println("\n----- MENU -----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Canal: " + this.getCanal());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print(" | ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\n\nFechando menu!");
    }

}