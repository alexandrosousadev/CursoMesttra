import java.util.Scanner;

public class RadarVelocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double velocidade;
        double velocidadeMaxima;

        System.out.println("Digite o velocidade: ");
        velocidade = sc.nextDouble();
        System.out.println("Velocidade Maxima: " );
        velocidadeMaxima = sc.nextDouble();

        velocidadeMaxima = 100;

        if (velocidadeMaxima > 0.7) {
            System.out.println("Passou da velocidade");
        }


    }
}
