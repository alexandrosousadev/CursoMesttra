//package EstruturaRepeticao;
//
//import java.util.Scanner;
//
//public class ExercícioDesafio01 {
//    Scanner teclado = new Scanner(System.in);
//    String nome;
//    int posicaoAtual = 0;
//    int posicaoAnterior = 0;
//    int tamanhoNome;
//
//    System.out.print("Digite o nome: ");
//
//        nome = teclado.nextLine();
//
//        tamanhoNome = nome.length();
//
//        String palavra;
//
//
//        do {
//        posicaoAtual = nome.indexOf(" ", posicaoAnterior);
//
//        //para evitar erro quando estiver extraindo
//        //o ultimo sobrenome
//        if (posicaoAtual == -1){
//            posicaoAtual = tamanhoNome;
//        }
//
//        if (palavra.equals("de") || palavra.equals("da") || palavra.equals("do") || palavra.equals("dos") || palavra.equals("das") || palavra.equals("e") ) {
//
//        }else{
//            String primeiraLetra= palavra.substring(0,1).toUpperCase();
//        }
//
//
//        System.out.println(nome.substring(posicaoAnterior, posicaoAtual.trim()));
//        posicaoAnterior = posicaoAtual + 1;
//
//    } while (posicaoAtual <  tamanhoNome);
//}
//
