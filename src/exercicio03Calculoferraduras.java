import java.util.Locale;
import java.util.Scanner;

public class exercicio03Calculoferraduras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float valorFerradura;
        int cavalos;

        System.out.println("Informe a quantidade de cavalos: ");
        cavalos = sc.nextInt();

        System.out.println("Informe o valor de cada ferradura R$: ");
        valorFerradura = sc.nextFloat();

        int quantidadeFerraduras = cavalos * 4;
        float valorTotal = quantidadeFerraduras * valorFerradura;

        System.out.println("A quantidade de ferraduras necessárias são: " + quantidadeFerraduras);
        System.out.println("Valor total para compra das ferraduras: R$ " + valorTotal);
    }
}
