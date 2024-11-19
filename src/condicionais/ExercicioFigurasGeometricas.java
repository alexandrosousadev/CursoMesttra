package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFigurasGeometricas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float a, b, c;
        float areaTruanguloRetangulo;

        System.out.println("Digite o Valor de A: ");
        a = sc.nextFloat();

        System.out.println("Digite o Valor de B: ");
        b = sc.nextFloat();

        System.out.println("Digite o Valor de C: ");
        c = sc.nextFloat();

        areaTruanguloRetangulo = (a*c) / 2;
        System.out.println("A área do triangulo retângulo é: " + areaTruanguloRetangulo);









    }

}
