package questao5;

import java.util.Scanner;

public class Controle {

    public static String leString (){

        Scanner scan = new Scanner(System.in);
        String resposta = scan.nextLine();

        return resposta;
    }

    public static int leInteiro (){

        Scanner scan = new Scanner(System.in);
        int resposta = scan.nextInt();

        return resposta;
    }

    public static double leDouble (){

        Scanner scan = new Scanner(System.in);
        double resposta = scan.nextDouble();

        return resposta;
    }
}
