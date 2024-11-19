package metodos;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float reais = lerFloat(teclado, "Digite o valor do reais: ");
        float dolares = converterReaisParaDolares(reais);
        System.out.printf("Valor em Dólares: %.2f\n", dolares);
        teclado.close();

    }

    static float lerFloat(Scanner teclado, String mensagem) {
        System.out.print(mensagem);
        return teclado.nextFloat();
    }

    static float converterReaisParaDolares(float valorReais ){
        float taxaConversao =  0.19f;
        return  valorReais  * taxaConversao ;
    }
}
