package metodos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double centimetros = lerFloat(teclado, "\nDigite o valor do centimetro: ");

        menu();


        int opcao = lerInt(teclado, "\nDigite a opção desejada: ");

        DecimalFormat df = new DecimalFormat("#.##");

        switch (opcao) {
            case 1: double metros = calcularMetros(centimetros);
            System.out.println(centimetros + " centímetros é igual a " + df.format(metros)  + " metros.");
            break;

            case 2:
                double quilometros = quilometros(centimetros);
                System.out.println(centimetros + " centímetros é igual a " + df.format(quilometros) + " quilômetros.");
                break;
            case 3:
                double milhas = milhas(centimetros);
                System.out.println(centimetros + " centímetros é igual a " + df.format(milhas) + " milhas.");
                break;
            case 4:
                double jardas = jardas(centimetros);
                System.out.println(centimetros + " centímetros é igual a " + df.format(jardas) + " jardas.");
                break;
            case 5:
                double pes = pes(centimetros);
                System.out.println(centimetros + " centímetros é igual a " + df.format(pes) + " pés.");
                break;
            case 6:
                double polegadas = polegadas(centimetros);
                System.out.println(centimetros + " centímetros é igual a " + df.format(polegadas) + " polegadas.");
                break;
            default:
                System.out.println("Escolha inválida! Por favor, selecione de 1 a 6.");
                break;



        }
    }

    static int lerInt(Scanner teclado, String mensagem) {
      System.out.println(mensagem);
      return teclado.nextInt();

    }

    static  float lerFloat(Scanner teclado, String mensagem) {
        System.out.println(mensagem);
        return teclado.nextFloat();

    }

    static double calcularMetros(double centimetros) {
        double metros =  centimetros / 100;
        return metros;
    }

    static  double quilometros(double centimetros) {
        double quilometros = centimetros / 100000;
        return quilometros;
    }

    static double milhas(double centimetros) {
        double milhas = centimetros /  160934;
        return milhas;
    }

    static double jardas(double centimetros) {
        double jardas = centimetros /  91.44;
        return jardas;
    }

    static double pes(double centimetros) {
        double pes = centimetros / 30.48;
        return pes;
    }

    static double polegadas(double centimetros) {
        double polegadas = centimetros /  2.54;
        return polegadas;
    }

    static void menu(){
        System.out.println("Para qual unidade deseja converter?\n");
        System.out.println("1 - Metros");
        System.out.println("2 - Quilômetros");
        System.out.println("3 - Milhas");
        System.out.println("4 - Jardas");
        System.out.println("5 - Pés");
        System.out.println("6 - Polegadas");
    }
}
