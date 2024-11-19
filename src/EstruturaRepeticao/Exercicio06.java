package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int numero;

        int contPositivo = 0;
        int contNegativo = 0;

        for(int i = 0 ; i< 5; i++){
            System.out.println("Digite um numero : ");
            numero = sc.nextInt();
            if(numero > 0){
                contPositivo++;

            }else if(numero < 0) {
                contNegativo++;
            }

        }
            System.out.println("Total de números positivos: " + contPositivo);
            System.out.println("Total de números negativos: " + contNegativo);
            sc.close();
    }
}
