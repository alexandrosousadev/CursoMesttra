package condicionais;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //3-Faça um algoritmo para receber um número qualquer e
//informar na tela se é par ou ímpar.

//        Scanner teclado;
//        int valor;
//        boolean ehImpar;
//
//        teclado = new Scanner(System.in);
//
//        System.out.print("Digite um valor qualquer: ");
//        valor = teclado.nextInt();
//
//
//        try {
//            ehImpar = (valor % 2 != 0);
//            if (ehImpar) {
//                System.out.println("O número é ímpar.");
//            } else {
//                System.out.println("O número " + valor + " é par.");
//            }
//
//        } catch (Exception e) {
//            System.out.println("Erro ao processar o valor: " + e.getMessage());
//        }
//
//
//    }
//

//        Scanner teclado;
//        int a, b;
//        int c;
//
//        teclado = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro valor: ");
//        a = teclado.nextInt();
//
//        System.out.print("Digite o segundo valor: ");
//        b = teclado.nextInt();
//
//        System.out.print("Digite o terceiro valor: ");
//        c = teclado.nextInt();
//
//        try{
//        if (a + b < c) {
//            System.out.println("A soma de A + B é menor C");
//        } else {
//            System.out.println("A soma de A + B não é menor C");
//        }
//
//        }catch
//        (Exception e){
//        System.out.println("Erro ao processar o valor: " + e.getMessage());
//
//        }
//



//        Scanner teclado;
//        int valor = 0, resultado;
//        boolean ehImpar;
//
//        teclado = new Scanner(System.in);
//
//
//        try{
//        System.out.print("Digite um valor qualquer: ");
//        valor = teclado.nextInt();
//
//        }catch (Exception e){
//        return;
//        }
//
//
////       ehImpar = (valor % 2 != 0);
//////
//////        if (ehImpar) {
//////            resultado = valor + 8;
//////        } else {
//////            resultado = valor + 5;
//////        }
////
////         resultado = ehImpar ? valor + 8 :  valor + 5;
////
////
////        System.out.println("Resultado: " + resultado);


        Scanner teclado;
        int valor = 0, resultado = 0;

        teclado = new Scanner(System.in);
        System.out.print("Digite um valor qualquer: ");

        try {
        valor = teclado.nextInt();

        }catch (Exception e) {

        }


        // negativo
        if (valor < 0) {
            resultado = valor * 3;
            // positivo
        } else if (valor > 0) {
            resultado = valor * 2;
        }

        if (resultado != 0) {
            System.out.println("Resultado: " + resultado);
        }


    }
}

