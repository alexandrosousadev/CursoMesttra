        /*
        Exercício 02: Um posto está vendendo combustíveis com a seguinte tabela de descontos: Álcool:
        até 20 litros, desconto de 3% por litro
        acima de 20 litros, desconto de 5% por litro Gasolina:
        até 20 litros, desconto de 4% por litro
        acima de 20 litros, desconto de 6% por litro
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível como um número inteiro
        (codificado da seguinte forma: 1 - álcool, 2 - gasolina), calcule e imprima o valor a ser pago pelo cliente
        sabendo-se que o preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90.
        */


package condicionais;

import java.util.Scanner;

public class PostoDeCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoCombustivel;
        double litrosCombustivel;
        double precoPorLitro = 0;

        double desconto = 0;

        System.out.print("Informe o tipo de combustível (1 - álcool, 2 - gasolina): ");
        tipoCombustivel = sc.nextInt();

        System.out.print("Informe o numero de litros vendidos: ");
        litrosCombustivel = sc.nextDouble();

        if (tipoCombustivel == 1) {
            precoPorLitro = 3.90;

           if (litrosCombustivel <= 20){
               desconto = 3;

           }else {
               desconto = 5;
           }
        }else if (tipoCombustivel == 2) {
            precoPorLitro = 5.50;

        }if (litrosCombustivel > 20) {
            desconto = 4;


        }else {
            desconto = 6;
        }

        double valorTotal = litrosCombustivel * precoPorLitro ;

        double valorDesconto = valorTotal * desconto / 100;

        double valorFinal = valorTotal - valorDesconto;

        System.out.printf("O valor a ser pago é: R$ %.2f " , valorFinal);




    }
}
