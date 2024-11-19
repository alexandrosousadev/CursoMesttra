package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja continuar? (S/N): ");
        char continuar = sc.next().charAt(0);

        do {

            System.out.println("Deseja continuar? (S/N): ");
            continuar = sc.next().charAt(0);
        }
        while (continuar == 'S'); {

        }
        sc.close();
    }
}
