package metodos;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        imprimirMenu(); // Exibe o menu

        // Lê a escolha do usuário
        int escolha = lerInt(teclado, "Digite o número correspondente à figura: ");

        // Executa o cálculo da área baseado na escolha do usuário
        switch (escolha) {
            case 1:
                // Quadrado
                float areaQuadrado = calcularAreaQuadrado(teclado);
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            case 2:
                // Retângulo
                float areaRetangulo = calcularAreaRetangulo(teclado);
                System.out.println("A área do retângulo é: " + areaRetangulo);
                break;
            case 3:
                // Círculo
                float areaCirculo = calcularAreaCirculo(teclado);
                System.out.println("A área do círculo é: " + areaCirculo);
                break;
            case 4:
                // Triângulo
                float areaTriangulo = calcularAreaTriangulo(teclado);
                System.out.println("A área do triângulo é: " + areaTriangulo);
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }
    }

    // Método que lê um valor int
    static int lerInt(Scanner teclado, String mensagem) {
        System.out.print(mensagem);
        return teclado.nextInt();
    }

    // Método que lê um valor float
    static float lerFloat(Scanner teclado, String mensagem) {
        System.out.print(mensagem);
        return teclado.nextFloat();
    }

    // Método que calcula a área do quadrado
    static float calcularAreaQuadrado(Scanner teclado) {
        float lado = lerFloat(teclado, "Digite o lado do quadrado: ");
        return lado * lado;
    }

    // Método que calcula a área do retângulo
    static float calcularAreaRetangulo(Scanner teclado) {
        float largura = lerFloat(teclado, "Digite a largura do retângulo: ");
        float altura = lerFloat(teclado, "Digite a altura do retângulo: ");
        return largura * altura;
    }

    // Método que calcula a área do triângulo
    static float calcularAreaTriangulo(Scanner teclado) {
        float base = lerFloat(teclado, "Digite a base do triângulo: ");
        float altura = lerFloat(teclado, "Digite a altura do triângulo: ");
        return (base * altura) / 2;
    }

    // Método que calcula a área do círculo
    static float calcularAreaCirculo(Scanner teclado) {
        float raio = lerFloat(teclado, "Digite o raio do círculo: ");
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    // Método que imprime o menu
    static void imprimirMenu() {
        System.out.println("Escolha a figura: ");
        System.out.println("1: Quadrado");
        System.out.println("2: Retângulo");
        System.out.println("3: Círculo");
        System.out.println("4: Triângulo");
    }
}
