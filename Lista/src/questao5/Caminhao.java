package questao5;

import java.util.ArrayList;

public class Caminhao {

    private String tipo;
    private double cargaAtual = 0;
    ArrayList<Pluviometro> pluviometros = new ArrayList<>();

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void adicionaPluviometro(Pluviometro pluviometro) {
        pluviometros.add(pluviometro);
        cargaAtual += pluviometro.getCapacidade();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}