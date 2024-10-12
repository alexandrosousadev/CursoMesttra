package condicionais;

import java.util.Scanner;

public class ValoresIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int c;

        System.out.print("Digite o valor de a: ");
        a = sc.nextInt();

        System.out.print("Digite o valor de b: ");
        b = sc.nextInt();

        if(a == b){
             c = a + b;

        }else {
            c = a * b;
            


        }

        System.out.println("O resultado é: " + c);

    }
}
