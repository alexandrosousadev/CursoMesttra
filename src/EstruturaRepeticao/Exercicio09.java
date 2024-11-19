package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contaodor0_25 = 0;
        int contaodor26_50 = 0;
        int contaodor51_75 = 0;
        int contaodor76_100 = 0;

        do{
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();

          if(numero >= 0 && numero <= 25){
              contaodor0_25++;

          }else if(numero >= 26 && numero <= 50){
              contaodor26_50++;

            }else if(numero >= 51 && numero <= 75){
                contaodor51_75++;


          }else if(numero >= 76 && numero <= 100){
              contaodor76_100++;
            }

        }
        while(numero >= 0);

        System.out.println("Quantidade no intervalo 0-25: " + contaodor0_25);
        System.out.println("Quantidade no intervalo 26-50: " + contaodor26_50);
        System.out.println("Quantidade no intervalo 51-75: " + contaodor51_75);
        System.out.println("Quantidade no intervalo 76-100: " + contaodor76_100);





    }
}
