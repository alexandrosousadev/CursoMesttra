       /*
        Faça um Programa que leia um número e exiba o dia correspondente da semana,
        conforme esta regra: (1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta,
        5 - Quinta, 6 - Sexta e 7 - Sábado).
        Se o usuário digitar outro valor deve aparecer valor inválido.

        */

package condicionais;

import java.util.Scanner;

public class Ex06NumerosDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDaSemana ;

        System.out.println("Digite o numero do dia da semana: ");
        numeroDaSemana = sc.nextInt();

        switch (numeroDaSemana)
        {
            case 1:
                System.out.println("Domingo");
                break;

                case 2:
                    System.out.println("Segunda");
                    break;

                    case 3:
                        System.out.println("Terça");
                        break;

                        case 4:
                            System.out.println("Quarta");
                            break;

                            case 5:
                                System.out.println("Quinta");
                                break;

                                case 6:
                                    System.out.println("Sexta");
                                    break;

                                    case 7:
                                        System.out.println("Sabado");
                                        break;
            default:
                System.out.println("Valor invalido");
        }

    }
}
