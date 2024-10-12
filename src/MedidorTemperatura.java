import java.util.Scanner;

public class MedidorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temperatura;
        System.out.println("Digite um temperatura em Celsius: ");
        temperatura = sc.nextInt();

        if (temperatura > 38) {
            System.out.println("Está com febre");
        }
    }
}
