package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int somaPar = 0,somaImpar= 0 ;
        int contadorpares = 0;
        int contadorimpares = 0;

        String resposta;


       do {

           System.out.print("Digite um valor inteiro: ");
           numero = sc.nextInt();

           if (numero % 2 == 0) {
               System.out.println("O numero é Par ");
              somaPar += numero;
                contadorpares++;
           }else {
               System.out.println("O numero é Impar");
              somaImpar += numero;
                contadorimpares++;
           }

           System.out.println("Deseja enserir outro numero(sim/Não? ");
            resposta = sc.next();

       }
       while (resposta.equalsIgnoreCase("Sim")  );

        if (contadorpares > 0) {
            int mediaPares = somaPar / contadorpares;
            System.out.println("Média dos pares: " + mediaPares);
            
        } else {
            System.out.println("Nenhum número par foi inserido.");
        }

        if (contadorimpares > 0) {
            int mediaImpar = somaImpar / contadorimpares;
            System.out.println("Média dos ímpares: " + mediaImpar);
        } else {
            System.out.println("Nenhum número ímpar foi inserido.");
        }


        int mediaPares = somaPar / contadorpares;
       int mediaImpar = somaImpar / contadorimpares;

        System.out.println("Media dos pares sao: " + mediaPares);
        System.out.println("Media dos impares sao: " + mediaImpar);




    }

}
