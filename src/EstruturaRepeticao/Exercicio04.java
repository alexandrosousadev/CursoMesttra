package EstruturaRepeticao;

import java.util.Scanner;



public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja continuar? (S/N): ");
        char continuar = sc.next().charAt(0);

       while (continuar == 'S') {
           System.out.println("Deseja continuar? (S/N): ");
            continuar = sc.next().charAt(0);

       }
       sc.close();

    }
}
