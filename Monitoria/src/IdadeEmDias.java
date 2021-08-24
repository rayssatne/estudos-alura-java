//Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
//
//Obs.: apenas para facilitar o cálculo, considere
// todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que
//  permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de
//  testar raciocínio matemático simples.
//


import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int diasIdade;
        int anos;
        int meses;
        int dias;

        System.out.println("Digite a quantidade de dias: ");
        diasIdade = scan.nextInt();

        anos = diasIdade / 365;
        meses = (diasIdade % 365) / 30;
        dias = (diasIdade % 365) % 30 ;

        System.out.println(anos + " anos");
        System.out.println(meses + " meses");
        System.out.println(dias + " dias");







    }
}
