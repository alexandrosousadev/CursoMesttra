package condicionais;

import java.util.Scanner;

public class LerValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite o valor de a: ");
            a = sc.nextInt();

        System.out.println("Digite o valor de b: ");
            b = sc.nextInt();

        System.out.println("Digite o valor de c: ");
            c = sc.nextInt();

         int soma = a + b;

        if(soma < c ){
            System.out.println("É menor que c: " + "A soma deu " + soma);
        }else{
            System.out.println(" É maior que c : "+ "A soma deu " + soma);
        }




    }
}
