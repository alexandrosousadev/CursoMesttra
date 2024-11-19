//Reescreva o código abaixo para a partir de uma data informada pelo usuário, seja possível extrair o dia o mês e o ano para que o restante do código seja executado.
//
// Lembre-se que o seu código precisa prever a possibilidade do usuário informar uma data no seguinte formato:
//
// 01/02/2024
// 01/2/2024
// 1/02/2024
//1/2/2024
//  01-02-2024
// 01-2-2024
//  1-02-2024
// 1-2-2024
package metodos;

import java.util.Scanner;

public class CodigoDesafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String data;
        int dia, mes, ano;
        boolean anoEhBissexto;

        System.out.print("Digite o data: ");
        data = teclado.nextLine().trim();

        dia = obterDia(data);
        mes = obterMes(data);
        ano = obterAno(data);



        anoEhBissexto = (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));

        // se o dia for 29 e o mes for fevereiro e o ano nao é bissexto
        if (dia == 29 && mes == 2 && !anoEhBissexto) {
            System.out.print("A data é invalida pois o ano nao e bissexto.");
            // o dia e maior que 31
        } else if (dia > 31) {
            System.out.print("A data é invalida pois nao existe dia maior que 31.");
            // quando dia e 31 e (o mes for fevereiro ou abril ou junho ou setembro ou
            // novembro)
        } else if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.print("A data é invalida pois nao existe 31 no mes + " + mes);
            // quando o dia for 30 e o mes fevereiro
        } else if (dia == 30 && mes == 2) {
            System.out.print("A data é invalida pois nao existe 30 de fevereiro.");
            // se o mes for maior que 12
        } else if (mes < 1 || mes > 12) {
            System.out.print("A data é invalida pois os meses deve ser entre 1 e 12");
        } else {
            System.out.print("A data é valida!");
        }

        teclado.close();
    }

    static int obterDia(String data){
        int dia = data.indexOf('/') != -1 ? data.indexOf('/') : data.indexOf('-');

        return Integer.parseInt(data.substring(0, dia).trim());
    }

    static int obterMes(String data){
        int separador1 = data.indexOf('/') != -1 ? data.indexOf('/') : data.indexOf('-');
        int separador2 = data.indexOf('/', separador1 + 1) != -1 ? data.indexOf('/', separador1 + 1)
                : data.indexOf('-', separador1 + 1);

        return Integer.parseInt(data.substring(separador1 + 1, separador2).trim());
    }

    static int obterAno(String data){
        int separador2 = data.lastIndexOf('/') != -1 ? data.lastIndexOf('/') : data.lastIndexOf('-');

        return Integer.parseInt(data.substring(separador2 + 1).trim());
    }
    }

