package SintaxeVariaveseFluxo;

public class TestaMultiploTresAteCem {
    public static void main (String[] args) {

        for (int contador = 1; contador < 100; contador++ ){
            if (contador % 3 == 0)    {
                System.out.println(contador);
            }
        }
    }
}

/*public static void main (String[] args) {
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
    }*/