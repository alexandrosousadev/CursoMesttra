package condicionais;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a Nota 2: ");
        double nota2 = sc.nextDouble();

        double  media =  (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10){
            System.out.println( "Conceito A " + "Media:" + media);
        } else if (media >= 7.5 && media <= 9) {
            System.out.println(media + "Conceito B " + "Media: " + media);

        }
    }
}
