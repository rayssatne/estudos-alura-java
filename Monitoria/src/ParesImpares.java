//Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
// quantos valores digitados foram ímpares,
// quantos valores digitados foram positivos e quantos valores digitados foram negativos.

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int negativo = 0;
        int positivo = 0;

        int[] a = new int[5];


        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();

            if (a[i] % 2 == 0){
                par++;

            }else{
                impar++;
            }
            if( a[i] < 0 ){
                negativo++;
            }else{
                positivo++;
            }
        }
        System.out.println("São impares : " + impar + " números");
        System.out.println("São pares : " + par + " números");
        System.out.println("São negativos: " + negativo + " números");
        System.out.println("São positivos: " + positivo + " números");
    }
}
