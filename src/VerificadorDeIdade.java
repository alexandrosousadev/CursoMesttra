import java.util.Scanner;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Pode tirar a Habilitação");
        }else{
            System.out.println("Não Pode tirar a Habilitação");
        }

    }
}
