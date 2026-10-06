// Nome: Nicollas Nogueira
// RA: 1252625635
// Exercício 5 - Desvio condicional

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }

        entrada.close();
    }
}
