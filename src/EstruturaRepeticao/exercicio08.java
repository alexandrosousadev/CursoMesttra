package EstruturaRepeticao;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maiorNumero ;
        int menorNumero  ;

        System.out.println("digite o primeiro numero: ");
        numero = sc.nextInt();
        maiorNumero = numero;
        menorNumero = numero;


        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("digite o proximo numero: ");
            numero = sc.nextInt();

            if (numero > maiorNumero) {
               maiorNumero = numero;


            }else if (numero < menorNumero) {
                     menorNumero = numero;
            }


        }

        System.out.println("O maior numero digitado foi: " + maiorNumero );
        System.out.println("O menor numero digitado foi: " + menorNumero );
        sc.close();
    }
}
