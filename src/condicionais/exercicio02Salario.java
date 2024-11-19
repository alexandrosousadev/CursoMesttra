package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float salarioMinimo;
        float salarioFuncionario;

        System.out.println("Informe o salario minimo: ");
        salarioMinimo = sc.nextFloat();

        System.out.println("Informe o salario funcionario: ");
        salarioFuncionario = sc.nextFloat();

        System.out.printf("O funcionário recebe: %.2f salários mínimos!\n", (salarioFuncionario / salarioMinimo));



    }
}
