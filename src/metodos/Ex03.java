package metodos;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float fahrenheit= lerFloat(teclado, "Temperatura em fahrenheit:");
        float conversao = converterParaCelcius(fahrenheit);
        System.out.println("Temperatura em celsius: " + conversao);
        teclado.close();
    }

    static float lerFloat(Scanner teclado, String mensagem){
        System.out.print(mensagem);
        return teclado.nextFloat();
    }

    static float converterParaCelcius(float fahrenheit ){
        return (fahrenheit - 32) * 5/9;
    }
}
