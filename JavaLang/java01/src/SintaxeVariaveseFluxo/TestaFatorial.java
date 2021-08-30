package SintaxeVariaveseFluxo;

public class TestaFatorial {
    public static void main(String[] args) {

        int fatorial = 1;

        System.out.println("Fatorial de 0 = 1");

        for (int contador = 1; contador <= 10; contador++) {
            fatorial *= contador;
            System.out.println("Fatorial de " + contador + " = " + fatorial);
        }
    }
}
 /*public static void main(String[] args) {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
    }*/