package metodos;

import java.util.Scanner;

public class Ex01Metodos {   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int a = lerInt(teclado, "Digite o primeiro valor: ");
        int b = lerInt(teclado, "Digite o segundo valor: ");
        int c = lerInt(teclado, "Digite o terceiro valor: ");


        mostrarResultado(a, b, c);
    }


    static int lerInt(Scanner teclado, String mensagem) {
        System.out.print(mensagem);
        return teclado.nextInt();
    }


    static void mostrarResultado(int a, int b, int c) {
        if (a + b < c) {
            System.out.println("A soma de A + B é menor que C");
        } else {
            System.out.println("A soma de A + B não é menor que C");
        }
    }
}
