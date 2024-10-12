package condicionais;

import java.util.Scanner;

public class EstadoCivil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  nome ;
        String  estadoCivil;
        char sexo;
        int anos ;

        System.out.println("Digite o nome da Pessoa ");
        nome = sc.nextLine();

        System.out.println("Digite o sexo(M/F) ");
        sexo = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("Digite o estado Civil ");
        estadoCivil = sc.nextLine();

         if (sexo == 'F' && estadoCivil.equals("Casada") ) {
            System.out.println("Digite o tempo de casada (em anos): ");
            anos = sc.nextInt();
             System.out.println(nome + " Está " + "Casada " + anos + " anos");
         }

    }
}
