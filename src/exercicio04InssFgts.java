import java.util.Locale;
import java.util.Scanner;

public class exercicio04InssFgts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float salarioInicial,salarioReajustado, salarioFinal;
        float descontoInss, descontoFgts, totalDesconto;


        System.out.print("Informe o salario: ");
        salarioInicial = sc.nextFloat();

        salarioReajustado = (salarioInicial  * 1.15f);
        descontoInss = salarioReajustado * 0.11f;
        descontoFgts = salarioReajustado * 0.08f;
        totalDesconto = descontoInss + descontoFgts;
        salarioFinal = salarioReajustado - totalDesconto;

        System.out.println("salario inicial: " + salarioInicial);
        System.out.println("salario reajustado: " + salarioReajustado);
        System.out.printf("Desconto 11%% INSS: %.2f%n " , descontoInss);
        System.out.printf("Desconto 8%% INSS: %.2f%n " , descontoFgts);
        System.out.println("Total Descontos " + totalDesconto);
        System.out.printf("Salario Final: %.2f%n " , salarioFinal);








    }

}
