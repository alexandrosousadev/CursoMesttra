package condicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;


        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print(num + " É Par");
        }else {
            System.out.print(num + " É Impar");
        }
    }
}
